package kdu.library.management.system;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author nadinCodeHat
 */
public class AddBookFrm extends javax.swing.JFrame {

    public AddBookFrm() {
        initComponents();
        loadFrameImage();
    }

    public void loadFrameImage() {
        try {
            setIconImage(ImageIO.read(new File("kdu_logo.png")));
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(AddBookFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        bookTitleTextField = new javax.swing.JTextField();
        isbnTextField = new javax.swing.JTextField();
        authorTextField = new javax.swing.JTextField();
        authorLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();
        isbnLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
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

        bookTitleTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(bookTitleTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, -1));

        isbnTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isbnTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                isbnTextFieldKeyPressed(evt);
            }
        });
        jPanel2.add(isbnTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 200, -1));

        authorTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel2.add(authorTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 200, -1));

        authorLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        authorLabel.setText("Author");
        jPanel2.add(authorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        bookTitleLabel.setText("Book Title");
        jPanel2.add(bookTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        isbnLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        isbnLabel.setText("ISBN");
        jPanel2.add(isbnLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 290));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (checkEmptyFields()) {
            PreparedStatement pst = null;
            String query = "INSERT INTO `books`(`book_title`, `author`, `isbn`, `availability`, `borrowed_date`, `return_date`, `student_id`) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try {
                pst = DBConnectClass.getConnection().prepareStatement(query);
                pst.setString(1, bookTitleTextField.getText());
                pst.setString(2, authorTextField.getText());
                pst.setInt(3, Integer.parseInt(isbnTextField.getText()));
                pst.setBoolean(4, true);
                pst.setDate(5, null);
                pst.setDate(6, null);
                pst.setInt(7, 0);
                pst.execute();
                pst.close();
                DBConnectClass.getConnection().close();
            } catch (SQLException ex) {
                Logger.getLogger(AddBookFrm.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                JOptionPane.showMessageDialog(null, "New book added!");
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void isbnTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_isbnTextFieldKeyPressed
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && isbnTextField.getText().length() < 10 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            isbnTextField.setEditable(true);
        } else {
            isbnTextField.setEditable(false);
        }
    }//GEN-LAST:event_isbnTextFieldKeyPressed

    private boolean checkEmptyFields() {
        String bookTitle = bookTitleTextField.getText();
        String isbn = isbnTextField.getText();
        String author = authorTextField.getText();

        //check empty fields
        if (bookTitle.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Book title field is empty.", "Empty Field", 2);
            return false;
        }
        if (isbn.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "ISBN field is empty.", "Empty genre", 2);
            return false;
        }
        if (author.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Author field is empty", "Empty Field", 2);
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
            java.util.logging.Logger.getLogger(AddBookFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddBookFrm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTextField;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JTextField bookTitleTextField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel isbnLabel;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
