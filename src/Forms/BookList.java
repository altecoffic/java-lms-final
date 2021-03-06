/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hi
 */
public class BookList extends javax.swing.JFrame {

    /**
     * Creates new form BookList
     */
    public BookList() {
        initComponents();
        fetch_data();
        //bookData();
    }
// public void issueData() {
//        int count = 0;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
//            Statement st = con.createStatement();
//            ResultSet resSet = st.executeQuery("select book.bookID,book.bookName,book.publisher,book.price,book.publisherYeareDate from student inner join book inner join issuebook where book.bookID = issuebook.bookID and student.studentID = issuebook.studentID and issuebook.returnBook='NO'");
//            bookList.setModel(DbUtils.resultSetToTableModel(resSet));
//           
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Connection Error");
//        }
//
//    }
// public void bookData() {
//     int count = 0;
//        try {
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/librarydatabase", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet datas = stmt.executeQuery("select * from book");
///           //bookList.setModel(DbUtils.resultSetToTableModel(datas));
//           //DefaultTableModel model = (DefaultTableModel) bookList.getModel();
//            while (datas.next()) {
//
//               // model.addRow(new Object[]{datas.getInt("EmployeeId"), datas.getString("employeeId"), datas.getString("employeeName"), datas.getString("publisher"), datas.getString("price"), datas.getString("publisherYear")});
//
//            }
//            con.close();
//        } catch (Exception e) {
//             JOptionPane.showMessageDialog(null, "Connection Error");
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        bookIdField = new javax.swing.JTextField();
        bookNameField = new javax.swing.JTextField();
        publisherField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pyField = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookList.setBackground(new java.awt.Color(153, 255, 204));
        bookList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        bookList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "bookID", "bookCategory", "author", "publisher", "isbn", "noOfCopies", "price", "shelfNo"
            }
        ));
        bookList.setGridColor(new java.awt.Color(0, 102, 0));
        bookList.setSelectionForeground(new java.awt.Color(0, 255, 255));
        bookList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 810, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK LIST");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 220, 40));

        bookIdField.setBackground(new java.awt.Color(255, 255, 204));
        bookIdField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookIdField.setPreferredSize(new java.awt.Dimension(200, 20));
        bookIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bookIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 270, 30));

        bookNameField.setBackground(new java.awt.Color(255, 255, 204));
        bookNameField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookNameField.setPreferredSize(new java.awt.Dimension(200, 20));
        bookNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(bookNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 270, 30));

        publisherField.setBackground(new java.awt.Color(255, 255, 204));
        publisherField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        publisherField.setPreferredSize(new java.awt.Dimension(200, 20));
        publisherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publisherFieldActionPerformed(evt);
            }
        });
        getContentPane().add(publisherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 270, 30));

        priceField.setBackground(new java.awt.Color(255, 255, 204));
        priceField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        priceField.setPreferredSize(new java.awt.Dimension(200, 20));
        priceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 270, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price                 :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Publisher         :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 150, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Book Name      :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Book ID            :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 200, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Publisher Year:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, -1, -1));

        pyField.setBackground(new java.awt.Color(255, 255, 204));
        pyField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pyField.setPreferredSize(new java.awt.Dimension(200, 20));
        pyField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pyFieldActionPerformed(evt);
            }
        });
        getContentPane().add(pyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 270, 30));

        saveBtn.setBackground(new java.awt.Color(153, 255, 153));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 110, 40));

        cancel.setBackground(new java.awt.Color(153, 255, 153));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 380, -1, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stats.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -40, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookIdFieldActionPerformed

    private void bookNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookNameFieldActionPerformed

    private void publisherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publisherFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_publisherFieldActionPerformed

    private void priceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceFieldActionPerformed

    private void pyFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pyFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pyFieldActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String id = bookIdField.getText();
        int studentId = Integer.parseInt(id);
        String firstName = bookNameField.getText();
     
        String lastName = priceField.getText();
       
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //            st.executeUpdate("update student set('" + firstName + "','" + middleName + "','" + lastName + "','" + courseName + "','" + branchName + "')");
            //            JOptionPane.showMessageDialog(null, "Successfully Updated!");
            //            setVisible(false);
            String sql = "UPDATE student set firstName='" + firstName + "' ,lastName='" + lastName + "' WHERE ID='" + studentId + "'";

            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            new NewStudent().setVisible(true);
        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Student ID Already Exist!");
            setVisible(false);
            new NewStudent().setVisible(true);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new NewBook().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void bookListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListMouseClicked
        String bookID;
        String title;
        String publisher;
        String price;
        String publisherYear;
       
        int row = bookList.getSelectedRow();
        bookID = (bookList.getModel().getValueAt(row, 0).toString());
        title = (bookList.getModel().getValueAt(row, 1).toString());
        publisher = (bookList.getModel().getValueAt(row, 2).toString());
        price = (bookList.getModel().getValueAt(row, 3).toString());
        publisherYear = (bookList.getModel().getValueAt(row, 4).toString());
        

        bookIdField.setText(bookID);
        bookNameField.setText(title);
        publisherField.setText(publisher);
        priceField.setText(price);
        pyField.setText(publisherYear);
      
    }//GEN-LAST:event_bookListMouseClicked
 public void fetch_data() {
        DefaultTableModel dm;
        dm = (DefaultTableModel) bookList.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "select * from books";
            ResultSet rs = st.executeQuery(sql);
            bookList.setModel(DbUtils.resultSetToTableModel(rs));
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
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookIdField;
    private javax.swing.JTable bookList;
    private javax.swing.JTextField bookNameField;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceField;
    private javax.swing.JTextField publisherField;
    private javax.swing.JTextField pyField;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
