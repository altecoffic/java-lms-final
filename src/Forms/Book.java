package Forms;

import java.sql.*;
import Project.ConnectionProvider;
import java.awt.HeadlessException;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.BookModel;

public class Book extends javax.swing.JFrame {

    private List<BookModel> books = new ArrayList<>();
    private DefaultTableModel model;
    DefaultTableModel dm;

    public Book() {
        initComponents();
        fetch_data();
        categoryList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        isbnField = new javax.swing.JTextField();
        isbnText = new javax.swing.JLabel();
        categoryText = new javax.swing.JLabel();
        bookTitle = new javax.swing.JLabel();
        bookTitleField = new javax.swing.JTextField();
        authorField = new javax.swing.JTextField();
        copiesField = new javax.swing.JTextField();
        publisherField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        authorText = new javax.swing.JLabel();
        copyText = new javax.swing.JLabel();
        publisherText = new javax.swing.JLabel();
        priceText = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        categoryCombo = new javax.swing.JComboBox<>();
        categoryBox = new javax.swing.JComboBox<>();
        bookIDField = new javax.swing.JTextField();
        studentIDField = new javax.swing.JTextField();
        issueDateField = new com.toedter.calendar.JDateChooser();
        dueDateField = new com.toedter.calendar.JDateChooser();
        issueBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        dueDate = new javax.swing.JLabel();
        issueDate = new javax.swing.JLabel();
        studentID = new javax.swing.JLabel();
        bookID = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        bookIDNewBook = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookListTable = new rojerusan.RSTableMetro();
        returnBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(270, 70));
        setMinimumSize(new java.awt.Dimension(1090, 710));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1090, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 246, 250));
        jPanel1.setMaximumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setMinimumSize(new java.awt.Dimension(1090, 710));
        jPanel1.setPreferredSize(new java.awt.Dimension(1090, 710));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBtn.setBackground(new java.awt.Color(204, 255, 255));
        addBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Exit_26px_1.png"))); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, 100, 30));

        updateBtn.setBackground(new java.awt.Color(204, 255, 204));
        updateBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 460, -1, 30));

        cancelBtn.setBackground(new java.awt.Color(255, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancelBtn.setText("CANCEL");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, -1, 40));

        isbnField.setBackground(new java.awt.Color(255, 255, 204));
        isbnField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(isbnField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 260, 30));

        isbnText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        isbnText.setText("ISBN            :");
        jPanel1.add(isbnText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, -1, -1));

        categoryText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        categoryText.setText("Category      :");
        jPanel1.add(categoryText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 140, 30));

        bookTitle.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookTitle.setText("Book Title     :");
        jPanel1.add(bookTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 120, 30));

        bookTitleField.setBackground(new java.awt.Color(255, 255, 204));
        bookTitleField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(bookTitleField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 260, 32));

        authorField.setBackground(new java.awt.Color(255, 255, 204));
        authorField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(authorField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 260, 32));

        copiesField.setBackground(new java.awt.Color(255, 255, 204));
        copiesField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(copiesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 260, 30));

        publisherField.setBackground(new java.awt.Color(255, 255, 204));
        publisherField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(publisherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 260, 30));

        priceField.setBackground(new java.awt.Color(255, 255, 204));
        priceField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        jPanel1.add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 260, 30));

        authorText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        authorText.setText("Author         :");
        jPanel1.add(authorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 120, 30));

        copyText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        copyText.setText("No. of Copies:");
        jPanel1.add(copyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, 140, -1));

        publisherText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        publisherText.setText("Publisher      :");
        jPanel1.add(publisherText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 120, 40));

        priceText.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        priceText.setText("Price            :");
        jPanel1.add(priceText, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 120, -1));

        deleteBtn.setBackground(new java.awt.Color(255, 153, 153));
        deleteBtn.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, 120, 30));

        categoryCombo.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "all", "Sci-Fi", "Romance" }));
        categoryCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryComboActionPerformed(evt);
            }
        });
        jPanel1.add(categoryCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 100, 30));

        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select category" }));
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });
        jPanel1.add(categoryBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 260, 30));

        bookIDField.setBackground(new java.awt.Color(255, 255, 204));
        bookIDField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(bookIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 280, 30));

        studentIDField.setBackground(new java.awt.Color(255, 255, 204));
        studentIDField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(studentIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 250, 30));

        issueDateField.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(issueDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 280, 30));

        dueDateField.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(dueDateField, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 280, 30));

        issueBtn.setBackground(new java.awt.Color(153, 255, 153));
        issueBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        issueBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/issue book.png"))); // NOI18N
        issueBtn.setText("Issue");
        issueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueBtnActionPerformed(evt);
            }
        });
        jPanel1.add(issueBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, 40));

        closeBtn.setBackground(new java.awt.Color(153, 255, 153));
        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 110, 40));

        dueDate.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        dueDate.setText("Due Date  :");
        jPanel1.add(dueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, -1));

        issueDate.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        issueDate.setText("Issue Date:");
        jPanel1.add(issueDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, -1));

        studentID.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        studentID.setText("Student ID:");
        jPanel1.add(studentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 120, -1));

        bookID.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookID.setText("Book ID     :");
        jPanel1.add(bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, -1));

        idField.setBackground(new java.awt.Color(255, 255, 204));
        idField.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        jPanel1.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 260, 30));

        bookIDNewBook.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        bookIDNewBook.setText("Book ID       :");
        jPanel1.add(bookIDNewBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, 140, -1));

        bookListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Book ID", "ISBN", "CATEGORY", "TITLE", "AUTHOR", "NO. OF COPIES", "PUBLISHER", "PRICE"
            }
        ));
        jScrollPane1.setViewportView(bookListTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 990, 120));

        returnBtn.setBackground(new java.awt.Color(153, 255, 153));
        returnBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        returnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/return book png.png"))); // NOI18N
        returnBtn.setText("Return");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 120, 30));

        searchBtn.setBackground(new java.awt.Color(255, 255, 204));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        updateBtn.setVisible(false);
    }//GEN-LAST:event_idFieldActionPerformed

    //to get the data from the database and display on the table
    public void fetch_data() {

        dm = (DefaultTableModel) bookListTable.getModel();
//        dm.();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "select * from books";
            ResultSet rs = st.executeQuery(sql);
//            bookListTable.setModel(DbUtils.resultSetToTableModel(rs));
            while (rs.next()) {
                BookModel book = new BookModel();
                book.setBookID(rs.getString(1));
                book.setIsbn(rs.getString(2));
                book.setBookCategory(rs.getString(3));
                book.setTitle(rs.getString(4));
                book.setAuthor(rs.getString(5));
                book.setNoOfCopies(rs.getString(6));
                book.setPublisher(rs.getString(7));
                book.setPrice(rs.getString(8));
                this.books.add(book);
            }
            st.close();
            rs.close();
            con.close();
            this.populateTable(books);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            String sql = "UPDATE books SET isbn='" + this.isbnField.getText() + "', bookCategory='" + this.categoryBox.getSelectedItem().toString() + "',title='" + this.bookTitleField.getText() + "',author='" + this.authorField.getText() + "', noOfCopies='" + this.copiesField.getText() + "', publisher='" + this.publisherField.getText() + "', price='" + this.priceField.getText() + "' WHERE bookID='" + idField.getText() + "'";

            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Successfully update data!");
//            new Statistics().setVisible(true);
//            this.setVisible(false);
            fetch_data();
            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String bookID = idField.getText();
        String isbn = isbnField.getText();
        String bookCategory = categoryBox.getSelectedItem().toString();;
        String title = bookTitleField.getText();
        String author = authorField.getText();
        String noOfCopies = copiesField.getText();
        String publisher = publisherField.getText();
        String price = priceField.getText();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO books VALUES(" + bookID + ",'" + isbn + "','" + bookCategory + "','" + title + "','" + author + "','" + noOfCopies + "','" + publisher + "'," + price + ")");

            JOptionPane.showMessageDialog(null, "Successfully Added!");
            setVisible(false);
            new Book().setVisible(true);
            st.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Student ID Already Exist!");
            setVisible(false);
            new Book().setVisible(true);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();

            stmt.executeUpdate("DELETE FROM books WHERE bookID=" + idField.getText() + "");

            JOptionPane.showMessageDialog(null, "Record Successfully Deleted");
            stmt.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
//         fetch_data() ;
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void categoryComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryComboActionPerformed

        // Filter books by category.
        String selectedCategory = this.categoryCombo.getSelectedItem().toString();

        List<BookModel> filterCategory;
        if (!selectedCategory.equals("all")) {
            filterCategory = this.books.stream()
                    .filter(product -> this.categoryCombo
                    .getSelectedItem()
                    .equals(product.getBookCategory()))
                    .collect(Collectors.toList());
        } else {
            filterCategory = this.books;
        }

        this.populateTable(filterCategory);
    }//GEN-LAST:event_categoryComboActionPerformed

    private void issueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBtnActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
//        String bookID = bookIDField.getText();
//        String studentID = studentIDField.getText();
//        String issueDate = dateFormat.format(issueDateField.getDate());
//        String dueDate = dateFormat.format(dueDateField.getDate());
        String returnBook = "NO";

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet resSet = st.executeQuery("select * from books where bookID='" + bookIDField.getText() + "'");
            if (resSet.next()) {
                ResultSet resSet1 = st.executeQuery("select * from student where studentID='" + studentIDField.getText() + "'");
                if (resSet1.next()) {
                    st.executeUpdate("INSERT INTO issuebook (bookID ,studentID,issueDate,dueDate,returnBook) VALUES ('" + bookIDField.getText() + "','" + studentIDField.getText() + "','" + dateFormat.format(issueDateField.getDate()) + "','" + dateFormat.format(dueDateField.getDate()) + "', '" + returnBook + "')");
                    JOptionPane.showConfirmDialog(null, "Book Succesfully Issued!");
                    // JOptionPane.showConfirmDialog(null, "Book Succesfully Issued!");
                    setVisible(false);
                    new Dashboard().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Student ID!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Incorrect Book ID!");
            }
            con.close();
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_issueBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryBoxActionPerformed

    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
//        String bookID = bookIDField.getText();
//        String studentID = studentIDField.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update issuebook set returnBook='YES' where studentID='" + studentIDField.getText() + "' and bookID='" + bookIDField.getText() + "'");
            JOptionPane.showMessageDialog(null, "Book successfully returned!");
            setVisible(false);
            new ReturnBook().setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_returnBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
//        String bookID = bookIDField.getText();
//        String studentID = studentIDField.getText();
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet resSet = st.executeQuery("select * from issuebook where bookID='" + bookIDField.getText() + "' and studentID='" + studentIDField.getText() + "'");
            if (resSet.next()) {
             
                bookIDField.setEditable(false);
                studentIDField.setEditable(false);
//                   issueDateField.setText(resSet.getString(3));
//
//                dueDateField.setText(resSet.getString(4));
            } else {
                JOptionPane.showMessageDialog(null, "Book is not issued to this Students");
                setVisible(false);
                new ReturnBook().setVisible(true);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error!");

        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void categoryList() {

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "select * from category";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                categoryBox.addItem(rs.getString(2));
                categoryCombo.addItem(rs.getString(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void populateTable(List<BookModel> books) {
        this.model = new DefaultTableModel();
        this.model.setColumnIdentifiers(new Object[]{"Book ID", "ISBN", "Category", "Title", "Author", "No of Copies", "Publisher", "Price"});

        for (BookModel book : books) {
            Object rowdata[] = new Object[8];
            rowdata[0] = book.getBookID();
            rowdata[1] = book.getIsbn();
            rowdata[2] = book.getBookCategory();
            rowdata[3] = book.getTitle();
            rowdata[4] = book.getAuthor();
            rowdata[5] = book.getNoOfCopies();
            rowdata[6] = book.getPublisher();
            rowdata[7] = book.getPrice();

            this.model.addRow(rowdata);
        }

        this.bookListTable.setModel(model);

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField authorField;
    private javax.swing.JLabel authorText;
    private javax.swing.JLabel bookID;
    private javax.swing.JTextField bookIDField;
    private javax.swing.JLabel bookIDNewBook;
    private rojerusan.RSTableMetro bookListTable;
    private javax.swing.JLabel bookTitle;
    private javax.swing.JTextField bookTitleField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JComboBox<String> categoryCombo;
    private javax.swing.JLabel categoryText;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField copiesField;
    private javax.swing.JLabel copyText;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel dueDate;
    private com.toedter.calendar.JDateChooser dueDateField;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField isbnField;
    private javax.swing.JLabel isbnText;
    private javax.swing.JButton issueBtn;
    private javax.swing.JLabel issueDate;
    private com.toedter.calendar.JDateChooser issueDateField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField priceField;
    private javax.swing.JLabel priceText;
    private javax.swing.JTextField publisherField;
    private javax.swing.JLabel publisherText;
    private javax.swing.JButton returnBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel studentID;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
