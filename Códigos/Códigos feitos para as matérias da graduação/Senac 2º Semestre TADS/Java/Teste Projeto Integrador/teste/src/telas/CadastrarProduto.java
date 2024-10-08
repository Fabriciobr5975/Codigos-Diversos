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
public class CadastrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarProduto
     */
    public CadastrarProduto() {
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

        lblIdProduto = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblComposicao = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtComposicao = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        btnCadastrarProduto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Produtos");
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

        btnCadastrarProduto.setText("Salvar");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        btnCadastrarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCadastrarProdutoKeyPressed(evt);
            }
        });
        getContentPane().add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(190, 250, 220, 30);

        setSize(new java.awt.Dimension(603, 338));
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

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        //0 - Variáveis que pega os dados dos campos;
        String idProduto, nomeProduto, marcaProduto, composicaoProduto;

        // Pegando os dados dos campos;
        idProduto = txtIdProduto.getText();
        nomeProduto = txtNome.getText();
        marcaProduto = txtMarca.getText();
        composicaoProduto = txtComposicao.getText();

        try {
            new TesteDao().cadastrarProduto(idProduto, nomeProduto, marcaProduto, composicaoProduto);

            //3 - Mensagem para mostrar que o produto foi cadastrado;
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso", "Produto Cadastrado", JOptionPane.INFORMATION_MESSAGE);

            //4 - Limpar os campos;
            txtIdProduto.setText("");
            txtNome.setText("");
            txtMarca.setText("");
            txtComposicao.setText("");
            txtIdProduto.requestFocus(); //Voltar o cursor do mouse para o primeiro campo 

        } catch (ClassNotFoundException | SQLException ex) {
            String erro = ex.getMessage();

            if (erro.contains("Duplicate entry")) { //Se o erro consistir em cadastrar um produto que já exista;
                JOptionPane.showMessageDialog(null, "Produto já cadastrado", "Produto Cadastrado", JOptionPane.WARNING_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o suporte e informe o erro: " + ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

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
            btnCadastrarProduto.requestFocus();
        }
    }//GEN-LAST:event_txtComposicaoKeyPressed

    private void btnCadastrarProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            btnCadastrarProduto.doClick();
        }
    }//GEN-LAST:event_btnCadastrarProdutoKeyPressed

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
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
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
