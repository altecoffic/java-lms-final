package Forms;


import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordField.setBackground(new java.awt.Color(204, 255, 204));
        passwordField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 51, 51));
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 4, 0));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 440, 300, 60));

        loginButton.setBackground(new java.awt.Color(255, 255, 204));
        loginButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        loginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 120, 40));

        closeBtn.setBackground(new java.awt.Color(255, 255, 204));
        closeBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red-x-mark-transparent-background-3.png"))); // NOI18N
        closeBtn.setText("CLOSE");
        closeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 550, 120, 40));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(null);

        usernameTextField.setBackground(new java.awt.Color(204, 255, 204));
        usernameTextField.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        usernameTextField.setForeground(new java.awt.Color(0, 51, 51));
        usernameTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 4, 0));
        usernameTextField.setOpaque(false);
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(usernameTextField);
        usernameTextField.setBounds(20, 10, 270, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 310, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loginBG (2).jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1420, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //login button
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
       //setting the username (admin) and password (admin)
        if(usernameTextField.getText().equals("admin") && passwordField.getText().equals("admin")){
           setVisible(false);
           new Dashboard().setVisible(true);
           new Data().setVisible(true);
//           new Home().setVisible(true);
       }else{
           JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
       }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    //close button
    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        System.exit(0); 
    }//GEN-LAST:event_closeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
