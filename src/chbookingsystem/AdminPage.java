package chbookingsystem;

import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AdminPage extends javax.swing.JFrame {
    private Admin loggedinUser;
    private LoginMenu login_menu;
    private ArrayList<Admin> adminProfile;
    private ArrayList<Lecturer> lecturerProfile;
    private ArrayList<Student> studentProfile;
    
    public AdminPage() {
        initComponents();
    }
    public AdminPage(LoginMenu a){
        initComponents();
        login_menu = a;
        lecturerProfile = login_menu.getLecturerProfile();
        studentProfile = login_menu.getStudentProfile();
    }
    
    public void setAdmin(Admin x){
        loggedinUser = x;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonCreateL = new javax.swing.JButton();
        buttonCreateS = new javax.swing.JButton();
        buttonViewLecturerStudent = new javax.swing.JButton();
        buttonViewOwnProfile = new javax.swing.JButton();
        buttonEditOwnProfile = new javax.swing.JButton();
        buttonDeleteLecturerP = new javax.swing.JButton();
        buttonDeleteStudentP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonLogout1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(876, 335));

        buttonCreateL.setBackground(new java.awt.Color(255, 204, 102));
        buttonCreateL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonCreateL.setText("Create Lecturer Profile");
        buttonCreateL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateLActionPerformed(evt);
            }
        });

        buttonCreateS.setBackground(new java.awt.Color(255, 204, 102));
        buttonCreateS.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonCreateS.setText("Create Student Profile");
        buttonCreateS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCreateSActionPerformed(evt);
            }
        });

        buttonViewLecturerStudent.setBackground(new java.awt.Color(255, 204, 102));
        buttonViewLecturerStudent.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonViewLecturerStudent.setText("View & Edit Lecturer & Student Profile");
        buttonViewLecturerStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewLecturerStudentActionPerformed(evt);
            }
        });

        buttonViewOwnProfile.setBackground(new java.awt.Color(255, 204, 102));
        buttonViewOwnProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonViewOwnProfile.setText("View Own Profile");
        buttonViewOwnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewOwnProfileActionPerformed(evt);
            }
        });

        buttonEditOwnProfile.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditOwnProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonEditOwnProfile.setText("Edit Own Profile");
        buttonEditOwnProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditOwnProfileActionPerformed(evt);
            }
        });

        buttonDeleteLecturerP.setBackground(new java.awt.Color(255, 204, 102));
        buttonDeleteLecturerP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonDeleteLecturerP.setText("Delete Lecturer Profile");
        buttonDeleteLecturerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteLecturerPActionPerformed(evt);
            }
        });

        buttonDeleteStudentP.setBackground(new java.awt.Color(255, 204, 102));
        buttonDeleteStudentP.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonDeleteStudentP.setText("Delete Student Profile");
        buttonDeleteStudentP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteStudentPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonViewOwnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(buttonEditOwnProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonCreateS, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDeleteStudentP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttonCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDeleteLecturerP, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonViewLecturerStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewOwnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCreateS, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCreateL, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditOwnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteStudentP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteLecturerP, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonViewLecturerStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ADMIN PAGE");

        buttonLogout1.setBackground(new java.awt.Color(255, 255, 102));
        buttonLogout1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonLogout1.setText("LOGOUT");
        buttonLogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                        .addComponent(buttonLogout1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLogout1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogout1ActionPerformed
        adminProfile = login_menu.getAdminProfile();
        System.out.println(adminProfile);       //can be deleted
        lecturerProfile = login_menu.getLecturerProfile();
        System.out.println(lecturerProfile);
        System.out.println(loggedinUser);          //can be deleted     
        try{
            PrintWriter p1 = new PrintWriter("admin.txt");      //open admin.txt for writing data into it
            for(int i=0; i<adminProfile.size(); i++)
            {
                Admin a = adminProfile.get(i);      //get admin object from admin profile array list
                p1.println(a.getUserID());          //Write userID into file
                p1.println(a.getPassword());        //Write password into file
                p1.println(a.getName()+"\n");       //Write name into file
            }
            p1.close();
            PrintWriter p2 = new PrintWriter("lecturer.txt");   //open lecturer.txt for writing data into it
            for(int i=0; i<lecturerProfile.size(); i++){
                Lecturer b = lecturerProfile.get(i);    //get lecturer object from lecturer profile array list
                p2.println(b.getUserID());          //Write userID into file
                p2.println(b.getPassword());        //Write password into file
                p2.println(b.getName());            //Write name into file
                p2.println(b.getContactNo());       //Write contact number into file
                p2.println(b.getEmailAdd()+"\n");   //Write email address into file
            }
            p2.close();
            PrintWriter p3 = new PrintWriter("student.txt");    //open student.txt for writing data into it
            for(int i=0; i<studentProfile.size(); i++){
                Student c = studentProfile.get(i);  //get student object from student profile array list
                p3.println(c.getUserID());          //Write userID into file
                p3.println(c.getPassword());        //Write password into file
                p3.println(c.getName());            //Write name into file
                p3.println(c.getCourseAndLevel());  //Write course & level into file
                p3.println(c.getContactNo());       //Write contact number into file
                p3.println(c.getEmailAdd()+"\n");   //Write email address into file
            }
            p3.close();
        }catch(Exception ex){
            System.out.println("file not found");
        }
        this.setVisible(false);
        login_menu.setVisible(true);
        
        
    }//GEN-LAST:event_buttonLogout1ActionPerformed
    //CREATE NEW LECTURER PROFILE
    private void buttonCreateLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateLActionPerformed
        loggedinUser.createLProfile(lecturerProfile,login_menu);
    }//GEN-LAST:event_buttonCreateLActionPerformed
    //CREATE NEW STUDENT PROFILE
    private void buttonCreateSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCreateSActionPerformed
        loggedinUser.createSProfile(studentProfile,login_menu);
    }//GEN-LAST:event_buttonCreateSActionPerformed
    //VIEW ADMIN OWN PROFILE
    private void buttonViewOwnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewOwnProfileActionPerformed
        loggedinUser.viewOwnProfile(login_menu, loggedinUser);
    }//GEN-LAST:event_buttonViewOwnProfileActionPerformed
    //VIEW PROFILE PAGE
    private void buttonViewLecturerStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewLecturerStudentActionPerformed
        this.setVisible(false);
        ViewProfilePage view_profile = new ViewProfilePage(this,login_menu,lecturerProfile,studentProfile, loggedinUser);
        view_profile.setVisible(true);
    }//GEN-LAST:event_buttonViewLecturerStudentActionPerformed

    private void buttonEditOwnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditOwnProfileActionPerformed
        loggedinUser.editOwnProfile(this, loggedinUser);
    }//GEN-LAST:event_buttonEditOwnProfileActionPerformed

    private void buttonDeleteLecturerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteLecturerPActionPerformed
        loggedinUser.deleteLProfile(this, lecturerProfile);
    }//GEN-LAST:event_buttonDeleteLecturerPActionPerformed

    private void buttonDeleteStudentPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteStudentPActionPerformed
        loggedinUser.deleteSProfile(this, studentProfile);
    }//GEN-LAST:event_buttonDeleteStudentPActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCreateL;
    private javax.swing.JButton buttonCreateS;
    private javax.swing.JButton buttonDeleteLecturerP;
    private javax.swing.JButton buttonDeleteStudentP;
    private javax.swing.JButton buttonEditOwnProfile;
    private javax.swing.JButton buttonLogout1;
    private javax.swing.JButton buttonViewLecturerStudent;
    private javax.swing.JButton buttonViewOwnProfile;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
