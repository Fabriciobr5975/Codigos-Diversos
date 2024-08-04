
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author fabricio.asantana1
 */
public class AlterarFuncionarios extends javax.swing.JFrame {

    /**
     * Creates new form AlterarFuncionarios
     */
    public AlterarFuncionarios() {
        initComponents();
    }

    public AlterarFuncionarios(String id, String nome, String endereco, String bairro, String cidade, String estado, String telefone, String email) {
        initComponents();

        txtId.setText(id);
        txtId.setEnabled(false);
        txtNome.setText(nome);
        txtNome.setEnabled(false);
        txtEndereco.setText(endereco);
        txtBairro.setText(bairro);
        txtCidade.setText(cidade);
        txtEstado.setText(estado);
        txtTelefone.setText(telefone);
        txtEmail.setText(email);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Funcionários");
        getContentPane().setLayout(null);

        lblId.setText("ID");
        getContentPane().add(lblId);
        lblId.setBounds(30, 10, 30, 30);

        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 50, 50, 30);

        lblEndereco.setText("Endereço");
        getContentPane().add(lblEndereco);
        lblEndereco.setBounds(30, 90, 60, 30);

        lblBairro.setText("Bairro");
        getContentPane().add(lblBairro);
        lblBairro.setBounds(30, 130, 50, 30);

        lblCidade.setText("Cidade");
        getContentPane().add(lblCidade);
        lblCidade.setBounds(30, 170, 50, 30);

        lblEstado.setText("Estado");
        getContentPane().add(lblEstado);
        lblEstado.setBounds(30, 210, 50, 30);

        lblTelefone.setText("Telefone");
        getContentPane().add(lblTelefone);
        lblTelefone.setBounds(30, 250, 60, 30);

        lblEmail.setText("E-Mail");
        getContentPane().add(lblEmail);
        lblEmail.setBounds(30, 290, 50, 30);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(100, 290, 470, 30);
        getContentPane().add(txtId);
        txtId.setBounds(100, 10, 470, 30);
        getContentPane().add(txtNome);
        txtNome.setBounds(100, 50, 470, 30);

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(txtEndereco);
        txtEndereco.setBounds(100, 90, 470, 30);
        getContentPane().add(txtBairro);
        txtBairro.setBounds(100, 130, 470, 30);
        getContentPane().add(txtCidade);
        txtCidade.setBounds(100, 170, 470, 30);
        getContentPane().add(txtEstado);
        txtEstado.setBounds(100, 210, 470, 30);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(100, 250, 470, 30);

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        btnAlterar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAlterarKeyPressed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(240, 360, 130, 23);

        setSize(new java.awt.Dimension(619, 431));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String id, nome, endereco, bairro, cidade, estado, telefone, email;

        id = txtId.getText();
        nome = txtNome.getText();
        endereco = txtEndereco.getText();
        bairro = txtBairro.getText();
        cidade = txtCidade.getText();
        estado = txtEstado.getText();
        telefone = txtTelefone.getText();
        email = txtEmail.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/prova", "root", "");

            PreparedStatement st = conectar.prepareStatement("UPDATE funcionario SET nome = ?, endereco = ?, bairro = ?, cidade = ?, estado = ?, telefone = ?, email = ? WHERE nome = ?");

            st.setString(1, nome);
            st.setString(2, endereco);
            st.setString(3, bairro);
            st.setString(4, cidade);
            st.setString(5, estado);
            st.setString(6, telefone);
            st.setString(7, email);
            st.setString(8, nome);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Funcionário Alterado com sucesso");

            dispose();

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());

        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnAlterarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAlterarKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            btnAlterar.doClick();
        }
    }//GEN-LAST:event_btnAlterarKeyPressed

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
            java.util.logging.Logger.getLogger(AlterarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
