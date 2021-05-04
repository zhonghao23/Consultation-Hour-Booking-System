package chbookingsystem;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ViewAvailableCH extends javax.swing.JFrame {
    private StudentPage student_page;
    private ArrayList<ConsultationHour> CHprofile;
    private Student loggedinUser;
    private DefaultTableModel table;
    
    public ViewAvailableCH() {
        initComponents();
    }
    
    public ViewAvailableCH(StudentPage a,ArrayList<ConsultationHour> b,Student c){
        initComponents();
        student_page = a;
        CHprofile = b;
        loggedinUser = c;
        String [][]data = loggedinUser.viewAvailableCHprofile(CHprofile);
        String []columnHeader = {"Lecturer","Student","Date","Time","Venue"};
        table = new DefaultTableModel(data, columnHeader);      //Create a table model
        JTable table1 = new JTable(table);                          //Create a new table for lecturer profile
        JScrollPane jsp = new JScrollPane(table1);              //Put table into ScrollPane to make it scrollable
        table1.getTableHeader().setReorderingAllowed(false);    //Prevent user from reordering the columns
        table1.setEnabled(false);                               //Prevent user from editing the info from the table
        table1.setAutoCreateRowSorter(true);
        Color yellow = new Color(255,255,102);              //Set color 
        table1.setBackground(yellow);                           //Set color of the background of table
        jsp.setBounds(30,40,550,300);                       //Set location of the table
        TableColumnModel columnModel = table1.getColumnModel(); //Set the column width
        columnModel.getColumn(0).setMinWidth(125);           //Set minimum width
        columnModel.getColumn(0).setMaxWidth(125);           //Set maximum width
        columnModel.getColumn(0).setPreferredWidth(125);     //Set preferred width
        columnModel.getColumn(1).setMinWidth(125);
        columnModel.getColumn(1).setMaxWidth(125);
        columnModel.getColumn(1).setPreferredWidth(125);
        columnModel.getColumn(2).setMinWidth(100);
        columnModel.getColumn(2).setMaxWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setMinWidth(100);
        columnModel.getColumn(3).setMaxWidth(100);
        columnModel.getColumn(3).setPreferredWidth(100);
        columnModel.getColumn(4).setMinWidth(100);
        columnModel.getColumn(4).setMaxWidth(100);
        columnModel.getColumn(4).setPreferredWidth(100);
        jPanelCH.add(jsp);       //Add the ScrollPane into Panel  
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
        jPanelCH = new javax.swing.JPanel();
        jLabelLecturerProf = new javax.swing.JLabel();
        buttonBookCH = new javax.swing.JButton();
        labelDate = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        labelTime = new javax.swing.JLabel();
        labelVenue = new javax.swing.JLabel();
        textfieldLectName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jPanelCH.setBackground(new java.awt.Color(255, 255, 102));
        jPanelCH.setPreferredSize(new java.awt.Dimension(876, 335));

        jLabelLecturerProf.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabelLecturerProf.setText("Available Consultation Hours");

        buttonBookCH.setBackground(new java.awt.Color(255, 204, 102));
        buttonBookCH.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        buttonBookCH.setText("BOOK");
        buttonBookCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBookCHActionPerformed(evt);
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
        labelVenue.setText("Lecturer Name: ");

        textfieldLectName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanelCHLayout = new javax.swing.GroupLayout(jPanelCH);
        jPanelCH.setLayout(jPanelCHLayout);
        jPanelCHLayout.setHorizontalGroup(
            jPanelCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCHLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabelLecturerProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addGroup(jPanelCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBookCH, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTime, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelVenue, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textfieldLectName, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(textfieldLectName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(buttonBookCH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("STUDENT PAGE (VIEW CONSULTATION HOUR)");

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
                        .addComponent(jPanelCH, javax.swing.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
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

    private void buttonBookCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBookCHActionPerformed
        String date = ((JTextField)jDateChooser2.getDateEditor().getUiComponent()).getText();
        String time = (String)jComboBox1.getSelectedItem();
        String time2 = jComboBox1.getSelectedItem().toString();
        String lect_name = textfieldLectName.getText();
        if(loggedinUser.bookCH(lect_name, date, time, CHprofile, loggedinUser) == true){
            this.dispose();
            ViewAvailableCH view_A_CH = new ViewAvailableCH(student_page,CHprofile,loggedinUser);
            view_A_CH.setVisible(true);
        }
    }//GEN-LAST:event_buttonBookCHActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        this.setVisible(false);         //Hide this GUI
        student_page.setVisible(true);    //Show previous GUI
    }//GEN-LAST:event_buttonBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonBookCH;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelLecturerProf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCH;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    private javax.swing.JLabel labelVenue;
    private javax.swing.JTextField textfieldLectName;
    // End of variables declaration//GEN-END:variables
}
