/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ATM;

import Control.ATM.ControlMenuPrincipal;

/**
 *
 * @author amiltonjunior
 */
public class FrameErroTransacao extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private FrameMenuOperacoes parentFrame;
    
    /**
     * Creates new form FrameErroTransacao
     */
    public FrameErroTransacao() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelPrincipal1 = new javax.swing.JPanel();
        lblLogotipo1 = new javax.swing.JLabel();
        lblErroLeitura1 = new javax.swing.JLabel();
        lblIconeErroLeitura1 = new javax.swing.JLabel();
        lblTenteNovamente1 = new javax.swing.JLabel();
        lblSeta2 = new javax.swing.JLabel();
        btnRetornar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPrincipal1.setBackground(new java.awt.Color(255, 255, 255));

        lblLogotipo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogotipo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/logo_banco.jpg"))); // NOI18N

        lblErroLeitura1.setFont(new java.awt.Font("Gill Sans MT", 1, 24)); // NOI18N
        lblErroLeitura1.setText("Erro ao processar a transação");

        lblIconeErroLeitura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/erro.jpg"))); // NOI18N

        lblTenteNovamente1.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        lblTenteNovamente1.setText("Por favor, tente novamente.");

        lblSeta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/esquerda.jpg"))); // NOI18N

        btnRetornar1.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        btnRetornar1.setText("Retornar");
        btnRetornar1.setFocusPainted(false);
        btnRetornar1.setFocusable(false);
        btnRetornar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRetornar1Clicked(evt);
            }
        });

        javax.swing.GroupLayout PainelPrincipal1Layout = new javax.swing.GroupLayout(PainelPrincipal1);
        PainelPrincipal1.setLayout(PainelPrincipal1Layout);
        PainelPrincipal1Layout.setHorizontalGroup(
            PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipal1Layout.createSequentialGroup()
                .addGroup(PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipal1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblIconeErroLeitura1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErroLeitura1)
                            .addComponent(lblLogotipo1)
                            .addGroup(PainelPrincipal1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(lblTenteNovamente1))))
                    .addGroup(PainelPrincipal1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSeta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRetornar1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        PainelPrincipal1Layout.setVerticalGroup(
            PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipal1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconeErroLeitura1)
                    .addGroup(PainelPrincipal1Layout.createSequentialGroup()
                        .addComponent(lblLogotipo1)
                        .addGap(156, 156, 156)
                        .addComponent(lblErroLeitura1)))
                .addGap(42, 42, 42)
                .addComponent(lblTenteNovamente1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(PainelPrincipal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSeta2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRetornar1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetornar1Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRetornar1Clicked
        // Chama a ação na classe ControlMenuPrincipal
        ControlMenuPrincipal.cancelar(this, getParentFrame());
    }//GEN-LAST:event_btnRetornar1Clicked

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
            java.util.logging.Logger.getLogger(FrameErroTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameErroTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameErroTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameErroTransacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameErroTransacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal1;
    private javax.swing.JButton btnRetornar1;
    private javax.swing.JLabel lblErroLeitura1;
    private javax.swing.JLabel lblIconeErroLeitura1;
    private javax.swing.JLabel lblLogotipo1;
    private javax.swing.JLabel lblSeta2;
    private javax.swing.JLabel lblTenteNovamente1;
    // End of variables declaration//GEN-END:variables
}
