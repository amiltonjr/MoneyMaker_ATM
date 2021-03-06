/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ATM;

import Control.ATM.ControlEfetuarDeposito;
import Control.ATM.ControlMenuPrincipal;

/**
 *
 * @author amiltonjunior
 */
public class FrameEfetuarDeposito extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private FrameMenuOperacoes parentFrame;
    private FrameSucessoTransacao frameSucesso;
    private FrameErroTransacao frameErro;
    
    /**
     * Creates new form FrameEfetuarDeposito
     */
    public FrameEfetuarDeposito() {
        initComponents();
    }
    
    // Método que armazena o JFrame pai
    public void setParentFrame(FrameMenuOperacoes parentFrame) {
        this.parentFrame = parentFrame;
    }
    
    // Método que retorna o JFrame pai
    public FrameMenuOperacoes getParentFrame() {
        return this.parentFrame;
    }
    
    public void setFrameSucesso(FrameSucessoTransacao frame) {
        this.frameSucesso = frame;
    }
    
    public void setFrameErro(FrameErroTransacao frame) {
        this.frameErro = frame;
    }
    
    public void clearValor() {
        valor.setText("");
    }
    
    public void focoValor() {
        valor.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        PainelPrincipal6 = new javax.swing.JPanel();
        lblLogotipo6 = new javax.swing.JLabel();
        btnEfetuarDeposito6 = new javax.swing.JButton();
        lblSeta28 = new javax.swing.JLabel();
        btnCancelar6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLvalorDep = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblSeta1 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(780, 495));

        PainelPrincipal6.setBackground(new java.awt.Color(255, 255, 255));

        lblLogotipo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogotipo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/logo_banco.jpg"))); // NOI18N

        btnEfetuarDeposito6.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        btnEfetuarDeposito6.setText("Confirmar");
        btnEfetuarDeposito6.setFocusPainted(false);
        btnEfetuarDeposito6.setFocusable(false);
        btnEfetuarDeposito6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEfetuarDeposito6Clicked(evt);
            }
        });
        btnEfetuarDeposito6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEfetuarDeposito6ActionPerformed(evt);
            }
        });

        lblSeta28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/direita.jpg"))); // NOI18N

        btnCancelar6.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        btnCancelar6.setText("Retornar");
        btnCancelar6.setFocusPainted(false);
        btnCancelar6.setFocusable(false);
        btnCancelar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelar6Clicked(evt);
            }
        });
        btnCancelar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Depósito Bancário");

        jLvalorDep.setText("Valor: R$");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Depósitos realizados após o horário de expediente serão lançados no próximo dia útil");

        lblSeta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/esquerda.jpg"))); // NOI18N

        javax.swing.GroupLayout PainelPrincipal6Layout = new javax.swing.GroupLayout(PainelPrincipal6);
        PainelPrincipal6.setLayout(PainelPrincipal6Layout);
        PainelPrincipal6Layout.setHorizontalGroup(
            PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal6Layout.createSequentialGroup()
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addGroup(PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal6Layout.createSequentialGroup()
                                .addGroup(PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PainelPrincipal6Layout.createSequentialGroup()
                                        .addGap(231, 231, 231)
                                        .addComponent(lblLogotipo6))
                                    .addComponent(jLabel6)
                                    .addGroup(PainelPrincipal6Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jLvalorDep)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal6Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(322, 322, 322))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal6Layout.createSequentialGroup()
                        .addComponent(lblSeta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEfetuarDeposito6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSeta28)
                        .addGap(15, 15, 15))))
        );
        PainelPrincipal6Layout.setVerticalGroup(
            PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipal6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLogotipo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(100, 100, 100)
                .addGroup(PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLvalorDep)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCancelar6)
                        .addComponent(btnEfetuarDeposito6))
                    .addComponent(lblSeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeta28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelar6Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelar6Clicked
        // Chama a ação em ControlMenuPrincipal
        //ControlMenuPrincipal.cancelar(this, getParentFrame());
    }//GEN-LAST:event_btnCancelar6Clicked

    private void btnEfetuarDeposito6Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEfetuarDeposito6Clicked
        // Chama a ação em ControlMenuPrincipal
        //ControlMenuPrincipal.efetuarDeposito();
    }//GEN-LAST:event_btnEfetuarDeposito6Clicked

    private void btnCancelar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar6ActionPerformed
        ControlMenuPrincipal.cancelar(this, getParentFrame());
    }//GEN-LAST:event_btnCancelar6ActionPerformed

    private void btnEfetuarDeposito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarDeposito6ActionPerformed
        ControlEfetuarDeposito.efetuarDeposito(this, this.frameSucesso, this.frameErro, valor.getText());
    }//GEN-LAST:event_btnEfetuarDeposito6ActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrameEfetuarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarDeposito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEfetuarDeposito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal6;
    private javax.swing.JButton btnCancelar6;
    private javax.swing.JButton btnEfetuarDeposito6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLvalorDep;
    private javax.swing.JLabel lblLogotipo6;
    private javax.swing.JLabel lblSeta1;
    private javax.swing.JLabel lblSeta28;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
