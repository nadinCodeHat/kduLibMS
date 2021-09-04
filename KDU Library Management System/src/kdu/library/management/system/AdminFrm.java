package kdu.library.management.system;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nadinCodeHat
 */
public class AdminFrm extends javax.swing.JFrame {

    public AdminFrm() throws SQLException {
        initComponents();
        getLibrarianInfo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        searchIcon = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        searchTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        refreshBtn = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        viewBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        deleteBtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        addBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        librarianTable = new javax.swing.JTable();
        MenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setMaximumSize(new java.awt.Dimension(570, 30));
        jToolBar1.setMinimumSize(new java.awt.Dimension(570, 30));
        jToolBar1.setPreferredSize(new java.awt.Dimension(570, 30));
        jToolBar1.setRequestFocusEnabled(false);

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_search_20px.png"))); // NOI18N
        searchIcon.setRequestFocusEnabled(false);
        jToolBar1.add(searchIcon);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(10, 0));
        jToolBar1.add(jSeparator2);

        searchTextField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        searchTextField.setForeground(new java.awt.Color(128, 128, 128));
        searchTextField.setText("Search");
        searchTextField.setToolTipText("Search Librarian");
        searchTextField.setMaximumSize(new java.awt.Dimension(200, 20));
        searchTextField.setMinimumSize(new java.awt.Dimension(200, 20));
        searchTextField.setPreferredSize(new java.awt.Dimension(200, 20));
        searchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchTextFieldFocusLost(evt);
            }
        });
        searchTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextFieldKeyPressed(evt);
            }
        });
        jToolBar1.add(searchTextField);

        jSeparator1.setName(""); // NOI18N
        jSeparator1.setSeparatorSize(new java.awt.Dimension(210, 0));
        jToolBar1.add(jSeparator1);

        refreshBtn.setBackground(new java.awt.Color(255, 255, 255));
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_refresh_30px.png"))); // NOI18N
        refreshBtn.setToolTipText("Refresh");
        refreshBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshBtn.setFocusable(false);
        refreshBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        refreshBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        refreshBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        refreshBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        refreshBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(refreshBtn);

        jSeparator5.setSeparatorSize(new java.awt.Dimension(10, 0));
        jToolBar1.add(jSeparator5);

        viewBtn.setBackground(new java.awt.Color(255, 255, 255));
        viewBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_view_30px.png"))); // NOI18N
        viewBtn.setToolTipText("View Librarian");
        viewBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        viewBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBtn.setFocusable(false);
        viewBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        viewBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        viewBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        viewBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(viewBtn);

        jSeparator3.setName(""); // NOI18N
        jSeparator3.setSeparatorSize(new java.awt.Dimension(10, 0));
        jToolBar1.add(jSeparator3);

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_delete_30px.png"))); // NOI18N
        deleteBtn.setToolTipText("Delete Librarian");
        deleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        deleteBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteBtn.setFocusable(false);
        deleteBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        deleteBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        deleteBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        deleteBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        deleteBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(deleteBtn);

        jSeparator4.setName(""); // NOI18N
        jSeparator4.setSeparatorSize(new java.awt.Dimension(10, 0));
        jToolBar1.add(jSeparator4);

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_add_30px.png"))); // NOI18N
        addBtn.setToolTipText("Add Librarian");
        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 0));
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setFocusable(false);
        addBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addBtn.setMaximumSize(new java.awt.Dimension(30, 30));
        addBtn.setMinimumSize(new java.awt.Dimension(30, 30));
        addBtn.setPreferredSize(new java.awt.Dimension(30, 30));
        addBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jToolBar1.add(addBtn);

        jPanel1.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 590, 30));

        librarianTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Librarian Name", "Email Address", "Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(librarianTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 590, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 350));

        fileMenu.setText("File");

        logoutMenuItem.setText("Logout");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(logoutMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        MenuBar.add(fileMenu);

        helpMenu.setText("Help");

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        MenuBar.add(helpMenu);

        setJMenuBar(MenuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getLibrarianInfo() throws SQLException{
        DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Librarian Name", "Email Address", "Contact"}, 0);
        String getMoviesQuery="SELECT `id`, `name`, `email`, `contact` FROM `users` WHERE `role_id` = 2";
        try{
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(getMoviesQuery)) {
                rs = pst.executeQuery();
                while(rs.next())
                {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    int contact = rs.getInt("contact");
                    model.addRow(new Object[]{id, name, email, contact});
                }   
            }
            rs.close();
            DBConnectClass.getConnection().close();
        }catch(SQLException ex){
            Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        librarianTable.setModel(model);
    }
    
    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutFrm abFrm = new AboutFrm();
        abFrm.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddLibrarianFrm aLFrm = new AddLibrarianFrm();
        aLFrm.setVisible(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        LoginFrm lgnFrm = new LoginFrm();
        lgnFrm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            getLibrarianInfo();
        } catch (SQLException ex) {
            Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        if (librarianTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a record to view info", "Row not selected", 2);
        } else {
            int column = 0;
            int row = librarianTable.getSelectedRow();
            int idvalue = (int) librarianTable.getModel().getValueAt(row, column);
            ViewLibrarianInfo librarianInfo = new ViewLibrarianInfo(idvalue);
            librarianInfo.pack();
            librarianInfo.setVisible(true);
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (librarianTable.getSelectionModel().isSelectionEmpty()) {
            JOptionPane.showMessageDialog(null, "Please select a record to delete", "Row not selected", 2);
        } else {
            int column = 0;
            int row = librarianTable.getSelectedRow();
            int idvalue = (int) librarianTable.getModel().getValueAt(row, column);
            
            int result = JOptionPane.showConfirmDialog(null,"Do you want to delete this account from the database?", "Confirm Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               String getMoviesQuery="DELETE FROM `users` WHERE `id` = '"+idvalue+"'";
                try{
                    try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(getMoviesQuery)) {
                        pst.executeUpdate();  
                    }
                    DBConnectClass.getConnection().close();
                    JOptionPane.showMessageDialog(null, "Record Deleted!");
                }catch(SQLException ex){
                    Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusGained
        if (searchTextField.getText().equals("Search")) {
            searchTextField.setText("");
            searchTextField.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_searchTextFieldFocusGained

    private void searchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchTextFieldFocusLost
        if (searchTextField.getText().isEmpty()) {
            searchTextField.setForeground(Color.GRAY);
            searchTextField.setText("Search");
        }
    }//GEN-LAST:event_searchTextFieldFocusLost

    private void searchTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextFieldKeyPressed
        DefaultTableModel searchTableModel = new DefaultTableModel(new String[]{"ID", "Librarian Name", "Email Address", "Contact"}, 0);
        searchTableModel.setRowCount(0);
        String searchValue = searchTextField.getText();
        String query = "";
        if(searchValue.equals("")){
            query = "SELECT `id`, `name`, `email`, `contact` FROM `users` WHERE `role_id` = 2";
        }else{
            query = "SELECT `id`, `name`, `email`, `contact` FROM `users` WHERE `role_id` = 2 AND `name` LIKE '%" + searchValue + "%' OR `contact` LIKE '%" + searchValue + "%'";
        }
        try {
            ResultSet rs;
            try (PreparedStatement pst = DBConnectClass.getConnection().prepareStatement(query)) {
                rs = pst.executeQuery();
                while(rs.next()){
                    int id = rs.getInt("id"); 
                    String name = rs.getString("name");
                    String email = rs.getString("email");
                    int contact = rs.getInt("contact");
                    searchTableModel.addRow(new Object[]{id, name, email, contact});
                }
            }
            rs.close();
            DBConnectClass.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
        librarianTable.setModel(searchTableModel);
    }//GEN-LAST:event_searchTextFieldKeyPressed

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
            java.util.logging.Logger.getLogger(AdminFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new AdminFrm().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(AdminFrm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable librarianTable;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
