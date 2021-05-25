
package Forms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        showTime();
        showDate();
        new Data().setVisible(true);

    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
        date.setText(s.format(d));
      
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timelab.setText(s.format(d));

            }
        }).start();

    }

    public void setColor(JPanel book) {
        book.setBackground(new Color(72, 91, 99));
    }

    public void resetColor(JPanel book2) {
        book2.setBackground(new Color(51, 51, 51));
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        studPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        returnPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        issuedPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        dashboard = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        finesPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        historyPanel = new javax.swing.JPanel();
        history = new javax.swing.JLabel();
        statPanel = new javax.swing.JPanel();
        logoutPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        bookPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lostPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logonav.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, 60));

        close.setBackground(new java.awt.Color(204, 255, 255));
        close.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        close.setForeground(new java.awt.Color(255, 0, 0));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 50, 60));

        jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel14.setForeground(java.awt.Color.white);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/male_user_50px.png"))); // NOI18N
        jLabel14.setText(" Welcome Admin");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 70));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studPanel.setBackground(new java.awt.Color(51, 51, 51));
        studPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studPanelMouseExited(evt);
            }
        });
        studPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel6.setText(" Manage  Students");
        studPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(studPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 270, 50));

        returnPanel.setBackground(new java.awt.Color(51, 51, 51));
        returnPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnPanelMouseExited(evt);
            }
        });
        returnPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Return_Purchase_26px.png"))); // NOI18N
        jLabel7.setText(" Return Books");
        returnPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(returnPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 270, 50));

        issuedPanel.setBackground(new java.awt.Color(51, 51, 51));
        issuedPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        issuedPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issuedPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issuedPanelMouseExited(evt);
            }
        });
        issuedPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Read_Online_26px.png"))); // NOI18N
        jLabel9.setText(" Issued Books");
        issuedPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(issuedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 270, 50));

        dashboard.setBackground(new java.awt.Color(51, 51, 51));
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_View_Details_26px.png"))); // NOI18N
        jLabel3.setText("  Dashboard");
        dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        jPanel2.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 270, 50));

        finesPanel.setBackground(new java.awt.Color(51, 51, 51));
        finesPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        finesPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        finesPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        finesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                finesPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                finesPanelMouseExited(evt);
            }
        });
        finesPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Sell_26px.png"))); // NOI18N
        jLabel12.setText(" Fines");
        finesPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(finesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 270, 50));

        historyPanel.setBackground(new java.awt.Color(51, 51, 51));
        historyPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        historyPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        historyPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        historyPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                historyPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                historyPanelMouseExited(evt);
            }
        });
        historyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        history.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        history.setForeground(new java.awt.Color(255, 255, 255));
        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Conference_26px.png"))); // NOI18N
        history.setText(" History");
        historyPanel.add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 10, 110, 30));

        jPanel2.add(historyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 270, 50));

        statPanel.setBackground(new java.awt.Color(51, 51, 51));
        statPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        statPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        statPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        statPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                statPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statPanelMouseExited(evt);
            }
        });
        statPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(statPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 270, 50));

        logoutPanel.setBackground(new java.awt.Color(191, 34, 34));
        logoutPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        logoutPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        logoutPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
        });
        logoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Exit_26px.png"))); // NOI18N
        jLabel13.setText(" Log Out");
        logoutPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        jPanel2.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 270, 50));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Features");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 50));

        bookPanel.setBackground(new java.awt.Color(51, 51, 51));
        bookPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bookPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bookPanelMouseExited(evt);
            }
        });
        bookPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Books_26px.png"))); // NOI18N
        jLabel5.setText(" Manage Books");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        bookPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(bookPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 270, 50));

        lostPanel.setBackground(new java.awt.Color(51, 51, 51));
        lostPanel.setMaximumSize(new java.awt.Dimension(217, 40));
        lostPanel.setMinimumSize(new java.awt.Dimension(217, 40));
        lostPanel.setPreferredSize(new java.awt.Dimension(217, 40));
        lostPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lostPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lostPanelMouseExited(evt);
            }
        });
        lostPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/adminIcons/icons8_Book_26px.png"))); // NOI18N
        jLabel11.setText(" Lost Books");
        lostPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel2.add(lostPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 270, 50));

        timelab.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        timelab.setForeground(new java.awt.Color(255, 255, 255));
        timelab.setText("Time");
        jPanel2.add(timelab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 140, 40));

        date.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 130, 40));

        date1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("Month:");
        jPanel2.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 40));

        date2.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setText("Date   :");
        jPanel2.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 700));

        jPanel3.setBackground(new java.awt.Color(233, 246, 250));
        jPanel3.setLayout(null);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 1095, 710));

        setSize(new java.awt.Dimension(1360, 764));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void bookPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookPanelMouseEntered
        setColor(bookPanel);
    }//GEN-LAST:event_bookPanelMouseEntered

    private void bookPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookPanelMouseExited
        resetColor(bookPanel);
    }//GEN-LAST:event_bookPanelMouseExited

    private void studPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studPanelMouseEntered
        setColor(studPanel);
    }//GEN-LAST:event_studPanelMouseEntered

    private void studPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studPanelMouseExited
        resetColor(studPanel);
    }//GEN-LAST:event_studPanelMouseExited

    private void returnPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnPanelMouseEntered
        setColor(returnPanel);
    }//GEN-LAST:event_returnPanelMouseEntered

    private void returnPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnPanelMouseExited
        resetColor(returnPanel);
    }//GEN-LAST:event_returnPanelMouseExited

    private void issuedPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedPanelMouseEntered
        setColor(issuedPanel);
    }//GEN-LAST:event_issuedPanelMouseEntered

    private void issuedPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuedPanelMouseExited
        resetColor(issuedPanel);
    }//GEN-LAST:event_issuedPanelMouseExited

    private void lostPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lostPanelMouseEntered
        setColor(lostPanel);
    }//GEN-LAST:event_lostPanelMouseEntered

    private void lostPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lostPanelMouseExited
        resetColor(lostPanel);
    }//GEN-LAST:event_lostPanelMouseExited

    private void historyPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelMouseEntered
        setColor(historyPanel);
    }//GEN-LAST:event_historyPanelMouseEntered

    private void historyPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelMouseExited
        resetColor(historyPanel);
    }//GEN-LAST:event_historyPanelMouseExited

    private void finesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finesPanelMouseEntered
        setColor(finesPanel);
    }//GEN-LAST:event_finesPanelMouseEntered

    private void finesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finesPanelMouseExited
        resetColor(finesPanel);
    }//GEN-LAST:event_finesPanelMouseExited

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        setColor(dashboard);
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        resetColor(dashboard);
    }//GEN-LAST:event_dashboardMouseExited

    private void statPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statPanelMouseEntered
        setColor(statPanel);
    }//GEN-LAST:event_statPanelMouseEntered

    private void statPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statPanelMouseExited
        resetColor(statPanel);
    }//GEN-LAST:event_statPanelMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        new Book().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void studPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studPanelMouseClicked
        new Student().setVisible(true);
    }//GEN-LAST:event_studPanelMouseClicked

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        // TODO add your handling code here:
        new Data().setVisible(true);
    }//GEN-LAST:event_dashboardMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new Dashboard().setVisible(true);
        new Data().setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void historyPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyPanelMouseClicked
        new History().setVisible(true);
    }//GEN-LAST:event_historyPanelMouseClicked

  
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bookPanel;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JPanel finesPanel;
    private javax.swing.JLabel history;
    private javax.swing.JPanel historyPanel;
    private javax.swing.JPanel issuedPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel lostPanel;
    private javax.swing.JPanel returnPanel;
    private javax.swing.JPanel statPanel;
    private javax.swing.JPanel studPanel;
    private javax.swing.JLabel timelab;
    // End of variables declaration//GEN-END:variables
}
