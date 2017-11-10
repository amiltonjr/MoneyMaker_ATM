/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ATM;

import Control.ATM.ControlEfetuarSaque;
import Control.ATM.ControlMenuPrincipal;
import Entity.ATM.Conta;
/**
 *
 * @author amiltonjunior
 */
public class FrameEfetuarSaque extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private FrameMenuOperacoes parentFrame;
    private FrameSucessoTransacao frameSucesso;
    private FrameErroTransacao frameErro;
    private Conta conta;
    
    /**
     * Creates new form FrameEfetuarSaque
     */
    public FrameEfetuarSaque() {
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

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal10 = new javax.swing.JPanel();
        lblLogotipo10 = new javax.swing.JLabel();
        btnEfetuarDeposito6 = new javax.swing.JButton();
        lblSeta28 = new javax.swing.JLabel();
        btnCancelar6 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLdataSaq = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jB50 = new javax.swing.JButton();
        jB100 = new javax.swing.JButton();
        jB200 = new javax.swing.JButton();
        jB150 = new javax.swing.JButton();
        jB300 = new javax.swing.JButton();
        jB400 = new javax.swing.JButton();
        jB500 = new javax.swing.JButton();
        jB800 = new javax.swing.JButton();
        lblSeta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPrincipal10.setBackground(new java.awt.Color(255, 255, 255));

        lblLogotipo10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogotipo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/logo_banco.jpg"))); // NOI18N

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

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Efetuar Saque");

        jLdataSaq.setText("Valor: R$");

        valor.setBackground(new java.awt.Color(240, 240, 240));

        jB50.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB50.setText("50.00");
        jB50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnjB50click(evt);
            }
        });
        jB50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB50ActionPerformed(evt);
            }
        });

        jB100.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB100.setText("100.00");
        jB100.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB100click(evt);
            }
        });
        jB100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB100ActionPerformed(evt);
            }
        });

        jB200.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB200.setText("200.00");
        jB200.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB200click(evt);
            }
        });
        jB200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB200ActionPerformed(evt);
            }
        });

        jB150.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB150.setText("150.00");
        jB150.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB150click(evt);
            }
        });
        jB150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB150ActionPerformed(evt);
            }
        });

        jB300.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB300.setText("300.00");
        jB300.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB300click(evt);
            }
        });
        jB300.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB300ActionPerformed(evt);
            }
        });

        jB400.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB400.setText("400.00");
        jB400.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB400click(evt);
            }
        });
        jB400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB400ActionPerformed(evt);
            }
        });

        jB500.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB500.setText("500.00");
        jB500.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB500click(evt);
            }
        });
        jB500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB500ActionPerformed(evt);
            }
        });

        jB800.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jB800.setText("800.00");
        jB800.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jB800click(evt);
            }
        });
        jB800.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB800ActionPerformed(evt);
            }
        });

        lblSeta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/esquerda.jpg"))); // NOI18N

        javax.swing.GroupLayout PainelPrincipal10Layout = new javax.swing.GroupLayout(PainelPrincipal10);
        PainelPrincipal10.setLayout(PainelPrincipal10Layout);
        PainelPrincipal10Layout.setHorizontalGroup(
            PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLogotipo10)
                .addGap(271, 271, 271))
            .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnEfetuarDeposito6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSeta28)
                .addGap(15, 15, 15))
            .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jLabel33))
                    .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jB300, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB400, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB500, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jB800, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(jLdataSaq)
                        .addGap(18, 18, 18)
                        .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPrincipal10Layout.setVerticalGroup(
            PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipal10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLogotipo10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel33)
                .addGap(40, 40, 40)
                .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                        .addComponent(jB300, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB400, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB500, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB800, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PainelPrincipal10Layout.createSequentialGroup()
                        .addComponent(jB50, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB100, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB150, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jB200, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLdataSaq)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSeta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelPrincipal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar6)
                            .addComponent(btnEfetuarDeposito6)))
                    .addComponent(lblSeta28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jB400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB400ActionPerformed
        valor.setText("400.00");
    }//GEN-LAST:event_jB400ActionPerformed

    private void jB800ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB800ActionPerformed
        valor.setText("800.00");
    }//GEN-LAST:event_jB800ActionPerformed

    private void btnjB50click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnjB50click
        
    }//GEN-LAST:event_btnjB50click

    private void jB100click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB100click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB100click

    private void jB150click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB150click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB150click

    private void jB200click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB200click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB200click

    private void jB300click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB300click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB300click

    private void jB400click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB400click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB400click

    private void jB500click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB500click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB500click

    private void jB800click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jB800click
        // TODO add your handling code here:
    }//GEN-LAST:event_jB800click

    private void btnCancelar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar6ActionPerformed
        ControlMenuPrincipal.cancelar(this, getParentFrame());
    }//GEN-LAST:event_btnCancelar6ActionPerformed

    private void btnEfetuarDeposito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarDeposito6ActionPerformed
        ControlEfetuarSaque.efetuarSaque(this, this.frameSucesso, this.frameErro, valor.getText());
    }//GEN-LAST:event_btnEfetuarDeposito6ActionPerformed

    private void jB50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB50ActionPerformed
        valor.setText("50.00");
    }//GEN-LAST:event_jB50ActionPerformed

    private void jB300ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB300ActionPerformed
        valor.setText("300.00");
    }//GEN-LAST:event_jB300ActionPerformed

    private void jB100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB100ActionPerformed
        valor.setText("100.00");
    }//GEN-LAST:event_jB100ActionPerformed

    private void jB150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB150ActionPerformed
        valor.setText("150.00");
    }//GEN-LAST:event_jB150ActionPerformed

    private void jB500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB500ActionPerformed
        valor.setText("500.00");
    }//GEN-LAST:event_jB500ActionPerformed

    private void jB200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB200ActionPerformed
        valor.setText("200.00");
    }//GEN-LAST:event_jB200ActionPerformed

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
            java.util.logging.Logger.getLogger(FrameEfetuarSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameEfetuarSaque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameEfetuarSaque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal10;
    private javax.swing.JButton btnCancelar6;
    private javax.swing.JButton btnEfetuarDeposito6;
    private javax.swing.JButton jB100;
    private javax.swing.JButton jB150;
    private javax.swing.JButton jB200;
    private javax.swing.JButton jB300;
    private javax.swing.JButton jB400;
    private javax.swing.JButton jB50;
    private javax.swing.JButton jB500;
    private javax.swing.JButton jB800;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLdataSaq;
    private javax.swing.JLabel lblLogotipo10;
    private javax.swing.JLabel lblSeta1;
    private javax.swing.JLabel lblSeta28;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables
}
