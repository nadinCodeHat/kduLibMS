package kdu.library.management.system;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author nadinCodeHat
 */
public class HomePageFrm extends javax.swing.JFrame {

    public HomePageFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        copyright = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        enterBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        librarianBtn = new javax.swing.JButton();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        copyright.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        copyright.setForeground(new java.awt.Color(112, 112, 112));
        copyright.setText("© KDU 2020");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kdu_logo_small.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, 80));

        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/enterBtn.png"))); // NOI18N
        enterBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        enterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterBtnMouseExited(evt);
            }
        });
        jPanel1.add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 90, 90));

        adminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/adminBtn.png"))); // NOI18N
        adminBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        adminBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adminBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adminBtnMouseExited(evt);
            }
        });
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(adminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 90, 90));

        librarianBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/librarianBtn.png"))); // NOI18N
        librarianBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        librarianBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        librarianBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                librarianBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                librarianBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                librarianBtnMouseExited(evt);
            }
        });
        jPanel1.add(librarianBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 90, 90));

        msg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msg.setForeground(new java.awt.Color(112, 112, 112));
        msg.setText("Welcome to KDU Library Management System");
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adminBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBtnMouseEntered
        try {
            Image adminBtnHover = ImageIO.read(getClass().getResource("/resources/adminBtnHover.png"));
            adminBtn.setIcon(new ImageIcon(adminBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adminBtnMouseEntered

    private void adminBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminBtnMouseExited
        try {
            Image adminBtnImg = ImageIO.read(getClass().getResource("/resources/adminBtn.png"));
            adminBtn.setIcon(new ImageIcon(adminBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adminBtnMouseExited

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminBtnActionPerformed

    private void librarianBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librarianBtnMouseEntered
        try {
            Image librarianBtnHover = ImageIO.read(getClass().getResource("/resources/librarianBtnHover.png"));
            librarianBtn.setIcon(new ImageIcon(librarianBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_librarianBtnMouseEntered

    private void librarianBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librarianBtnMouseExited
        try {
            Image librarianBtnImg = ImageIO.read(getClass().getResource("/resources/librarianBtn.png"));
            librarianBtn.setIcon(new ImageIcon(librarianBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_librarianBtnMouseExited

    private void librarianBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_librarianBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_librarianBtnMouseClicked

    private void enterBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseEntered
        try {
            Image enterBtnHover = ImageIO.read(getClass().getResource("/resources/enterBtnHover.png"));
            enterBtn.setIcon(new ImageIcon(enterBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enterBtnMouseEntered

    private void enterBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseExited
        try {
            Image enterBtnImg = ImageIO.read(getClass().getResource("/resources/enterBtn.png"));
            enterBtn.setIcon(new ImageIcon(enterBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enterBtnMouseExited

    private void enterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_enterBtnMouseClicked

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
            java.util.logging.Logger.getLogger(HomePageFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new HomePageFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminBtn;
    private javax.swing.JLabel copyright;
    private javax.swing.JButton enterBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton librarianBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables
}
