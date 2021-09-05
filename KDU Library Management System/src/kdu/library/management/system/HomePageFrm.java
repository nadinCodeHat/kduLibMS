package kdu.library.management.system;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
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
        loadFrameImage();
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("kdu_logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        copyright = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        enterBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        msg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        copyright.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        copyright.setText("© KDU 2020");
        jPanel1.add(copyright, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kdu_logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 100, 80));

        enterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/enterBtn.png"))); // NOI18N
        enterBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        enterBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        enterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                enterBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                enterBtnMouseExited(evt);
            }
        });
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 90, 90));

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/loginBtn.png"))); // NOI18N
        loginBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 112, 112)));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 90, 90));

        msg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        msg.setText("Welcome to KDU Library Management System");
        jPanel1.add(msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 360));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        try {
            Image librarianBtnHover = ImageIO.read(getClass().getResource("/resources/loginBtnHover.png"));
            loginBtn.setIcon(new ImageIcon(librarianBtnHover));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        try {
            Image librarianBtnImg = ImageIO.read(getClass().getResource("/resources/loginBtn.png"));
            loginBtn.setIcon(new ImageIcon(librarianBtnImg));
        } catch (IOException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginBtnMouseExited

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

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        LoginFrm lgnFrm = new LoginFrm();
        lgnFrm.setVisible(true);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        try {
            StudentFrm stFrm = new StudentFrm();
            stFrm.pack();
            stFrm.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(HomePageFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_enterBtnActionPerformed

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
    private javax.swing.JLabel copyright;
    private javax.swing.JButton enterBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel msg;
    // End of variables declaration//GEN-END:variables
}
