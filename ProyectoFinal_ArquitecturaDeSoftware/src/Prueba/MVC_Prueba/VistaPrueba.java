package Prueba.MVC_Prueba;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class VistaPrueba extends javax.swing.JFrame {

    public VistaPrueba() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        HolaButton = new javax.swing.JButton();
        AdiosButton = new javax.swing.JButton();
        navidadButton = new javax.swing.JButton();
        HolaConsolaButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hola mundo");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Hola Mundo");

        HolaButton.setText("Hola mundo");
        HolaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HolaButtonActionPerformed(evt);
            }
        });

        AdiosButton.setText("Adios Mundo");
        AdiosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdiosButtonActionPerformed(evt);
            }
        });

        navidadButton.setText("Feliz Navidad");

        HolaConsolaButton.setText("Hola mundo en consola");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(navidadButton)
                                                        .addComponent(HolaButton)
                                                        .addComponent(AdiosButton))
                                                .addGap(21, 21, 21))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addComponent(jLabel1)))
                                .addContainerGap(34, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(HolaConsolaButton)
                                .addGap(24, 24, 24)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(HolaButton)
                                .addGap(37, 37, 37)
                                .addComponent(AdiosButton)
                                .addGap(38, 38, 38)
                                .addComponent(navidadButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32,
                                        Short.MAX_VALUE)
                                .addComponent(HolaConsolaButton)
                                .addGap(23, 23, 23)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdiosButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_AdiosButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_AdiosButtonActionPerformed

    private void HolaButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_enviarButtonActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_enviarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdiosButton;
    private javax.swing.JButton HolaButton;
    private javax.swing.JButton HolaConsolaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton navidadButton;
    // End of variables declaration//GEN-END:variables

    public JButton getHolaButton() {
        return HolaButton;
    }

    public JButton getAdiosButton() {
        return AdiosButton;
    }

    public JButton getNavidadButton() {
        return navidadButton;
    }

    public JButton getConsolaButton() {
        return HolaConsolaButton;
    }

}
