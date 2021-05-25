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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hi
 */
public class StudentList extends javax.swing.JFrame {

 
    /**
     * Creates new form StudentList
     */
    public StudentList() {
        initComponents();
        fetch_data();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameField = new javax.swing.JTextField();
        lastNameField = new javax.swing.JTextField();
        courseCombo = new javax.swing.JComboBox<>();
        branchCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JTable();
        saveBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        studentIdField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstNameField.setBackground(new java.awt.Color(255, 255, 204));
        firstNameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        firstNameField.setPreferredSize(new java.awt.Dimension(200, 20));
        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 280, 40));

        lastNameField.setBackground(new java.awt.Color(255, 255, 204));
        lastNameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lastNameField.setPreferredSize(new java.awt.Dimension(200, 20));
        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(lastNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 280, 40));

        courseCombo.setBackground(new java.awt.Color(255, 255, 204));
        courseCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        courseCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Formal Sciences" }));
        courseCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseComboActionPerformed(evt);
            }
        });
        getContentPane().add(courseCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 280, 40));

        branchCombo.setBackground(new java.awt.Color(255, 255, 204));
        branchCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        branchCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSIT", "BSCS", "BSIS", "BS Mathematics", " " }));
        getContentPane().add(branchCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 280, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Branch Name :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 160, 30));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Name :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 160, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name      :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 150, 30));

        studentList.setBackground(new java.awt.Color(204, 255, 204));
        studentList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "studentID", "firstName", "middleName", "lastName", "courseName", "branchName"
            }
        ));
        studentList.setGridColor(new java.awt.Color(255, 255, 255));
        studentList.setSelectionBackground(new java.awt.Color(0, 51, 51));
        studentList.setSelectionForeground(new java.awt.Color(0, 255, 0));
        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentListMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(studentList);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 860, 100));

        saveBtn.setBackground(new java.awt.Color(153, 255, 153));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save-icon--1.png"))); // NOI18N
        saveBtn.setText("SAVE");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
        });
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name      :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 160, 30));

        cancel.setBackground(new java.awt.Color(153, 255, 153));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("STUDENT LIST");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 280, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stats.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 770));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID                    :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 150, 20));

        studentIdField.setBackground(new java.awt.Color(255, 255, 204));
        studentIdField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        studentIdField.setPreferredSize(new java.awt.Dimension(200, 20));
        studentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdFieldActionPerformed(evt);
            }
        });
        getContentPane().add(studentIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void courseComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseComboActionPerformed

    //to get the data from the database and display on the table
    public void fetch_data() {
        DefaultTableModel dm;
        dm = (DefaultTableModel) studentList.getModel();

        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            String sql = "select * from student";
            ResultSet rs = st.executeQuery(sql);
            studentList.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

    }//GEN-LAST:event_saveBtnActionPerformed

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdFieldActionPerformed

    }//GEN-LAST:event_studentIdFieldActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        new NewStudent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cancelActionPerformed

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        try {
            Connection con = ConnectionProvider.getCon();
            Statement stmt = con.createStatement();
            String sql = "UPDATE student SET firstName='" + this.firstNameField.getText() +"', lastName='" + this.lastNameField.getText() + "' WHERE studentID='" + studentIdField.getText() + "'";
           
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Successfully updated data!");

//            new Statistics().setVisible(true);
            this.setVisible(false);
            con.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_saveBtnMouseClicked

    private void studentListMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMousePressed

    }//GEN-LAST:event_studentListMousePressed

    private void studentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseClicked

        String studentId;
        String firstName;
        String lastName;
        String courseName;
        String branchName;
        int row = studentList.getSelectedRow();
        studentId = (studentList.getModel().getValueAt(row, 0).toString());
        firstName = (studentList.getModel().getValueAt(row, 1).toString());
        lastName = (studentList.getModel().getValueAt(row, 2).toString());
        courseName = (studentList.getModel().getValueAt(row, 3).toString());
        branchName = (studentList.getModel().getValueAt(row, 4).toString());

        studentIdField.setText(studentId);
        firstNameField.setText(firstName);
        lastNameField.setText(lastName);
        courseCombo.getSelectedItem();
        branchCombo.getSelectedItem();
    }//GEN-LAST:event_studentListMouseClicked

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
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> branchCombo;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> courseCombo;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField studentIdField;
    private javax.swing.JTable studentList;
    // End of variables declaration//GEN-END:variables
}
