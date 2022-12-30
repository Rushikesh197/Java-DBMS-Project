

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rushikeshgadewar
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

        
public class Registration extends javax.swing.JFrame {

    Connection conn;
    PreparedStatement ps; 
    
    /**
     * Creates new form Rushi1
     */
    public Registration() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        TextField_Fname_NCR = new javax.swing.JTextField();
        Label_Name_NCR = new javax.swing.JLabel();
        Label_Logo_NCR = new javax.swing.JLabel();
        Label_NCR = new javax.swing.JLabel();
        TextField_Mname_NCR = new javax.swing.JTextField();
        TextField_Lname_NCR = new javax.swing.JTextField();
        Label_Fname_NCR = new javax.swing.JLabel();
        Label_Mname_NCR = new javax.swing.JLabel();
        Label_Lname_NCR = new javax.swing.JLabel();
        Label_Ph_Pri_NCR = new javax.swing.JLabel();
        TextField_Ph_Pri_NCR = new javax.swing.JTextField();
        TextField_Email_NCR = new javax.swing.JTextField();
        Label_Ph_Sec_NCR = new javax.swing.JLabel();
        Label_Email_NCR = new javax.swing.JLabel();
        TextField_Ph_Sec_NCR = new javax.swing.JTextField();
        Label_Aadhar_NCR = new javax.swing.JLabel();
        TextField_Aadhar_NCR = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        confirmpassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        Label_DOB_NCR = new javax.swing.JLabel();
        TextField_DOB_NCR = new javax.swing.JTextField();
        Label_Marr_Status_NCR = new javax.swing.JLabel();
        RadioButton_Yes_Marr_Status_NCR = new javax.swing.JRadioButton();
        RadioButton_No_Marr_Status_NCR = new javax.swing.JRadioButton();
        Label_Gender_NCR = new javax.swing.JLabel();
        RadioButton_Male_Gender_NCR = new javax.swing.JRadioButton();
        RadioButton_Female_Gender_NCR = new javax.swing.JRadioButton();
        Button_Register_NCR = new javax.swing.JButton();
        Button_Back_NCR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(java.awt.Color.darkGray);

        TextField_Fname_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Fname_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Fname_NCRActionPerformed(evt);
            }
        });

        Label_Name_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Name_NCR.setText("NAME");

        Label_Logo_NCR.setFont(new java.awt.Font("Zapfino", 1, 36)); // NOI18N
        Label_Logo_NCR.setText(" GRAND HYATT");

        Label_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 18)); // NOI18N
        Label_NCR.setText("NEW CUSTOMER REGISTRATION");

        TextField_Mname_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N

        TextField_Lname_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Lname_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Lname_NCRActionPerformed(evt);
            }
        });

        Label_Fname_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Fname_NCR.setText("FIRST");

        Label_Mname_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Mname_NCR.setText("MIDDLE");

        Label_Lname_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Lname_NCR.setText("LAST");

        Label_Ph_Pri_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Ph_Pri_NCR.setText("PHONE NO.(PRIMARY)");

        TextField_Ph_Pri_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Ph_Pri_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Ph_Pri_NCRActionPerformed(evt);
            }
        });

        TextField_Email_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Email_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Email_NCRActionPerformed(evt);
            }
        });

        Label_Ph_Sec_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Ph_Sec_NCR.setText("PHONE NO.(SECONDARY)");

        Label_Email_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Email_NCR.setText("EMAIL ID");

        TextField_Ph_Sec_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Ph_Sec_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Ph_Sec_NCRActionPerformed(evt);
            }
        });

        Label_Aadhar_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Aadhar_NCR.setText("AADHAR NUMBER");

        TextField_Aadhar_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_Aadhar_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_Aadhar_NCRActionPerformed(evt);
            }
        });

        register.setText("SIGN UP");
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel2.setText("PASSWORD");

        confirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("CONFIRM PASSWORD");

        Label_DOB_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_DOB_NCR.setText("DATE OF BIRTH");

        TextField_DOB_NCR.setFont(new java.awt.Font("STIX Two Text", 0, 14)); // NOI18N
        TextField_DOB_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextField_DOB_NCRActionPerformed(evt);
            }
        });

        Label_Marr_Status_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Marr_Status_NCR.setText("MARRIAGE STATUS");

        RadioButton_Yes_Marr_Status_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        RadioButton_Yes_Marr_Status_NCR.setText("YES");

        RadioButton_No_Marr_Status_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        RadioButton_No_Marr_Status_NCR.setText("NO");
        RadioButton_No_Marr_Status_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_No_Marr_Status_NCRActionPerformed(evt);
            }
        });

        Label_Gender_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Label_Gender_NCR.setText("GENDER");

        RadioButton_Male_Gender_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        RadioButton_Male_Gender_NCR.setText("MALE");

        RadioButton_Female_Gender_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        RadioButton_Female_Gender_NCR.setText("FEMALE");
        RadioButton_Female_Gender_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButton_Female_Gender_NCRActionPerformed(evt);
            }
        });

        Button_Register_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Register_NCR.setText("REGISTER");
        Button_Register_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Register_NCRActionPerformed(evt);
            }
        });

        Button_Back_NCR.setFont(new java.awt.Font("STIX Two Text", 1, 14)); // NOI18N
        Button_Back_NCR.setText("BACK");
        Button_Back_NCR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_Back_NCRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_Ph_Sec_NCR)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Button_Register_NCR)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Label_Gender_NCR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RadioButton_Male_Gender_NCR)
                                                .addGap(38, 38, 38)
                                                .addComponent(RadioButton_Female_Gender_NCR))
                                            .addComponent(TextField_DOB_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(Label_Marr_Status_NCR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(RadioButton_Yes_Marr_Status_NCR)
                                                .addGap(33, 33, 33)
                                                .addComponent(RadioButton_No_Marr_Status_NCR))))
                                    .addComponent(Button_Back_NCR)
                                    .addComponent(Label_DOB_NCR)
                                    .addComponent(TextField_Aadhar_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_Aadhar_NCR)
                                    .addComponent(TextField_Email_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_Email_NCR)
                                    .addComponent(TextField_Ph_Sec_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextField_Ph_Pri_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_Ph_Pri_NCR)
                                    .addComponent(Label_Name_NCR)
                                    .addComponent(Label_NCR)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(Label_Fname_NCR)
                                        .addGap(62, 62, 62)
                                        .addComponent(Label_Mname_NCR)
                                        .addGap(58, 58, 58)
                                        .addComponent(Label_Lname_NCR))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TextField_Fname_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextField_Mname_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TextField_Lname_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                        .addComponent(jLabel4))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(Label_Logo_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(confirmpassword)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(Label_Logo_NCR)
                .addGap(40, 40, 40)
                .addComponent(Label_NCR)
                .addGap(36, 36, 36)
                .addComponent(Label_Name_NCR)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Fname_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Mname_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextField_Lname_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Fname_NCR)
                    .addComponent(Label_Mname_NCR)
                    .addComponent(Label_Lname_NCR))
                .addGap(24, 24, 24)
                .addComponent(Label_Ph_Pri_NCR)
                .addGap(18, 18, 18)
                .addComponent(TextField_Ph_Pri_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(Label_Ph_Sec_NCR)
                .addGap(18, 18, 18)
                .addComponent(TextField_Ph_Sec_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Email_NCR)
                .addGap(18, 18, 18)
                .addComponent(TextField_Email_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_Aadhar_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextField_Aadhar_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Label_DOB_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextField_DOB_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Gender_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButton_Male_Gender_NCR)
                    .addComponent(RadioButton_Female_Gender_NCR))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_Marr_Status_NCR, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RadioButton_Yes_Marr_Status_NCR)
                    .addComponent(RadioButton_No_Marr_Status_NCR))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button_Back_NCR)
                            .addComponent(Button_Register_NCR)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(confirmpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(register)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 960, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextField_Fname_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Fname_NCRActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_TextField_Fname_NCRActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        String User_name;
        User_name=this.TextField_Fname_NCR.getText();
        String password;
        password=this.password.getText();
        String confirmpassword;
        confirmpassword=this.confirmpassword.getText();
        System.out.println("Hello");
        if(User_name!=null && password!=null){
            System.out.println(User_name +" "+password);
            if(password.equals(confirmpassword)){
            try
        {
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/Trial?user=root&password=Rushi12345$");
            ps = conn.prepareStatement("insert into Users(User_name,password) values(?,?)");
            ps.setString(1, User_name);
            ps.setString(2 ,password);
            ps.executeUpdate();
            
           /* Login l = new Login();
            l.setVisible(true);
            l.setLocationRelativeTo(null);
            this.dispose();*/
            
            HomeScreen h = new HomeScreen();
            h.setVisible(true);
            h.setLocationRelativeTo(null);
            this.dispose();
  
        } catch(SQLException ex)
            {
            System.err.println(ex);
            }
        }
            else
                JOptionPane.showMessageDialog(this , "Password is not the same ma boi!!");
            }
    }//GEN-LAST:event_registerActionPerformed

    private void confirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_confirmpasswordActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        // TODO add your handling code here:
        
        if(password==confirmpassword)
        {
            
        }
    }//GEN-LAST:event_registerMouseClicked

    private void TextField_Lname_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Lname_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Lname_NCRActionPerformed

    private void TextField_Ph_Pri_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Ph_Pri_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Ph_Pri_NCRActionPerformed

    private void TextField_Email_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Email_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Email_NCRActionPerformed

    private void TextField_Ph_Sec_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Ph_Sec_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Ph_Sec_NCRActionPerformed

    private void TextField_DOB_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_DOB_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_DOB_NCRActionPerformed

    private void TextField_Aadhar_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextField_Aadhar_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextField_Aadhar_NCRActionPerformed

    private void RadioButton_Female_Gender_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_Female_Gender_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_Female_Gender_NCRActionPerformed

    private void RadioButton_No_Marr_Status_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButton_No_Marr_Status_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadioButton_No_Marr_Status_NCRActionPerformed

    private void Button_Register_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Register_NCRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Button_Register_NCRActionPerformed

    private void Button_Back_NCRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_Back_NCRActionPerformed
        // TODO add your handling code here:
         CustomerEntry ce = new CustomerEntry();
            ce.setVisible(true);
            ce.setLocationRelativeTo(null);
            this.dispose();

    }//GEN-LAST:event_Button_Back_NCRActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Back_NCR;
    private javax.swing.JButton Button_Register_NCR;
    private javax.swing.JLabel Label_Aadhar_NCR;
    private javax.swing.JLabel Label_DOB_NCR;
    private javax.swing.JLabel Label_Email_NCR;
    private javax.swing.JLabel Label_Fname_NCR;
    private javax.swing.JLabel Label_Gender_NCR;
    private javax.swing.JLabel Label_Lname_NCR;
    private javax.swing.JLabel Label_Logo_NCR;
    private javax.swing.JLabel Label_Marr_Status_NCR;
    private javax.swing.JLabel Label_Mname_NCR;
    private javax.swing.JLabel Label_NCR;
    private javax.swing.JLabel Label_Name_NCR;
    private javax.swing.JLabel Label_Ph_Pri_NCR;
    private javax.swing.JLabel Label_Ph_Sec_NCR;
    private javax.swing.JRadioButton RadioButton_Female_Gender_NCR;
    private javax.swing.JRadioButton RadioButton_Male_Gender_NCR;
    private javax.swing.JRadioButton RadioButton_No_Marr_Status_NCR;
    private javax.swing.JRadioButton RadioButton_Yes_Marr_Status_NCR;
    private javax.swing.JTextField TextField_Aadhar_NCR;
    private javax.swing.JTextField TextField_DOB_NCR;
    private javax.swing.JTextField TextField_Email_NCR;
    private javax.swing.JTextField TextField_Fname_NCR;
    private javax.swing.JTextField TextField_Lname_NCR;
    private javax.swing.JTextField TextField_Mname_NCR;
    private javax.swing.JTextField TextField_Ph_Pri_NCR;
    private javax.swing.JTextField TextField_Ph_Sec_NCR;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables

    private String getText111() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
