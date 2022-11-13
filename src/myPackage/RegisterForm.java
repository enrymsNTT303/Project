
package myPackage;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
/**
 *
 * @author Clover Enryms
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Register Form");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_phoneNum = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jTextField_LN = new javax.swing.JTextField();
        jTextField_UN = new javax.swing.JTextField();
        btn_Register = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabel_clickToLogin = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ADDRESS = new javax.swing.JTextArea();
        txt_phoneNum = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("First Name:");

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setBackground(new java.awt.Color(204, 255, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User Name:");

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Retype Password:");

        jLabel5.setBackground(new java.awt.Color(204, 255, 204));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setBackground(new java.awt.Color(204, 255, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Address:");

        lbl_phoneNum.setBackground(new java.awt.Color(204, 255, 204));
        lbl_phoneNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_phoneNum.setText("Phone Number:");

        jTextField_FN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_FN.setMinimumSize(new java.awt.Dimension(7, 40));
        jTextField_FN.setPreferredSize(new java.awt.Dimension(7, 40));
        jTextField_FN.setSelectionEnd(11);
        jTextField_FN.setSelectionStart(11);
        jTextField_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNActionPerformed(evt);
            }
        });

        jTextField_LN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_LN.setMinimumSize(new java.awt.Dimension(7, 40));
        jTextField_LN.setPreferredSize(new java.awt.Dimension(7, 40));
        jTextField_LN.setSelectionEnd(11);
        jTextField_LN.setSelectionStart(11);

        jTextField_UN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_UN.setMinimumSize(new java.awt.Dimension(7, 40));
        jTextField_UN.setPreferredSize(new java.awt.Dimension(7, 40));
        jTextField_UN.setSelectionEnd(11);
        jTextField_UN.setSelectionStart(11);

        btn_Register.setBackground(new java.awt.Color(153, 255, 153));
        btn_Register.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_Register.setText("Register");
        btn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegisterActionPerformed(evt);
            }
        });

        jButton_CANCEL.setBackground(new java.awt.Color(255, 153, 153));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        jLabel_clickToLogin.setText("Click here to Login");
        jLabel_clickToLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_clickToLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_clickToLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_clickToLoginMouseExited(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Register");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(19, 19, 19))
        );

        jPasswordField_REPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_REPASSActionPerformed(evt);
            }
        });

        jTextArea_ADDRESS.setColumns(20);
        jTextArea_ADDRESS.setRows(5);
        jScrollPane1.setViewportView(jTextArea_ADDRESS);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_Register)
                                .addComponent(lbl_phoneNum)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_phoneNum, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel_clickToLogin)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))
                    .addComponent(lbl_phoneNum))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_CANCEL)
                    .addComponent(btn_Register))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_clickToLogin)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegisterActionPerformed
        
        String fname = jTextField_FN.getText();
        String lname = jTextField_LN.getText();
        String uname = jTextField_UN.getText();
        String pass = String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass= String.valueOf(jPasswordField_REPASS.getPassword());
        String phoneNum = txt_phoneNum.getText();
        String address = jTextArea_ADDRESS.getText();
        
        if(uname.equals("")){
            JOptionPane.showMessageDialog(null, "Add a UserName");
        }else if (pass.equals("")){
            JOptionPane.showMessageDialog(null, "Add a Password");
        }else if (!pass.equals(re_pass)){
            JOptionPane.showMessageDialog(null, "Retype the Password Again!");
        }else if(checkUsername(uname)){
            JOptionPane.showMessageDialog(null, "This UserName Already Exist!");
        }
        
        PreparedStatement ps;
        String query = "INSERT INTO managerUser(m_accountN, m_accountP, m_firstName, m_lastName, m_addr, m_phoneNum) values(?,?,?,?,?,?);";
        try {
            ps = connection.getConnection().prepareStatement(query);
            ps.setString(1, uname);
            ps.setString(2, pass);
            ps.setString(3, fname);
            ps.setString(4, lname);
            ps.setString(5, address);    
            ps.setString(6, phoneNum);

            if(ps.executeUpdate()> 0){
                JOptionPane.showMessageDialog(null, "New User Added!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
          }
        System.out.println("Firstname => "+jTextField_FN.getText());
        System.out.println("Lastname => "+jTextField_LN.getText());
        System.out.println("Username => "+jTextField_UN.getText());
        System.out.println("Password => "+String.valueOf(jPasswordField_PASS.getPassword()));
        System.out.println("Address => "+jTextArea_ADDRESS.getText());
        System.out.println("Phone Number => "+txt_phoneNum.getText());
        
        
        
    }//GEN-LAST:event_btn_RegisterActionPerformed
    //FUNCTION  to check if the username already exist
    public boolean checkUsername(String username){
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser = false;
        String query = "SELECT *FROM managerUser WHERE m_accountN=?";
        try {
            ps = connection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkUser = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
            return checkUser;
        
        
    }
    
    
    private void jPasswordField_REPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_REPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_REPASSActionPerformed

    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_CANCELActionPerformed

    private void jLabel_clickToLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clickToLoginMouseClicked
        loginForm lf = new loginForm();
        lf.setVisible(true);
        lf.pack();
        lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lf.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel_clickToLoginMouseClicked

    private void jLabel_clickToLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clickToLoginMouseEntered
        Border label_border = BorderFactory.createMatteBorder(0, 0, 2, 2, Color.black);
        jLabel_clickToLogin.setBorder(label_border);
    }//GEN-LAST:event_jLabel_clickToLoginMouseEntered

    private void jLabel_clickToLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_clickToLoginMouseExited
        jLabel_clickToLogin.setBorder(null);
    }//GEN-LAST:event_jLabel_clickToLoginMouseExited

    private void jTextField_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Register;
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_clickToLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ADDRESS;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_UN;
    private javax.swing.JLabel lbl_phoneNum;
    private javax.swing.JTextField txt_phoneNum;
    // End of variables declaration//GEN-END:variables
}
