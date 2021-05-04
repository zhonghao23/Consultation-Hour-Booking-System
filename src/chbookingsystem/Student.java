package chbookingsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Student extends User{
    private String courseAndLevel,contactNo, emailAdd;
    private ArrayList<ConsultationHour> CHprofile;
    private ViewAvailableCH view_A_CH;
    private ViewBookedCH view_Booked_CH;
    public Student(String userID, String password, String name, String courseAndLevel, String contactNo, String emailAdd){
        super(userID, password, name);
        this.courseAndLevel = courseAndLevel;
        this.contactNo = contactNo;
        this.emailAdd = emailAdd;
        CHprofile = new ArrayList<ConsultationHour>();
    }


    public ArrayList<ConsultationHour> getCHprofile() {
        return CHprofile;
    }
    public String getCourseAndLevel() {
        return courseAndLevel;
    }
    public String getContactNo() {
        return contactNo;
    }
    public String getEmailAdd() {
        return emailAdd;
    }
    public void setCourseAndLevel(String courseAndLevel) {
        this.courseAndLevel = courseAndLevel;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
    
    public void viewOwnProfile(StudentPage student_page, Student loggedinUser){
        JOptionPane showOwnProfile = new JOptionPane("View Own Profile");
        showOwnProfile.showMessageDialog(student_page, "User ID: "+loggedinUser.getUserID()+"\nPassword: "
                                         +loggedinUser.getPassword()+"\nName: "+loggedinUser.getName()
                                         +"\nCourse & Level: "+loggedinUser.getCourseAndLevel()
                                         +"\nContact No: "+ loggedinUser.getContactNo()+"\nEmail Address: "
                                         +loggedinUser.getEmailAdd());    
    }
        
    public void editOwnProfile(StudentPage student_page, Student loggedinUser){
        String inputPassword,inputContactNo,inputEmailAdd;
        String remainPassword=null,remainContactNo=null,remainEmailAdd=null;
        while(true)
        {
            inputPassword = JOptionPane.showInputDialog("Enter New Password: (Can Proceed with 'No Changes')","No Changes");    //Ask user input new password
            if(inputPassword == null || inputPassword.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(student_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(inputPassword.equals("No Changes")){
                remainPassword = loggedinUser.getPassword();
            }
            inputContactNo = JOptionPane.showInputDialog("Enter New Contact No: (Can Proceed with 'No Changes')","No Changes");            //Ask user input new name
            if(inputContactNo == null || inputContactNo.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(student_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(inputContactNo.equals("No Changes")){
                remainContactNo = loggedinUser.getContactNo();
            }
            inputEmailAdd = JOptionPane.showInputDialog("Enter New Email Address: (Can Proceed with 'No Changes')","No Changes");            //Ask user input new name
            if(inputEmailAdd == null || inputEmailAdd.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(student_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(inputEmailAdd.equals("No Changes")){
                remainEmailAdd = loggedinUser.getEmailAdd();
            }
            if(remainPassword != null){
                loggedinUser.setPassword(remainPassword);
            }else{
                loggedinUser.setPassword(inputPassword);
            }
            if(remainContactNo != null){
                loggedinUser.setContactNo(remainContactNo);
            }else{
                loggedinUser.setContactNo(inputContactNo);
            }
            if(remainEmailAdd != null){
                loggedinUser.setEmailAdd(remainEmailAdd);
            }else{
                loggedinUser.setEmailAdd(inputEmailAdd);
            }
            JOptionPane SuccessfulMsg = new JOptionPane("Successfully Edited Profile");
            SuccessfulMsg.showMessageDialog(student_page,"Successfully Edited Profile","Successful", JOptionPane.INFORMATION_MESSAGE);            break;
        }  
    }
        
    public String [][] viewAvailableCHprofile(ArrayList<ConsultationHour> CHprofile){
        int CHsize = 0;
        int j = 0;
        for(int i=0;i<CHprofile.size();i++){
            ConsultationHour e = CHprofile.get(i);
            try{
                e.getStud().getName();
            }catch(Exception ex){
                CHsize = CHsize + 1;
            }
        }
        String [][]data = new String[CHsize][5];
        for(int i=0;i<CHprofile.size();i++){
            ConsultationHour d = CHprofile.get(i);
            try{
                d.getStud().getName();
            }catch(Exception e){
                data[j][0] = d.getLect().getName();
                data[j][1] = "";
                data[j][2] = d.getDate();
                data[j][3] = d.getTime();
                data[j][4] = d.getVenue();
                j++;
            }
        }
        return data;
    }     
    
    public boolean bookCH(String lect_name,String date,String time,ArrayList<ConsultationHour> CHprofile,Student loggedinUser){
        boolean flag = false;
        for(int i=0;i<CHprofile.size();i++){
            ConsultationHour a = CHprofile.get(i);
            if(date.equals("") || lect_name.equals("") || time.equals("Select")){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(view_A_CH, "Please Select Date & Time & Lecturer", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(date.equals(a.getDate()) && time.equals(a.getTime()) && lect_name.equals(a.getLect().getName())){
                try{
                    a.getStud().getName();
                    JOptionPane ErrorMsg = new JOptionPane("Failed");
                    ErrorMsg.showMessageDialog(view_A_CH, "Consultation Hour Not Available", "Failed", JOptionPane.ERROR_MESSAGE);
                    break;
                }catch(Exception ex){
                    a.setStud(loggedinUser);
                    loggedinUser.getCHprofile().add(a);
                    JOptionPane SuccessfulMsg = new JOptionPane("Successfully Booked Consultation Hour");
                    SuccessfulMsg.showMessageDialog(view_A_CH,"Successfully Booked Consultation Hour","Successful", JOptionPane.INFORMATION_MESSAGE);
                    flag = true;
                    break;
                }
            }else if(i == (CHprofile.size() - 1)){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(view_A_CH, "Consultation Hour Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            } 
        }
        return flag;
    }
    
    public boolean cancelCH(String lect_name,String date,String time,ArrayList<ConsultationHour> CHprofile,Student loggedinUser){
        boolean flag = false;
        for(int i=0;i<loggedinUser.getCHprofile().size();i++){
            ConsultationHour a = loggedinUser.getCHprofile().get(i);
            if(date.equals("") || lect_name.equals("") || time.equals("Select")){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(view_Booked_CH, "Please Select Date & Time & Lecturer", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(date.equals(a.getDate()) && time.equals(a.getTime()) && lect_name.equals(a.getLect().getName()))
            {
                a.setStud(null);
                loggedinUser.getCHprofile().remove(a);
                JOptionPane SuccessfulMsg = new JOptionPane("Successfully Cancelled Consultation Hour");
                SuccessfulMsg.showMessageDialog(view_Booked_CH,"Successfully Cancelled Consultation Hour","Successful", JOptionPane.INFORMATION_MESSAGE);
                flag = true;
                break;
            }else if(i == (loggedinUser.getCHprofile().size() - 1)){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(view_Booked_CH, "Consultation Hour Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            } 
        }        
        return flag;
    }
    
    
    public String [][] viewBookedCHprofile(){     
        int CHsize = this.getCHprofile().size();
        String [][]data = new String[CHsize][5];
        for(int i=0;i<CHsize;i++){
            ConsultationHour d = this.getCHprofile().get(i);
            data[i][0] = d.getLect().getName();
            data[i][1] = d.getStud().getName();
            data[i][2] = d.getDate();
            data[i][3] = d.getTime();
            data[i][4] = d.getVenue();
        }
        return data;        
    }
 
    
    public String toString(){
    return "\nUser ID: " + this.getUserID() +
            "\nPassword: " + this.getPassword() +
            "\nName: " + this.getName() +
            "\nCourse & Level: " + this.getCourseAndLevel() +
            "\nContact No: " + this.getContactNo() +
            "\nEmail Address: " + this.getEmailAdd();
    }
}
