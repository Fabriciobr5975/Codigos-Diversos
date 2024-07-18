package telas;

import dao.TesteDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author arauj
 */
public class AlterarProdutos extends javax.swing.JFrame {

    /**
     * Creates new form AlterarProdutos
     */
    public AlterarProdutos() {
        initComponents();
    }

    //Para adicionar aos campos os valores que as varíaveis pegaram dentro do menu para alterar os produtos;
    public AlterarProdutos(String id, String name, String marca, String composicao) {
        initComponents();
        txtIdProduto.setText(id);
        txtNome.setText(name);
        txtMarca.setText(marca);
        txtComposicao.setText(composicao);

        txtIdProduto.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblIdProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblComposicao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtComposicao = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnSalvarAlteracoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Produtos");
        getContentPane().setLayout(null);

        lblIdProduto.setText("ID do Produto:");
        getContentPane().add(lblIdProduto);
        lblIdProduto.setBounds(20, 20, 90, 30);

        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 70, 90, 30);

        lblMarca.setText("Marca:");
        getContentPane().add(lblMarca);
        lblMarca.setBounds(20, 120, 90, 30);

        lblComposicao.setText("Composição:");
        getContentPane().add(lblComposicao);
        lblComposicao.setBounds(20, 170, 90, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 70, 430, 30);

        txtIdProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoActionPerformed(evt);
            }
        });
        txtIdProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdProdutoKeyPressed(evt);
            }
        });
        getContentPane().add(txtIdProduto);
        txtIdProduto.setBounds(110, 20, 430, 30);

        txtComposicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtComposicaoActionPerformed(evt);
            }
        });
        txtComposicao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtComposicaoKeyPressed(evt);
            }
        });
        getContentPane().add(txtComposicao);
        txtComposicao.setBounds(110, 170, 430, 30);

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMarcaKeyPressed(evt);
            }
        });
        getContentPane().add(txtMarca);
        txtMarca.setBounds(110, 120, 430, 30);

        btnSalvarAlteracoes.setText("Salvar Alterações");
        btnSalvarAlteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAlteracoesActionPerformed(evt);
            }
        });
        btnSalvarAlteracoes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnSalvarAlteracoesKeyPressed(evt);
            }
        });
        getContentPane().add(btnSalvarAlteracoes);
        btnSalvarAlteracoes.setBounds(220, 250, 170, 30);

        setSize(new java.awt.Dimension(608, 328));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtIdProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoActionPerformed

    private void txtComposicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComposicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtComposicaoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnSalvarAlteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesActionPerformed
        //0 - Variáveis que pegaram os dados dos campos;
        String id, nome, marca, composicao;

        // Pegando os dados dos campos;
        id = txtIdProduto.getText();
        nome = txtNome.getText();
        marca = txtMarca.getText();
        composicao = txtComposicao.getText();

        try {
            //1 - Conectar ao BD
            new TesteDao().alterarProdutos(nome, marca, composicao, id);

            //3 - Mensagem dos dados alterados;
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
            dispose(); // Fechar a tela depois da execução dos comandos;

        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnSalvarAlteracoesActionPerformed

    private void txtIdProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProdutoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtIdProdutoKeyPressed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtMarca.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtComposicao.requestFocus();
        }
    }//GEN-LAST:event_txtMarcaKeyPressed

    private void txtComposicaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtComposicaoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvarAlteracoes.requestFocus();
        }
    }//GEN-LAST:event_txtComposicaoKeyPressed

    private void btnSalvarAlteracoesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSalvarAlteracoesKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnSalvarAlteracoes.doClick();
        }
    }//GEN-LAST:event_btnSalvarAlteracoesKeyPressed

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
            java.util.logging.Logger.getLogger(AlterarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarAlteracoes;
    private javax.swing.JLabel lblComposicao;
    private javax.swing.JLabel lblIdProduto;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtComposicao;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
