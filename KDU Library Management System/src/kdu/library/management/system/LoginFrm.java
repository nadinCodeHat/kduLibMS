package kdu.library.management.system;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class LoginFrm extends javax.swing.JFrame {

    public LoginFrm() {
        initComponents();
        loadFrameImage();
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("kdu_logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        emailLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JPasswordField();
        emailTextField = new javax.swing.JTextField();
        exitBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/kdu_logo_small.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 60, 48));

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailLabel.setText("Email");
        loginPanel.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        passwordLabel.setText("Password");
        loginPanel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        passwordTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        loginPanel.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 170, -1));

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        loginPanel.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, -1));

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        loginPanel.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 60, -1));

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        loginPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 60, -1));

        jPanel1.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 240));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if (validateFields()) {
            String email = emailTextField.getText();
            String password = String.valueOf(passwordTextField.getPassword());

            String query = "SELECT users.name, users.email, users.password, roles.role_name FROM `users` INNER JOIN `roles` ON roles.id = users.role_id AND users.email=? AND users.password=?";
            try {
                ResultSet rs;
                try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                    pst.setString(1, email);
                    pst.setString(2, password);
                    rs = pst.executeQuery();
                    if (rs.next()) {
                        String name = rs.getString("name");
                        if (rs.getString("email").equals(email) && rs.getString("role_name").equals("Admin")) {
                            JOptionPane.showMessageDialog(null, "Login Successful! Welcome " + name);
                            AdminFrm adminFrm = new AdminFrm();
                            adminFrm.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Login Successful! Welcome " + name);
                            LibrarianFrm libFrm = new LibrarianFrm();
                            libFrm.setVisible(true);
                            this.dispose();
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Email or Password", "Access Denied", JOptionPane.ERROR_MESSAGE);
                    }
                }
                rs.close();
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(LoginFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    //validate fields
    public boolean validateFields() {
        String email = emailTextField.getText();
        String password = String.valueOf(passwordTextField.getPassword());

        //check empty fields
        if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your email address.", "Empty Field", 2);
            return false;
        }
        if (password.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty!", "Empty Field", 2);
            return false;
        } else {
            return true;
        }
    }

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
            java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTextField;
    // End of variables declaration//GEN-END:variables
}
