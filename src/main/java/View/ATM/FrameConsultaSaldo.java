/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.ATM;

import Control.ATM.ControlConsultaSaldo;
import Control.ATM.ControlMenuPrincipal;
import Entity.ATM.Conta;

/**
 *
 * @author amiltonjunior
 */
public final class FrameConsultaSaldo extends javax.swing.JFrame {

    private static final long serialVersionUID = 1L;
    private FrameMenuOperacoes parentFrame;
    private Conta conta;
    
    /**
     * Creates new form FrameConsultaSaldo
     */
    public FrameConsultaSaldo() {
        initComponents();
    }
    
    public void iniciar() {
        ControlConsultaSaldo.iniciar(this);
    }
    
    public void setNomeCliente(String nome) {
        jLabelNomeCliente.setText(nome);
    }
    
    public void setNumeroConta(String numero) {
        jLabelNumeroConta.setText(numero);
    }
    
    public void setLimite(String limite) {
        if (limite.equals("0.0"))
            jLabelLimite.setText("N/A");
        else
            jLabelLimite.setText(limite);
    }
    
    public void setTipo(String tipo) {
        jLabelTipo.setText(tipo);
        
        if (tipo.equals("poupanca"))
            setLabelData("Aniversário da conta:");
        else
            setLabelData("Data de abertura:");
    }
    
    public void setAniversario(String aniversario) {
        jLabelAniversario.setText(aniversario);
    }
    
    public void setSaldo(String saldo) {
        jLabelSaldo.setText(String.format("%.2f", Double.parseDouble(saldo)));
    }
    
    public void setLabelData(String s) {
        labelData.setText(s);
    }
    
    // Método que armazena o JFrame pai
    public void setParentFrame(FrameMenuOperacoes parentFrame) {
        this.parentFrame = parentFrame;
    }
    
    // Método que retorna o JFrame pai
    public FrameMenuOperacoes getParentFrame() {
        return this.parentFrame;
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

        PainelPrincipal = new javax.swing.JPanel();
        lblLogotipo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelNomeCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNumeroConta = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelLimite = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        labelData = new javax.swing.JLabel();
        jLabelAniversario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelSaldo = new javax.swing.JLabel();
        lblSeta1 = new javax.swing.JLabel();
        btnEfetuarDeposito6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PainelPrincipal.setPreferredSize(new java.awt.Dimension(780, 530));

        lblLogotipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/logo_banco.jpg"))); // NOI18N

        jLabel2.setText("Cliente: ");

        jLabelNomeCliente.setText("[NOMECLIENTE]");

        jLabel3.setText("Número da conta:");

        jLabelNumeroConta.setText("[NUMEROCONTA]");

        jLabel4.setText("Limite:");

        jLabelLimite.setText("[LIMITE]");

        jLabel5.setText("Tipo:");

        jLabelTipo.setText("[TIPO]");

        labelData.setText("[labelData]");

        jLabelAniversario.setText("[ANIVERSARIO]");

        jLabel7.setText("Saldo: R$");

        jLabelSaldo.setText("[SALDO]");

        lblSeta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icones/esquerda.jpg"))); // NOI18N

        btnEfetuarDeposito6.setFont(new java.awt.Font("Gill Sans MT", 0, 20)); // NOI18N
        btnEfetuarDeposito6.setText("Retornar");
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

        javax.swing.GroupLayout PainelPrincipalLayout = new javax.swing.GroupLayout(PainelPrincipal);
        PainelPrincipal.setLayout(PainelPrincipalLayout);
        PainelPrincipalLayout.setHorizontalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap(255, Short.MAX_VALUE)
                .addComponent(lblLogotipo)
                .addGap(245, 245, 245))
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNomeCliente))
                    .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PainelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabelNumeroConta))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelSaldo))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelPrincipalLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelLimite))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTipo))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelData)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelAniversario)))
                .addGap(106, 106, 106))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSeta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEfetuarDeposito6, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelPrincipalLayout.setVerticalGroup(
            PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelPrincipalLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblLogotipo)
                        .addGap(101, 101, 101)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabelNomeCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabelNumeroConta)))
                    .addGroup(PainelPrincipalLayout.createSequentialGroup()
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabelTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelData)
                            .addComponent(jLabelAniversario))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelLimite))
                .addGap(49, 49, 49)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(PainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSeta1)
                    .addComponent(btnEfetuarDeposito6))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEfetuarDeposito6Clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEfetuarDeposito6Clicked
        // Chama a ação em ControlMenuPrincipal
        // ControlMenuPrincipal.efetuarDeposito();
    }//GEN-LAST:event_btnEfetuarDeposito6Clicked

    private void btnEfetuarDeposito6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEfetuarDeposito6ActionPerformed
        ControlMenuPrincipal.cancelar(this, getParentFrame());
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
            java.util.logging.Logger.getLogger(FrameConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameConsultaSaldo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameConsultaSaldo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelPrincipal;
    private javax.swing.JButton btnEfetuarDeposito6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAniversario;
    private javax.swing.JLabel jLabelLimite;
    private javax.swing.JLabel jLabelNomeCliente;
    private javax.swing.JLabel jLabelNumeroConta;
    private javax.swing.JLabel jLabelSaldo;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel labelData;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblSeta1;
    // End of variables declaration//GEN-END:variables
}
