package kdu.library.management.system;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class AddLibrarianFrm extends javax.swing.JFrame {

    public AddLibrarianFrm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        contactLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Librarian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        addBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, -1, -1));

        nameTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, -1));

        emailTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, -1));

        contactTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contactTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactTextFieldKeyPressed(evt);
            }
        });
        jPanel2.add(contactTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, -1));

        contactLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contactLabel.setText("Contact");
        jPanel2.add(contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nameLabel.setText("Name");
        jPanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailLabel.setText("Email Address");
        jPanel2.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
         if (checkEmail(emailTextField.getText()) && checkEmptyFields()) {
            PreparedStatement pst = null;
            String query =  "INSERT INTO `users`(`name`, `email`, `password`, `contact`, `role_id`) VALUES (?, ?, ?, ?, ?)";
            try {
                pst = DBConnectClass.getConnection().prepareStatement(query);
                pst.setString(1, nameTextField.getText());
                pst.setString(2, emailTextField.getText());
                pst.setString(3, getRandomString());
                pst.setInt(4, Integer.parseInt(contactTextField.getText()));
                pst.setInt(5, 2);
                pst.execute();
                pst.close();
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(AddLibrarianFrm.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                JOptionPane.showMessageDialog(null, "New librarian account created!");
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    //Check for duplicate emails
    public boolean checkEmail(String email) {
        boolean email_notexists = true;
        String query = "SELECT COUNT(*) FROM `users` WHERE `email` = ?";
        try {
            PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query);
            pst.setString(1, email);
            ResultSet rs = pst.executeQuery();
            rs.next();
            if (rs.getInt(1) != 0) {
                email_notexists = false;
                JOptionPane.showMessageDialog(null, "An account exists by this email, please enter different email.", "Email Duplicate", 2);
            }
            pst.close();
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(AddLibrarianFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email_notexists;
    }
    
    
    private void contactTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactTextFieldKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && contactTextField.getText().length() < 10 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            contactTextField.setEditable(true);
        } else {
            contactTextField.setEditable(false);
        }
    }//GEN-LAST:event_contactTextFieldKeyPressed

     private boolean checkEmptyFields() {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String contact = contactTextField.getText();

        //check empty fields
        if (name.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is empty.", "Empty Field", 2);
            return false;
        }
        if (email.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is empty.", "Empty genre", 2);
            return false;
        }
        if (contact.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Contact field is empty", "Empty Field", 2);
            return false;
        } 
        if (contact.length() != 10){
            JOptionPane.showMessageDialog(null, "Contact should have a minimum length of 10", "Invalid length", 2);
            return false;
        }
        else {
            return true;
        }
    }
    
    public static String getRandomString() {
        char[] chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRST".toCharArray();

        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String randomStr = sb.toString();

        return randomStr;
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
            java.util.logging.Logger.getLogger(AddLibrarianFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddLibrarianFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    // End of variables declaration//GEN-END:variables
}
