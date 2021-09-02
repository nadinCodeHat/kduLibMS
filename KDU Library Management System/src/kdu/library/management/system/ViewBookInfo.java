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
public class ViewBookInfo extends javax.swing.JFrame {

    public ViewBookInfo(){}
    
    private int bookid = 0;
    public ViewBookInfo(int id) {
        initComponents();
        this.bookid = id;
        getBook();
    }

    private void getBook(){
        String getbookQuery="SELECT book_title, author, isbn, availability, borrowed_date, return_date FROM `books` WHERE books.id = '"+bookid+"'";
        String checkAvailability = null;
        try{
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(getbookQuery)) {
                rs = pst.executeQuery();
                while(rs.next())
                {
                    bookTitle.setText(rs.getString("book_title"));
                    author.setText(rs.getString("author"));
                    isbn.setText(String.valueOf(rs.getInt("isbn")));
                    checkAvailability = String.valueOf(rs.getObject("availability"));
                    availability.setText(checkAvailability);
                    if("0000-00-00".equals(rs.getString("borrowed_date"))){
                        borrowedDate.setText("NULL");
                    }else{
                        borrowedDate.setText(rs.getString("borrowed_date"));
                    }
                    if("0000-00-00".equals(rs.getString("return_date"))){
                        returnDate.setText("NULL");
                    }else{
                        returnDate.setText(rs.getString("return_date"));
                    }
                }   
            }
            ResultSet rS = null;
            if("false".equals(checkAvailability)){
                String getStudentName = "SELECT users.name FROM `users` INNER JOIN `books` ON users.id = books.student_id WHERE books.id = '"+bookid+"'";                
                try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(getStudentName)) {
                    rS = pst.executeQuery();
                    while(rS.next())
                    {
                        studentName.setText(rS.getString("name"));
                    }   
                }
            }else{
                studentName.setText("NULL");
            }
            rs.close();
            rS.close();
            DBConnectClass.getConnection().close();
        }catch(SQLException ex){
            Logger.getLogger(ViewBookInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        okBtn = new javax.swing.JButton();
        studentNameLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        studentName = new javax.swing.JLabel();
        bookTitle = new javax.swing.JLabel();
        borrowedDate = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();
        availabilityLabel = new javax.swing.JLabel();
        borrowedDateLabel = new javax.swing.JLabel();
        returnDateLabel = new javax.swing.JLabel();
        isbn = new javax.swing.JLabel();
        author = new javax.swing.JLabel();
        availability = new javax.swing.JLabel();
        returnDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        okBtn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        jPanel2.add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, -1, -1));

        studentNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        studentNameLabel.setText("Student Name :");
        jPanel2.add(studentNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        bookTitleLabel.setText("Book Title :");
        jPanel2.add(bookTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 40, -1, -1));

        authorLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        authorLabel.setText("Author :");
        jPanel2.add(authorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 70, -1, -1));

        studentName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        bookTitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        borrowedDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(borrowedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        isbnLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isbnLabel.setText("ISBN :");
        jPanel2.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 100, -1, -1));

        availabilityLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        availabilityLabel.setText("Availability :");
        jPanel2.add(availabilityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        borrowedDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        borrowedDateLabel.setText("Borrowed Date :");
        jPanel2.add(borrowedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        returnDateLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        returnDateLabel.setText("Return Date :");
        jPanel2.add(returnDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 190, -1, -1));

        isbn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(isbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        author.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        availability.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(availability, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        returnDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(returnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 290));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ViewBookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewBookInfo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel availability;
    private javax.swing.JLabel availabilityLabel;
    private javax.swing.JLabel bookTitle;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JLabel borrowedDate;
    private javax.swing.JLabel borrowedDateLabel;
    private javax.swing.JLabel isbn;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel returnDate;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JLabel studentName;
    private javax.swing.JLabel studentNameLabel;
    // End of variables declaration//GEN-END:variables
}
