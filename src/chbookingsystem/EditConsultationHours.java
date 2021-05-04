package chbookingsystem;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JTextField;

public class EditConsultationHours extends javax.swing.JFrame {
    private ViewConsultationHours view_CH_page;
    private LecturerPage lecturer_page;
    private Lecturer loggedinUser;
    private ArrayList<ConsultationHour> CHprofile;
    private String oriDate,oriTime,oriVenue;
    public EditConsultationHours() {
        initComponents();
    }
    
    public EditConsultationHours(ViewConsultationHours a, Lecturer b,ArrayList<ConsultationHour> c,String d,String e,String f,LecturerPage g){
        initComponents();
        view_CH_page = a;
        loggedinUser = b;
        CHprofile = c;
        oriDate = d;
        oriTime = e;
        oriVenue = f;    
        lecturer_page = g;
        //Set Date
        Calendar calendar = new GregorianCalendar();
        String year = calendar.get(Calendar.YEAR) + "";
        String month = calendar.get(Calendar.MONTH) + 1 + "";
        String month2 = calendar.get(Calendar.MONTH) + 2 + "";
        String dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) + 1 +"";
        if(dayOfMonth.length() == 1){
            dayOfMonth = "0" + dayOfMonth;
        }
        if(month.length() == 1){
            month = "0" + month;
        }
        if(month2.length() == 1){
            month2 = "0" + month2;
        }
        String dd = month+"/"+dayOfMonth+"/"+year;
        String ee = month2+"/"+dayOfMonth+"/"+year;
        try{
            Date startdate = new SimpleDateFormat("MM/dd/yyyy").parse(dd);
            jDateChooser2.setMinSelectableDate(startdate);
            Date enddate = new SimpleDateFormat("MM/dd/yyyy").parse(ee);
            jDateChooser2.setMaxSelectableDate(enddate);
        }catch(Exception x){
            System.out.println("jDateChooserIssue");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonCancel = new javax.swing.JButton();
        buttonEditCH = new javax.swing.JButton();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        labelCHDetails = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelVenue = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBoxVenue = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));

        buttonCancel.setBackground(new java.awt.Color(255, 204, 102));
        buttonCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonCancel.setText("CANCEL");
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });

        buttonEditCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditCH.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonEditCH.setText("EDIT");
        buttonEditCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditCHActionPerformed(evt);
            }
        });

        jDateChooser2.setDateFormatString("MM/dd/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jDateChooser2.setMaxSelectableDate(new java.util.Date(1567184503000L));
        jDateChooser2.setMinSelectableDate(java.sql.Date.valueOf(java.time.LocalDate.now()));

        labelCHDetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelCHDetails.setText("Please Fill Up New Consultation Hour Info");

        labelTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTime.setText("Time:");

        labelDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelDate.setText("Date:");

        labelVenue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelVenue.setText("Venue:");

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0900 - 1000", "1000 - 1100", "1100 - 1200", "1200 - 1300", "1300 - 1400", "1400 - 1500", "1500 - 1600", "1600 - 1700", "1700 - 1800" }));

        jComboBoxVenue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxVenue.setMaximumRowCount(3);
        jComboBoxVenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cafeteria", "Library", "Canteen" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonEditCH, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelCHDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(labelCHDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEditCH, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        this.setVisible(false);
        view_CH_page.setVisible(true);
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void buttonEditCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditCHActionPerformed
        String date = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String time = (String)jComboBox1.getSelectedItem();
        String time2 = jComboBox1.getSelectedItem().toString();
        String venue = (String)jComboBoxVenue.getSelectedItem();
        String venue2 = jComboBoxVenue.getSelectedItem().toString();
        if(loggedinUser.editCH(venue2, date, time2, oriVenue, oriDate, oriTime, CHprofile, loggedinUser) == true){
            this.dispose();
            ViewConsultationHours view_CH_page = new ViewConsultationHours(lecturer_page,loggedinUser,CHprofile);
            view_CH_page.setVisible(true);
        }
    }//GEN-LAST:event_buttonEditCHActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancel;
    private javax.swing.JButton buttonEditCH;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxVenue;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCHDetails;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelVenue;
    // End of variables declaration//GEN-END:variables
}
