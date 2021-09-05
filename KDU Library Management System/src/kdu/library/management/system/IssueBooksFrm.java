package kdu.library.management.system;

import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class IssueBooksFrm extends javax.swing.JFrame {

    public IssueBooksFrm() {}

    private int bookid = 0;

    public IssueBooksFrm(int id) {
        initComponents();
        this.bookid = id;
        getStudentList();
        getBookTitle(bookid);
        loadFrameImage();
    }
    
    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("kdu_logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(IssueBooksFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        studentNameTextField = new javax.swing.JTextField();
        returnDateLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        availabilityCombo = new javax.swing.JComboBox<>();
        returnDateChooser = new com.toedter.calendar.JDateChooser();
        studentNameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Issue Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel2.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        studentNameTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studentNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                studentNameTextFieldFocusLost(evt);
            }
        });
        jPanel2.add(studentNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 200, -1));

        returnDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        returnDateLabel.setText("Choose return date");
        jPanel2.add(returnDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(bookTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        availabilityCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        availabilityCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Availability", "Available", "Borrowed" }));
        availabilityCombo.setMaximumSize(new java.awt.Dimension(110, 20));
        availabilityCombo.setMinimumSize(new java.awt.Dimension(110, 20));
        availabilityCombo.setPreferredSize(new java.awt.Dimension(110, 20));
        availabilityCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availabilityComboActionPerformed(evt);
            }
        });
        jPanel2.add(availabilityCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 120, -1));
        jPanel2.add(returnDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, -1));

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studentNameLabel.setText("Student Name");
        jPanel2.add(studentNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 270));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void getBookTitle(int bookid) {
        String query = "SELECT `book_title` FROM `books` WHERE `id` = '" + bookid + "'";
        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    bookTitleLabel.setText(rs.getString("book_title"));
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(IssueBooksFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (checkEmptyFields()) {
            PreparedStatement pst = null;
            String query = "UPDATE `books` SET `availability`=?,`borrowed_date`=?,`return_date`=?,`student_id`=? WHERE `id` = '" + bookid + "'";

            try {
                pst = DBConnectClass.getConnection().prepareStatement(query);
                if (availabilityCombo.getSelectedItem() == "Available") {
                    pst.setBoolean(1, true);
                    pst.setString(2, "000-00-00");
                    pst.setString(3, "000-00-00");
                    pst.setInt(4, 0);
                }
                if (availabilityCombo.getSelectedItem() == "Borrowed") {
                    pst.setBoolean(1, false);
                    String nowdate = String.format("%1$tY-%1$tm-%1$td", LocalDate.now());
                    pst.setString(2, nowdate);
                    String dateStr = String.format("%1$tY-%1$tm-%1$td", returnDateChooser.getDate());
                    pst.setString(3, dateStr);

                    int getId = 0;
                    try {
                        String getStudentID = "SELECT `id` FROM `users` WHERE `name` = '" + studentNameTextField.getText() + "'";
                        ResultSet rs;
                        try (PreparedStatement ps = DBConnectClass.getConnection().prepareStatement(getStudentID)) {
                            rs = ps.executeQuery();
                            while (rs.next()) {
                                getId = rs.getInt("id");
                            }
                        }
                        rs.close();
                        DBConnectClass.getConnection().close();
                    } catch (SQLException ex) {
                        Logger.getLogger(IssueBooksFrm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pst.setInt(4, getId);
                }
                pst.execute();
                pst.close();
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(IssueBooksFrm.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                JOptionPane.showMessageDialog(null, "Book updated!");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void availabilityComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availabilityComboActionPerformed
        if (availabilityCombo.getSelectedItem() == "Available") {
            studentNameLabel.setEnabled(false);
            studentNameTextField.setEnabled(false);
            returnDateLabel.setEnabled(false);
            returnDateChooser.setEnabled(false);
        } else {
            studentNameLabel.setEnabled(true);
            studentNameTextField.setEnabled(true);
            returnDateLabel.setEnabled(true);
            returnDateChooser.setEnabled(true);
        }
    }//GEN-LAST:event_availabilityComboActionPerformed

    private void studentNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_studentNameTextFieldFocusLost
        if (!studentNameTextField.getText().equals("")) {
            if (!studentNames.contains(studentNameTextField.getText())) {
                JOptionPane.showMessageDialog(null, "The student name you entered doesn't exist in the database", "Student name invalid", 2);
                studentNameTextField.setText("");
            }
        }
    }//GEN-LAST:event_studentNameTextFieldFocusLost

    private ArrayList<String> studentNames = new ArrayList<>();

    private void getStudentList() {
        String query = "SELECT `name` FROM `users` WHERE `role_id` = 3";
        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while (rs.next()) {
                    studentNames.add(rs.getString("name"));
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(IssueBooksFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean checkEmptyFields() {
        String availability = availabilityCombo.getSelectedItem().toString();

        //check empty fields
        switch (availability.trim()) {
            case "Select Availability" -> {
                JOptionPane.showMessageDialog(null, "Please choose the book to be available or borrowed", "Select availability", 2);
                return false;
            }
            case "Borrowed" -> {
                if (studentNameTextField.getText().trim().equals("")) {
                    JOptionPane.showMessageDialog(null, "Student name field is empty.", "Empty Field", 2);
                    return false;
                }
                if (returnDateChooser.getDate() == null) {
                    JOptionPane.showMessageDialog(null, "Choose return date for the book.", "Empty genre", 2);
                    return false;
                } else {
                    return true;
                }
            }
            default -> {
                return true;
            }
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
            java.util.logging.Logger.getLogger(IssueBooksFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new IssueBooksFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> availabilityCombo;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser returnDateChooser;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField studentNameTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
