package Forms;

import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class NewBook extends javax.swing.JFrame {

    private String bookID;
    public NewBook() {
        initComponents();
        fetch_data();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bookList = new javax.swing.JButton();
        bookIDField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        bookTitleField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        isbnField = new javax.swing.JTextField();
        copiesField = new javax.swing.JTextField();
        publisherField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        priceNewBook = new javax.swing.JLabel();
        publisherNewBook = new javax.swing.JLabel();
        publisherYear1 = new javax.swing.JLabel();
        priceNewBook1 = new javax.swing.JLabel();
        nameNewBook1 = new javax.swing.JLabel();
        nameNewBook = new javax.swing.JLabel();
        nameNewBook2 = new javax.swing.JLabel();
        bookIDNewBook = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bookListTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1090, 710));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookList.setBackground(new java.awt.Color(153, 255, 255));
        bookList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bookList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue book.png"))); // NOI18N
        bookList.setText("View Book List");
        bookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListMouseClicked(evt);
            }
        });
        bookList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookListActionPerformed(evt);
            }
        });
        jPanel1.add(bookList, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 390, -1, -1));

        bookIDField.setBackground(new java.awt.Color(255, 255, 204));
        bookIDField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        bookIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(bookIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 260, 30));

        categoryField.setBackground(new java.awt.Color(255, 255, 204));
        categoryField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(categoryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 260, 32));

        bookTitleField.setBackground(new java.awt.Color(255, 255, 204));
        bookTitleField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(bookTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 260, 32));

        authorField.setBackground(new java.awt.Color(255, 255, 204));
        authorField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 260, 32));

        isbnField.setBackground(new java.awt.Color(255, 255, 204));
        isbnField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(isbnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 260, 30));

        copiesField.setBackground(new java.awt.Color(255, 255, 204));
        copiesField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(copiesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 260, 30));

        publisherField.setBackground(new java.awt.Color(255, 255, 204));
        publisherField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(publisherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 260, 30));

        priceField.setBackground(new java.awt.Color(255, 255, 204));
        priceField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 260, 30));

        priceNewBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        priceNewBook.setText("Price                :");
        jPanel1.add(priceNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 400, 140, -1));

        publisherNewBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        publisherNewBook.setText("Publisher          :");
        jPanel1.add(publisherNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 140, -1));

        publisherYear1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        publisherYear1.setText("No. of Copies    :");
        jPanel1.add(publisherYear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 160, -1));

        priceNewBook1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        priceNewBook1.setText("ISBN                :");
        jPanel1.add(priceNewBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 140, -1));

        nameNewBook1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        nameNewBook1.setText("Author             :");
        jPanel1.add(nameNewBook1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 140, 30));

        nameNewBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        nameNewBook.setText("Book Title         :");
        jPanel1.add(nameNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 140, 30));

        nameNewBook2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        nameNewBook2.setText("Category          :");
        jPanel1.add(nameNewBook2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 160, 30));

        bookIDNewBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        bookIDNewBook.setText("Book ID            :");
        jPanel1.add(bookIDNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 160, -1));

        addBtn.setBackground(new java.awt.Color(153, 255, 153));
        addBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 110, 40));

        updateBtn.setBackground(new java.awt.Color(153, 255, 153));
        updateBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 130, 40));

        cancel.setBackground(new java.awt.Color(153, 255, 153));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        bookListTable.setBackground(new java.awt.Color(204, 255, 204));
        bookListTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "bookID", "isbn", "bookCategory", "title", "author", "noOfCopies", "publisher", "price"
            }
        ));
        bookListTable.setGridColor(new java.awt.Color(255, 255, 255));
        bookListTable.setSelectionBackground(new java.awt.Color(0, 51, 51));
        bookListTable.setSelectionForeground(new java.awt.Color(0, 255, 0));
        bookListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookListTableMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(bookListTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, 990, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        //        String id = bookIDField.getText();
        //        int studentId = Integer.parseInt(id);
        //        String firstName = bookTitleField.getText();
        //
        //        String lastName = priceField.getText();
        //
        //        try {
            //            Connection con = ConnectionProvider.getCon();
            //            Statement st = con.createStatement();
            //            //            st.executeUpdate("update student set('" + firstName + "','" + middleName + "','" + lastName + "','" + courseName + "','" + branchName + "')");
            //            //            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            //            //            setVisible(false);
            //            String sql = "UPDATE student set firstName='" + firstName + "' ,lastName='" + lastName + "' WHERE ID='" + studentId + "'";
            //
            //            PreparedStatement pst = con.prepareStatement(sql);
            //            pst.execute();
            //            new NewStudent().setVisible(true);
            //        } catch (Exception e) {
            //            //JOptionPane.showMessageDialog(null, "Student ID Already Exist!");
            //            setVisible(false);
            //            new NewStudent().setVisible(true);
            //        }
        //
        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            String sql = "UPDATE books SET isbn='" + this.isbnField.getText() +"', bookCategory	='" + this.categoryField.getText() +"', title	='" + this.bookTitleField.getText() +"', author	='" + this.authorField.getText() +"', noOfCopies='" + this.copiesField.getText() +"', publisher	='" + this.publisherField.getText() +"', price	='" + this.priceField.getText() +"' WHERE studentID='" + bookIDField.getText() + "'";            String sq ="UPDATE books SET isbn = '" +this.isbnField.getText()+"',bookCategory = '"+this.categoryField.getText()+"',title	='"+this.bookTitleField.getText()+"',author ='"+this.authorField.getText()+"',noOfCopies='"+this.copiesField.getText()+"',publisher'"+ this.publisherField.getText()+"',price='"+this.priceField.getText()+"' WHERE bookID = '"+this.bookIDField.getText()+"'";
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Successfully updated data!");

//            new Statistics().setVisible(true);
            this.setVisible(false);
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    //for save
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String bookID = bookIDField.getText();
        String isbn	 = isbnField.getText();
        String bookCategory = categoryField.getText();
        String title = bookTitleField.getText();
        String author = authorField.getText();
        String noOfCopies = copiesField.getText();
        String publisher = publisherField.getText();
        String price = priceField.getText();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into books values('" + bookID + "','" + isbn + "','" + bookCategory + "','" + title + "','" + author + "','" + noOfCopies + "','" + publisher + "','" + price + "')");
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            setVisible(false);
            new NewBook().setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Book ID Already Exist!");
            setVisible(false);
            new NewBook().setVisible(true);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void bookIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIDFieldActionPerformed

    private void bookListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookListActionPerformed

    private void bookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListMouseClicked
        new BookList().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_bookListMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new NewStudent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void bookListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListTableMouseClicked

    
    }//GEN-LAST:event_bookListTableMouseClicked

    private void bookListTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListTableMousePressed

    }//GEN-LAST:event_bookListTableMousePressed

 //to get the data from the database and display on the table
    public void fetch_data() {
        DefaultTableModel dm;
        dm = (DefaultTableModel)bookListTable.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "select * from books";
            ResultSet rs = st.executeQuery(sql);
            bookListTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField authorField;
    private javax.swing.JTextField bookIDField;
    private javax.swing.JLabel bookIDNewBook;
    private javax.swing.JButton bookList;
    private javax.swing.JTable bookListTable;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField categoryField;
    private javax.swing.JTextField copiesField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameNewBook;
    private javax.swing.JLabel nameNewBook1;
    private javax.swing.JLabel nameNewBook2;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceNewBook;
    private javax.swing.JLabel priceNewBook1;
    private javax.swing.JTextField publisherField;
    private javax.swing.JLabel publisherNewBook;
    private javax.swing.JLabel publisherYear1;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
