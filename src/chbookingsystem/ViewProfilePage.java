package chbookingsystem;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ViewProfilePage extends javax.swing.JFrame {
    private ArrayList<Lecturer> lecturerProfile;
    private ArrayList<Student> studentProfile;
    private AdminPage admin_page;       //GUI 2.0
    private LoginMenu login_menu;       //GUI 1.0
    private Admin loggedinUser;         //Current User
    private DefaultTableModel t,tt;     //table model
    private JTable t1,tt1;              //jtable

    public ViewProfilePage() {
        initComponents();
    }
    //View & Show All Lecturer & Student Profile
    public ViewProfilePage(AdminPage a, LoginMenu b, ArrayList<Lecturer>c, ArrayList<Student> d, Admin e){
        initComponents();
        admin_page = a;
        login_menu = b;
        lecturerProfile = c;
        studentProfile = d;
        loggedinUser = e;
        //VIEWING LECTURER PROFILE
        String [][] data = loggedinUser.viewLProfile(admin_page, lecturerProfile);  //Get data from ArrayList & put into 2d Array
        String []columnHeader = {"UserID","Name","Contact No","Email Address"};     //Define header for the table
        t = new DefaultTableModel(data, columnHeader);      //Create a table model
        JTable t1 = new JTable(t);                          //Create a new table for lecturer profile
        JScrollPane jsp = new JScrollPane(t1);              //Put table into ScrollPane to make it scrollable
        t1.getTableHeader().setReorderingAllowed(false);    //Prevent user from reordering the columns
        t1.setEnabled(false);                               //Prevent user from editing the info from the table
        t1.setAutoCreateRowSorter(true);
        Color yellow = new Color(255,255,102);              //Set color 
        t1.setBackground(yellow);                           //Set color of the background of table
        jsp.setBounds(30,40,800,150);                       //Set location of the table
        TableColumnModel columnModel = t1.getColumnModel(); //Set the column width
        columnModel.getColumn(0).setMinWidth(80);           //Set minimum width
        columnModel.getColumn(0).setMaxWidth(80);           //Set maximum width
        columnModel.getColumn(0).setPreferredWidth(80);     //Set preferred width
        columnModel.getColumn(1).setMinWidth(200);
        columnModel.getColumn(1).setMaxWidth(200);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setMinWidth(150);
        columnModel.getColumn(2).setMaxWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setMinWidth(370);
        columnModel.getColumn(3).setMaxWidth(370);
        columnModel.getColumn(3).setPreferredWidth(370);
        jPanel2.add(jsp);       //Add the ScrollPane into Panel
        //VIEWING STUDENT PROFILE
        String [][] data1 = loggedinUser.viewSProfile(admin_page, studentProfile);  //Get data from arraylist and put into 2d array
        String []columnHeader1 = {"UserID","Name","Course & Level","Contact No","Email Address"};   //Define header for the table
        tt = new DefaultTableModel(data1, columnHeader1);       //Create table model
        JTable tt1 = new JTable(tt);                            //Create new jtable for student profile
        JScrollPane jsp1 = new JScrollPane(tt1);                //Add new jtable into JScrollPane
        tt1.getTableHeader().setReorderingAllowed(false);       //Prevent user from reordering table
        tt1.setEnabled(false);                                  //Prevent user from editing table
        tt1.setAutoCreateRowSorter(true);
        tt1.setBackground(yellow);                              //Set color of the background of table
        jsp1.setBounds(30,240,800,150);                         //Set location for table
        TableColumnModel columnModel1 = tt1.getColumnModel();   //Set the column width of the table
        columnModel1.getColumn(0).setMinWidth(80);              //Set minimum width
        columnModel1.getColumn(0).setMaxWidth(80);              //Set maximum width
        columnModel1.getColumn(0).setPreferredWidth(80);        //Set preferred width
        columnModel1.getColumn(1).setMinWidth(130);
        columnModel1.getColumn(1).setMaxWidth(130);
        columnModel1.getColumn(1).setPreferredWidth(130);
        columnModel1.getColumn(2).setMinWidth(280);
        columnModel1.getColumn(2).setMaxWidth(280);
        columnModel1.getColumn(2).setPreferredWidth(280);
        columnModel1.getColumn(3).setMinWidth(100);
        columnModel1.getColumn(3).setMaxWidth(100);
        columnModel1.getColumn(3).setPreferredWidth(100);
        jPanel2.add(jsp1);      //Add the ScrollPane into panel
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelLecturerProf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        buttonEditLProfile = new javax.swing.JButton();
        buttonEditSProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(876, 335));

        jLabelLecturerProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelLecturerProf.setText("Lecturer Profile");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Student Profile");

        buttonEditLProfile.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditLProfile.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonEditLProfile.setText("EDIT");
        buttonEditLProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditLProfileActionPerformed(evt);
            }
        });

        buttonEditSProfile.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditSProfile.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonEditSProfile.setText("EDIT");
        buttonEditSProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditSProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelLecturerProf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEditLProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEditSProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelLecturerProf))
                    .addComponent(buttonEditLProfile))
                .addGap(160, 160, 160)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buttonEditSProfile))
                .addContainerGap(161, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("ADMIN PAGE (VIEW/MANAGE PROFILE)");

        buttonBack.setBackground(new java.awt.Color(255, 255, 102));
        buttonBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonBack.setText("BACK");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
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
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(buttonBack, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //BACK TO PREVIOUS GUI
    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        this.setVisible(false);         //Hide this GUI
        admin_page.setVisible(true);    //Show previous GUI
    }//GEN-LAST:event_buttonBackActionPerformed
    //EDIT STUDENT PROFILE
    private void buttonEditSProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditSProfileActionPerformed
        if(loggedinUser.editSProfile(this, studentProfile) == true){
            this.dispose();                 //Delete previous GUI
            ViewProfilePage view_profile = new ViewProfilePage(admin_page,login_menu,lecturerProfile,studentProfile, loggedinUser);
            view_profile.setVisible(true);  //Show a new GUI
        }
    }//GEN-LAST:event_buttonEditSProfileActionPerformed
    //EDIT LECTURER PROFILE
    private void buttonEditLProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditLProfileActionPerformed
        if(loggedinUser.editLProfile(this, lecturerProfile) == true){
            this.dispose();                 //Delete previous GUI
            ViewProfilePage view_profile = new ViewProfilePage(admin_page,login_menu,lecturerProfile,studentProfile, loggedinUser);
            view_profile.setVisible(true);  //Show a new GUI
        }
    }//GEN-LAST:event_buttonEditLProfileActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonEditLProfile;
    private javax.swing.JButton buttonEditSProfile;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLecturerProf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
