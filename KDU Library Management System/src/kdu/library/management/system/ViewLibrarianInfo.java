package kdu.library.management.system;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nadinCodeHat
 */
public class ViewLibrarianInfo extends javax.swing.JFrame {

    public ViewLibrarianInfo(){}
    
    private int userid = 0;
    public ViewLibrarianInfo(int id) {
        initComponents();
        this.userid = id;
        getLibrarian();
    }

    private void getLibrarian(){
        String getMoviesQuery="SELECT `name`, `email`, `contact` FROM `users` WHERE `id` = '"+userid+"'";
        try{
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(getMoviesQuery)) {
                rs = pst.executeQuery();
                while(rs.next())
                {
                    name.setText(rs.getString("name"));
                    emailAddress.setText(rs.getString("email"));
                    contact.setText(String.valueOf(rs.getInt("contact")));
                }   
            }
            rs.close();
            DBConnectClass.getConnection().close();
        }catch(SQLException ex){
            Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        contactLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        emailAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Librarian Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        exitBtn.setText("OK");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel2.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        contactLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        contactLabel.setText("Contact :");
        jPanel2.add(contactLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        nameLabel.setText("Name :");
        jPanel2.add(nameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailLabel.setText("Email Address :");
        jPanel2.add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        contact.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(emailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 170));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLibrarianInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewLibrarianInfo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contact;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailAddress;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}