
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author fabricio.asantana1
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuFuncionario = new javax.swing.JMenu();
        itmCadastrarFuncionarios = new javax.swing.JMenuItem();
        itmAlterarFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itmBuscarFuncionarios = new javax.swing.JMenuItem();
        itmExcluirFuncionarios = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itmListarFuncionarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu ");
        getContentPane().setLayout(null);

        mnuFuncionario.setText("Funcionarios");

        itmCadastrarFuncionarios.setText("Cadastrar");
        itmCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionario.add(itmCadastrarFuncionarios);

        itmAlterarFuncionarios.setText("Alterar");
        itmAlterarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAlterarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionario.add(itmAlterarFuncionarios);
        mnuFuncionario.add(jSeparator1);

        itmBuscarFuncionarios.setText("Buscar");
        itmBuscarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBuscarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionario.add(itmBuscarFuncionarios);

        itmExcluirFuncionarios.setText("Excluir");
        itmExcluirFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionario.add(itmExcluirFuncionarios);
        mnuFuncionario.add(jSeparator2);

        itmListarFuncionarios.setText("Listar");
        itmListarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListarFuncionariosActionPerformed(evt);
            }
        });
        mnuFuncionario.add(itmListarFuncionarios);

        jMenuBar1.add(mnuFuncionario);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(613, 354));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarFuncionariosActionPerformed
        new CadastrarFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmCadastrarFuncionariosActionPerformed

    private void itmExcluirFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirFuncionariosActionPerformed
        new ExcluirFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmExcluirFuncionariosActionPerformed

    private void itmBuscarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBuscarFuncionariosActionPerformed
        String nome;
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário para buscá-lo:");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root", "");
            
            PreparedStatement st = conectar.prepareStatement("SELECT * FROM funcionario WHERE nome = ?");
            st.setString(1, nome);
            ResultSet funcionario = st.executeQuery();
            
            if (funcionario.next()) {
                String id, nomeFunc, endereco, bairro, cidade, estado, telefone, email;
                
                id = funcionario.getString("id");
                nomeFunc = funcionario.getString("nome");
                endereco = funcionario.getString("endereco");
                bairro = funcionario.getString("bairro");
                cidade = funcionario.getString("cidade");
                estado = funcionario.getString("estado");
                telefone = funcionario.getString("telefone");
                email = funcionario.getString("email");
                
                JOptionPane.showMessageDialog(null,
                        "ID do Funcionário: " + id + "\n"
                        + "Nome: " + nomeFunc + "\n"
                        + "Endereço: " + endereco + "\n"
                        + "Bairro: " + bairro + "\n"
                        + "Cidade: " + cidade + "\n"
                        + "Estado: " + estado + "\n"
                        + "Telefone: " + telefone + "\n"
                        + "E-Mail: " + email
                );
                
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto já cadastrado", "Produto Cadastrado", JOptionPane.WARNING_MESSAGE);
            
        }
        

    }//GEN-LAST:event_itmBuscarFuncionariosActionPerformed

    private void itmAlterarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAlterarFuncionariosActionPerformed
        String nome;
        
        nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionário para buscá-lo:");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root", "");
            
            PreparedStatement st = conectar.prepareStatement("SELECT * FROM funcionario WHERE nome = ?");
            st.setString(1, nome);
            ResultSet funcionario = st.executeQuery();
            
            if (funcionario.next()) {
                String id, nomeFunc, endereco, bairro, cidade, estado, telefone, email;
                
                id = funcionario.getString("id");
                nomeFunc = funcionario.getString("nome");
                endereco = funcionario.getString("endereco");
                bairro = funcionario.getString("bairro");
                cidade = funcionario.getString("cidade");
                estado = funcionario.getString("estado");
                telefone = funcionario.getString("telefone");
                email = funcionario.getString("email");
                
                new AlterarFuncionarios(id, nomeFunc, endereco, bairro, cidade, estado, telefone, email).setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null, "Funcionário não encontrado");
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Produto já cadastrado", "Produto Cadastrado", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_itmAlterarFuncionariosActionPerformed

    private void itmListarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListarFuncionariosActionPerformed
        new ListarFuncionarios().setVisible(true);
    }//GEN-LAST:event_itmListarFuncionariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAlterarFuncionarios;
    private javax.swing.JMenuItem itmBuscarFuncionarios;
    private javax.swing.JMenuItem itmCadastrarFuncionarios;
    private javax.swing.JMenuItem itmExcluirFuncionarios;
    private javax.swing.JMenuItem itmListarFuncionarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuFuncionario;
    // End of variables declaration//GEN-END:variables
}
