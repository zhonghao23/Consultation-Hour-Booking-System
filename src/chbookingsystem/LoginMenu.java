package chbookingsystem;

import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class LoginMenu extends javax.swing.JFrame{
    private ArrayList<Admin> adminProfile;          //arraylist to store admin profile
    private ArrayList<Lecturer> lecturerProfile;    //arraylist to store lecturer profile
    private ArrayList<Student> studentProfile;      //arraylist to store student profile
    private ArrayList<ConsultationHour> CHprofile;  //arraylist to store consultation hour profile
    private int identity = 4;                       //used to identify which type of user logged in to the system

    public LoginMenu() {
        initComponents();
    }    
    //OVERLOAD it to add arraylist into LoginMenuGUI
    public LoginMenu(ArrayList<Admin> a, ArrayList<Lecturer> b, ArrayList<Student> c, ArrayList<ConsultationHour> d){        
        adminProfile = a;
        lecturerProfile = b;
        studentProfile = c;
        CHprofile = d;
        initComponents();
    }

    //GETTER for AdminPageGUI to get arraylist
    public ArrayList<Admin> getAdminProfile() {
        return adminProfile;
    }
    public ArrayList<Lecturer> getLecturerProfile() {
        return lecturerProfile;
    }
    public ArrayList<Student> getStudentProfile() {
        return studentProfile;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelSystemName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textfieldID = new javax.swing.JTextField();
        buttonExit = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        radioAdmin = new javax.swing.JRadioButton();
        radioLecturer = new javax.swing.JRadioButton();
        radioStudent = new javax.swing.JRadioButton();
        labelPassword = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        textfieldPassword = new javax.swing.JPasswordField();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        labelSystemName.setBackground(new java.awt.Color(255, 204, 102));
        labelSystemName.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labelSystemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSystemName.setText("Consultation Hours Booking System");
        labelSystemName.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        textfieldID.setBackground(new java.awt.Color(204, 204, 255));
        textfieldID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textfieldID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        buttonExit.setBackground(new java.awt.Color(255, 204, 102));
        buttonExit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonExit.setText("EXIT");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        labelID.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelID.setText("ID:");

        radioAdmin.setBackground(new java.awt.Color(255, 255, 102));
        buttonGroup1.add(radioAdmin);
        radioAdmin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioAdmin.setText("Admin");
        radioAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAdminActionPerformed(evt);
            }
        });

        radioLecturer.setBackground(new java.awt.Color(255, 255, 102));
        buttonGroup1.add(radioLecturer);
        radioLecturer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioLecturer.setText("Lecturer");
        radioLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioLecturerActionPerformed(evt);
            }
        });

        radioStudent.setBackground(new java.awt.Color(255, 255, 102));
        buttonGroup1.add(radioStudent);
        radioStudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioStudent.setText("Student");
        radioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStudentActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelPassword.setText("Password:");

        buttonLogin.setBackground(new java.awt.Color(255, 204, 102));
        buttonLogin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonLogin.setText("LOGIN");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        textfieldPassword.setBackground(new java.awt.Color(204, 204, 255));
        textfieldPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textfieldPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(radioAdmin)
                        .addGap(50, 50, 50)
                        .addComponent(radioLecturer)
                        .addGap(52, 52, 52)
                        .addComponent(radioStudent))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textfieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelPassword)
                            .addComponent(textfieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(213, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAdmin)
                    .addComponent(radioLecturer)
                    .addComponent(radioStudent))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(labelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textfieldPassword)
                    .addComponent(textfieldID, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSystemName, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSystemName, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //LOGIN USERNAME&PASSWORD COMPARISION METHODS
    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        String username = textfieldID.getText();        //get user input into attribute
        String password = textfieldPassword.getText();  //get user input into attribute
        System.out.println(username);       //CAN BE DELETED (JUST TO CHECK)
        System.out.println(password);       //CAN BE DELETED (JUST TO CHECK)
        boolean found = false;    //use to determine if the username and password matches
        if(identity == 1)
        {
            Admin loggedinUser = null;     //declared to record which user logged in 
            while(!found){
                for(int i=0; i<adminProfile.size(); i++)
                {
                    Admin a = adminProfile.get(i);          //get elements from admin profile arraylist
                    System.out.println(a);
                    System.out.println(".....");
                    if(username.equals(a.getUserID()))      
                    {
                        if(password.equals(a.getPassword()))    //if username & password matched the profile in arraylist
                        {
                            loggedinUser = a;      //record who logged in
                            found = true;
                            System.out.println("found!");          //can be deleted
                            System.out.println(loggedinUser);      //can be deleted
                            JOptionPane optionPane = new JOptionPane("Welcome");
                            optionPane.showMessageDialog(this,"Welcome "+a.getName()+"!");
                            textfieldID.setText("");
                            textfieldPassword.setText("");
                            this.setVisible(false);
                            AdminPage admin_page = new AdminPage(this);
                            admin_page.setAdmin(loggedinUser);      //set the logged in user identity as admin
                            admin_page.setVisible(true);
                            break;
                        } else if (!password.equals(a.getPassword()))
                        {
                            JOptionPane dialogWrongPW = new JOptionPane("Wrong Password");
                            dialogWrongPW.showMessageDialog(this, "Password Incorrect!");
                            textfieldID.setText("");
                            textfieldPassword.setText("");
                            break;
                        }                        
                    } else if (i == (adminProfile.size() - 1))
                    {
                        JOptionPane dialogWrongUN = new JOptionPane("Wrong Username");
                        dialogWrongUN.showMessageDialog(this, "Username Incorrect!");
                        textfieldID.setText("");
                        textfieldPassword.setText("");
                        break;
                    }
                }
                break;
            }
        } else if(identity == 2)
        {
            Lecturer loggedinUser = null;     //declared to record which user logged in 
            while(!found){
                for(int i=0; i<lecturerProfile.size(); i++)
                {
                    Lecturer a = lecturerProfile.get(i);          //get elements from admin profile arraylist
                    if(username.equals(a.getUserID()))      
                    {                         
                        if(password.equals(a.getPassword()))    //if username & password matched the profile in arraylist
                        {
                            loggedinUser = a;      //record who logged in
                            found = true;
                            System.out.println("found!");          //can be deleted
                            System.out.println(loggedinUser);      //can be deleted
                            JOptionPane dialogWelcome = new JOptionPane("Welcome");
                            dialogWelcome.showMessageDialog(this,"Welcome "+a.getName()+"!");
                            textfieldID.setText("");
                            textfieldPassword.setText("");
                            this.setVisible(false);
                            LecturerPage lecturer_page = new LecturerPage(this,CHprofile);
                            lecturer_page.setLecturer(loggedinUser);      //set the logged in user identity as admin
                            lecturer_page.setVisible(true);
                            break;
                        } else if (!password.equals(a.getPassword()))
                        {
                            JOptionPane dialogWrongPW = new JOptionPane("Wrong Password");
                            dialogWrongPW.showMessageDialog(this, "Password Incorrect!");
                            textfieldID.setText("");
                            textfieldPassword.setText("");
                            break;
                        }                        
                    } else if (i == (lecturerProfile.size() - 1))
                    {
                        JOptionPane dialogWrongUN = new JOptionPane("Wrong Username");
                        dialogWrongUN.showMessageDialog(this, "Username Incorrect!");
                        textfieldID.setText("");
                        textfieldPassword.setText("");
                        break;
                    }
                }
                break;
            }            
        } else if (identity == 3)
        {
            Student loggedinUser = null;     //declared to record which user logged in 
            while(!found){
                for(int i=0; i<studentProfile.size(); i++)
                {
                    Student a = studentProfile.get(i);          //get elements from admin profile arraylist
                    if(username.equals(a.getUserID()))      
                    {                         
                        if(password.equals(a.getPassword()))    //if username & password matched the profile in arraylist
                        {
                            loggedinUser = a;      //record who logged in
                            found = true;
                            System.out.println("found!");          //can be deleted
                            System.out.println(loggedinUser);      //can be deleted
                            JOptionPane dialogWelcome = new JOptionPane("Welcome");
                            dialogWelcome.showMessageDialog(this,"Welcome "+a.getName()+"!");
                            textfieldID.setText("");
                            textfieldPassword.setText("");
                            this.setVisible(false);
                            StudentPage student_page = new StudentPage(this, CHprofile);
                            student_page.setStudent(loggedinUser);      //set the logged in user identity as admin
                            student_page.setVisible(true);
                            break;
                        } else if (!password.equals(a.getPassword()))
                        {
                            JOptionPane dialogWrongPW = new JOptionPane("Wrong Password");
                            dialogWrongPW.showMessageDialog(this, "Password Incorrect!");
                            textfieldID.setText("");
                            textfieldPassword.setText("");
                            break;
                        }                        
                    } else if (i == (studentProfile.size() - 1))
                    {
                        JOptionPane dialogWrongUN = new JOptionPane("Wrong Username");
                        dialogWrongUN.showMessageDialog(this, "Username Incorrect!");
                        textfieldID.setText("");
                        textfieldPassword.setText("");
                        break;
                    }
                }
                break;
            }            
        }else if(identity == 4){
            JOptionPane dialogNoIdentity = new JOptionPane("No Identity");
            dialogNoIdentity.showMessageDialog(this, "Please Select An Identity");
        }
    }//GEN-LAST:event_buttonLoginActionPerformed
    //QUIT
    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_buttonExitActionPerformed
    //ADMIN
    private void radioAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAdminActionPerformed
        identity = 1;   //IDENTITY : ADMIN
    }//GEN-LAST:event_radioAdminActionPerformed
    //LECTURER
    private void radioLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioLecturerActionPerformed
        identity = 2;   //IDENTITY = LECTURER
    }//GEN-LAST:event_radioLecturerActionPerformed
    //STUDENT
    private void radioStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStudentActionPerformed
        identity = 3;   //IDENTITY = STUDENT
    }//GEN-LAST:event_radioStudentActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSystemName;
    private javax.swing.JRadioButton radioAdmin;
    private javax.swing.JRadioButton radioLecturer;
    private javax.swing.JRadioButton radioStudent;
    private javax.swing.JTextField textfieldID;
    private javax.swing.JPasswordField textfieldPassword;
    // End of variables declaration//GEN-END:variables
}
