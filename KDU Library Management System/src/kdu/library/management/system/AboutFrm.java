package kdu.library.management.system;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import javax.imageio.ImageIO;

/**
 *
 * @author nadinCodeHat
 */
public class AboutFrm extends javax.swing.JFrame {

    public AboutFrm() {
        initComponents();
        loadFrameImage();
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("kdu_logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(AboutFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        devby = new javax.swing.JLabel();
        copyright = new javax.swing.JLabel();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kdu_logo_small.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 60, 48));

        devby.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        devby.setText("Developed by @nadinCodeHat");
        jPanel1.add(devby, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        copyright.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        copyright.setText("© KDU 2020");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 100, -1, -1));

        msg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        msg.setText("KDU LibMS");
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 170));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AboutFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel copyright;
    private javax.swing.JLabel devby;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables
}
