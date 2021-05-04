package chbookingsystem;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ViewConsultationHours extends javax.swing.JFrame {
    private LecturerPage lecturer_page;
    private Lecturer loggedinUser;
    private DefaultTableModel table;
    private ArrayList<ConsultationHour> CHprofile;
    private EditConsultationHours edit_CH_page;
    
    public ViewConsultationHours() {
        initComponents();
    }

    public ViewConsultationHours(LecturerPage a, Lecturer b,ArrayList<ConsultationHour> c){
        initComponents();
        lecturer_page = a;
        loggedinUser = b;
        CHprofile = c;
        String [][]data = loggedinUser.viewCHprofile();
        String []columnHeader = {"Student","Date","Time","Venue"};
        table = new DefaultTableModel(data, columnHeader);      //Create a table model
        JTable table1 = new JTable(table);                          //Create a new table for lecturer profile
        JScrollPane jsp = new JScrollPane(table1);              //Put table into ScrollPane to make it scrollable
        table1.getTableHeader().setReorderingAllowed(false);    //Prevent user from reordering the columns
        table1.setEnabled(false);                               //Prevent user from editing the info from the table
        table1.setAutoCreateRowSorter(true);
        Color yellow = new Color(255,255,102);              //Set color 
        table1.setBackground(yellow);                           //Set color of the background of table
        jsp.setBounds(30,40,400,300);                       //Set location of the table
        TableColumnModel columnModel = table1.getColumnModel(); //Set the column width
        columnModel.getColumn(0).setMinWidth(120);           //Set minimum width
        columnModel.getColumn(0).setMaxWidth(120);           //Set maximum width
        columnModel.getColumn(0).setPreferredWidth(120);     //Set preferred width
        columnModel.getColumn(1).setMinWidth(80);
        columnModel.getColumn(1).setMaxWidth(80);
        columnModel.getColumn(1).setPreferredWidth(80);
        columnModel.getColumn(2).setMinWidth(100);
        columnModel.getColumn(2).setMaxWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setMinWidth(100);
        columnModel.getColumn(3).setMaxWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        jPanelCH.add(jsp);       //Add the ScrollPane into Panel 
        //Set Date
        Calendar calendar = new GregorianCalendar();
        String year = calendar.get(Calendar.YEAR) + "";
        String month = calendar.get(Calendar.MONTH) + 1 + "";   //set start month as this month
        String month2 = calendar.get(Calendar.MONTH) + 2 + "";  //set next month as end date
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
        jPanelCH = new javax.swing.JPanel();
        jLabelLecturerProf = new javax.swing.JLabel();
        buttonDeleteCH = new javax.swing.JButton();
        buttonEditCH1 = new javax.swing.JButton();
        buttonSearchCH = new javax.swing.JButton();
        labelDate = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        labelTime = new javax.swing.JLabel();
        labelVenue = new javax.swing.JLabel();
        jComboBoxVenue = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanelCH.setBackground(new java.awt.Color(255, 255, 102));
        jPanelCH.setPreferredSize(new java.awt.Dimension(876, 335));

        jLabelLecturerProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelLecturerProf.setText("Consultation Hours (Blank Means Available)");

        buttonDeleteCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonDeleteCH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonDeleteCH.setText("DELETE");
        buttonDeleteCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteCHActionPerformed(evt);
            }
        });

        buttonEditCH1.setBackground(new java.awt.Color(255, 204, 102));
        buttonEditCH1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonEditCH1.setText("EDIT");
        buttonEditCH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditCH1ActionPerformed(evt);
            }
        });

        buttonSearchCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonSearchCH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonSearchCH.setText("SEARCH");
        buttonSearchCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchCHActionPerformed(evt);
            }
        });

        labelDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelDate.setText("Date:");

        jDateChooser2.setDateFormatString("MM/dd/yyyy");
        jDateChooser2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jDateChooser2.setMaxSelectableDate(new java.util.Date(1567184503000L));
        jDateChooser2.setMinSelectableDate(java.sql.Date.valueOf(java.time.LocalDate.now()));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "0900 - 1000", "1000 - 1100", "1100 - 1200", "1200 - 1300", "1300 - 1400", "1400 - 1500", "1500 - 1600", "1600 - 1700", "1700 - 1800" }));

        labelTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelTime.setText("Time:");

        labelVenue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelVenue.setText("Venue:");

        jComboBoxVenue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboBoxVenue.setMaximumRowCount(3);
        jComboBoxVenue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cafeteria", "Library", "Canteen" }));

        javax.swing.GroupLayout jPanelCHLayout = new javax.swing.GroupLayout(jPanelCH);
        jPanelCH.setLayout(jPanelCHLayout);
        jPanelCHLayout.setHorizontalGroup(
            jPanelCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCHLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelLecturerProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(jPanelCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonSearchCH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditCH1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDeleteCH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanelCHLayout.setVerticalGroup(
            jPanelCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLecturerProf)
                    .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonDeleteCH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditCH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonSearchCH)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("LECTURER PAGE (VIEW CONSULTATION HOUR)");

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
                        .addComponent(jPanelCH, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addComponent(jPanelCH, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void buttonDeleteCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteCHActionPerformed
        String date = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String time = (String)jComboBox1.getSelectedItem();
        String time2 = jComboBox1.getSelectedItem().toString();
        String venue = (String)jComboBoxVenue.getSelectedItem();
        String venue2 = jComboBoxVenue.getSelectedItem().toString(); 
        if(loggedinUser.deleteCH(venue2,date,time,CHprofile,loggedinUser) == true){
            this.dispose();
            ViewConsultationHours view_CH_page = new ViewConsultationHours(lecturer_page,loggedinUser,CHprofile);
            view_CH_page.setVisible(true);
        }
    }//GEN-LAST:event_buttonDeleteCHActionPerformed

    private void buttonEditCH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditCH1ActionPerformed
        String date = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String time = (String)jComboBox1.getSelectedItem();
        String time2 = jComboBox1.getSelectedItem().toString();
        String venue = (String)jComboBoxVenue.getSelectedItem();
        String venue2 = jComboBoxVenue.getSelectedItem().toString();       
        for(int i=0;i<loggedinUser.getCHprofile().size();i++)
        {
            ConsultationHour c = loggedinUser.getCHprofile().get(i);
            if(date.equals("") || venue.equals("Select") || time.equals("Select")){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(this, "Please Select Date & Time & Venue", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(date.equals(c.getDate()) && venue.equals(c.getVenue()) && time.equals(c.getTime())){
                this.setVisible(false);
                EditConsultationHours edit_CH_page = new EditConsultationHours(this,loggedinUser,CHprofile,date,time2,venue2,lecturer_page);
                edit_CH_page.setVisible(true); 
                break;
            }else if (i == (loggedinUser.getCHprofile().size() - 1)){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(this, "Consultation Hour Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }
    }//GEN-LAST:event_buttonEditCH1ActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        this.setVisible(false);         //Hide this GUI
        lecturer_page.setVisible(true);    //Show previous GUI
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonSearchCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchCHActionPerformed
        String date = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String time = (String)jComboBox1.getSelectedItem();
        String time2 = jComboBox1.getSelectedItem().toString();
        String venue = (String)jComboBoxVenue.getSelectedItem();
        String venue2 = jComboBoxVenue.getSelectedItem().toString();       
        loggedinUser.searchCH(venue2, date, time2, CHprofile, loggedinUser); 
    }//GEN-LAST:event_buttonSearchCHActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDeleteCH;
    private javax.swing.JButton buttonEditCH1;
    private javax.swing.JButton buttonSearchCH;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBoxVenue;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLecturerProf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCH;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelVenue;
    // End of variables declaration//GEN-END:variables
}
