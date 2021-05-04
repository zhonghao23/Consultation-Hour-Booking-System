package chbookingsystem;
import java.io.PrintWriter;
import java.util.ArrayList;

public class StudentPage extends javax.swing.JFrame {
    private Student loggedinUser;
    private LoginMenu login_menu;
    private ArrayList<Student> studentProfile;
    private ArrayList<ConsultationHour> CHprofile;
    
    public StudentPage() {
        initComponents();
    }
    public StudentPage(LoginMenu a,ArrayList<ConsultationHour> b) {
        login_menu = a;
        CHprofile = b;
        studentProfile = login_menu.getStudentProfile();
        initComponents();
    }

    public void setStudent(Student x){
        loggedinUser = x;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonViewAvailableCH = new javax.swing.JButton();
        buttonViewBookedCH = new javax.swing.JButton();
        buttonViewOwnProfile = new javax.swing.JButton();
        buttonEditOwnProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonLogout2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        buttonViewAvailableCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonViewAvailableCH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonViewAvailableCH.setText("View Available Consultation Hours");
        buttonViewAvailableCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewAvailableCHActionPerformed(evt);
            }
        });

        buttonViewBookedCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonViewBookedCH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonViewBookedCH.setText("View Booked Consultation Hours");
        buttonViewBookedCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewBookedCHActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonViewOwnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViewAvailableCH, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditOwnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViewBookedCH, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditOwnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViewOwnProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewAvailableCH, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonViewBookedCH, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT PAGE");

        buttonLogout2.setBackground(new java.awt.Color(255, 255, 102));
        buttonLogout2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonLogout2.setText("LOGOUT");
        buttonLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(buttonLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogout2ActionPerformed
        String studentname;
        try
        {
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
            PrintWriter p4 = new PrintWriter("consultationhour.txt");
            for(int i=0; i<CHprofile.size(); i++){
                ConsultationHour c = CHprofile.get(i);
                p4.println(c.getLect().getName());         
                try{        
                    studentname = c.getStud().getName();
                    p4.println(studentname);
                }catch(Exception e){
                    p4.println("");
                }
                p4.println(c.getVenue());
                p4.println(c.getDate());
                p4.println(c.getTime()+"\n");
            }
            p4.close();
        }catch(Exception e)
        {
            System.out.println("file not found");
        }     
        this.setVisible(false);
        login_menu.setVisible(true);
    }//GEN-LAST:event_buttonLogout2ActionPerformed

    private void buttonViewAvailableCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewAvailableCHActionPerformed
        this.setVisible(false);
        ViewAvailableCH view_A_CH = new ViewAvailableCH(this,CHprofile,loggedinUser);
        view_A_CH.setVisible(true);        
    }//GEN-LAST:event_buttonViewAvailableCHActionPerformed

    private void buttonViewBookedCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewBookedCHActionPerformed
        this.setVisible(false);
        ViewBookedCH view_Booked_CH = new ViewBookedCH(this,CHprofile,loggedinUser);
        view_Booked_CH.setVisible(true);
    }//GEN-LAST:event_buttonViewBookedCHActionPerformed

    private void buttonViewOwnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewOwnProfileActionPerformed
        loggedinUser.viewOwnProfile(this, loggedinUser);
    }//GEN-LAST:event_buttonViewOwnProfileActionPerformed

    private void buttonEditOwnProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditOwnProfileActionPerformed
        loggedinUser.editOwnProfile(this, loggedinUser);
    }//GEN-LAST:event_buttonEditOwnProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditOwnProfile;
    private javax.swing.JButton buttonLogout2;
    private javax.swing.JButton buttonViewAvailableCH;
    private javax.swing.JButton buttonViewBookedCH;
    private javax.swing.JButton buttonViewOwnProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
