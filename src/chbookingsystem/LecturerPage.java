package chbookingsystem;
import java.io.PrintWriter;
import java.util.ArrayList;

public class LecturerPage extends javax.swing.JFrame {
    private Lecturer loggedinUser;
    private LoginMenu login_menu;
    private ArrayList<Lecturer> lecturerProfile;
    private ArrayList<ConsultationHour> CHprofile;
    
    public LecturerPage() {
        initComponents();
    }
    public LecturerPage(LoginMenu a,ArrayList<ConsultationHour> b){
        login_menu = a;
        CHprofile = b;
        lecturerProfile = login_menu.getLecturerProfile();
        initComponents();
    }
    
    public void setLecturer(Lecturer x){
        loggedinUser = x;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonSetCH = new javax.swing.JButton();
        buttonViewOwnLProfile = new javax.swing.JButton();
        buttonViewCH = new javax.swing.JButton();
        buttonEditOwnLProfile = new javax.swing.JButton();
        buttonLogout2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        buttonSetCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonSetCH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonSetCH.setText("Set Consultation Hours");
        buttonSetCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSetCHActionPerformed(evt);
            }
        });

        buttonViewOwnLProfile.setBackground(new java.awt.Color(255, 204, 102));
        buttonViewOwnLProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonViewOwnLProfile.setText("View Own Profile");
        buttonViewOwnLProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewOwnLProfileActionPerformed(evt);
            }
        });

        buttonViewCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonViewCH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonViewCH.setText("View Consulation Hours");
        buttonViewCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewCHActionPerformed(evt);
            }
        });

        buttonEditOwnLProfile.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditOwnLProfile.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonEditOwnLProfile.setText("Edit Own Profile");
        buttonEditOwnLProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditOwnLProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(buttonViewOwnLProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonViewCH, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonEditOwnLProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonSetCH, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewOwnLProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditOwnLProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonViewCH, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSetCH, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        buttonLogout2.setBackground(new java.awt.Color(255, 255, 102));
        buttonLogout2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonLogout2.setText("LOGOUT");
        buttonLogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogout2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("LECTURER PAGE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                        .addComponent(buttonLogout2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonLogout2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSetCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSetCHActionPerformed
        this.setVisible(false);
        SetConsultationHours set_CH = new SetConsultationHours(this,lecturerProfile,CHprofile,loggedinUser);
        set_CH.setVisible(true);
    }//GEN-LAST:event_buttonSetCHActionPerformed

    private void buttonViewOwnLProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewOwnLProfileActionPerformed
        loggedinUser.viewOwnProfile(this, loggedinUser);
    }//GEN-LAST:event_buttonViewOwnLProfileActionPerformed

    private void buttonViewCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewCHActionPerformed
      this.setVisible(false);
      ViewConsultationHours view_CH_page = new ViewConsultationHours(this,loggedinUser,CHprofile);
      view_CH_page.setVisible(true);
    }//GEN-LAST:event_buttonViewCHActionPerformed

    private void buttonEditOwnLProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditOwnLProfileActionPerformed
        loggedinUser.editOwnProfile(this, loggedinUser);
    }//GEN-LAST:event_buttonEditOwnLProfileActionPerformed

    private void buttonLogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogout2ActionPerformed
        String studentname;
        try
        {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEditOwnLProfile;
    private javax.swing.JButton buttonLogout2;
    private javax.swing.JButton buttonSetCH;
    private javax.swing.JButton buttonViewCH;
    private javax.swing.JButton buttonViewOwnLProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
