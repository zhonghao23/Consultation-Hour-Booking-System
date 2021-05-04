package chbookingsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lecturer extends User{
    private SetConsultationHours set_CH_page; 
    private EditConsultationHours edit_CH_page;
    private ViewConsultationHours view_CH_page;
    private String contactNo, emailAdd;
    private ArrayList<ConsultationHour> CHprofile;
    
    public Lecturer(String userID, String password, String name, String contactNo, String emailAdd) {
        super(userID, password, name);
        this.contactNo = contactNo;
        this.emailAdd = emailAdd;
        CHprofile = new ArrayList<ConsultationHour>();
    }

    public String getContactNo() {
        return contactNo;
    }
    public String getEmailAdd() {
        return emailAdd;
    }
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }
    public ArrayList<ConsultationHour> getCHprofile() {
        return CHprofile;
    }
    
    public void createCH(String venue, String date, String time, ArrayList<ConsultationHour> CHprofile, Lecturer loggedinUser){
        if(loggedinUser.getCHprofile().size() == 0){
            Student f = null;
            ConsultationHour x = new ConsultationHour(this,f,venue,date,time);
            this.getCHprofile().add(x);
            CHprofile.add(x);
            JOptionPane SuccessfulMsg = new JOptionPane("Successfully Created Consultation Hour");
            SuccessfulMsg.showMessageDialog(set_CH_page,"Successfully Created Consultation Hour","Successful", JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(int i=0;i<loggedinUser.getCHprofile().size();i++){
                ConsultationHour e = loggedinUser.getCHprofile().get(i);
                if(date.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Consultation Hour");
                    ErrorMsg.showMessageDialog(set_CH_page,"Date Is Not Set.","Failed", JOptionPane.ERROR_MESSAGE);
                    break;
                }else if(e.getDate().equals(date) && e.getTime().equals(time)){
                    JOptionPane CHnotavailable = new JOptionPane("Failed To Create Consultation Hour");
                    CHnotavailable.showMessageDialog(set_CH_page,"Date & Time Unavailable.\nFailed To Create Consultation Hour","Failed", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }else if (i == (loggedinUser.getCHprofile().size() - 1)){
                    Student f = null;
                    ConsultationHour x = new ConsultationHour(this,f,venue,date,time);
                    this.getCHprofile().add(x);
                    CHprofile.add(x);
                    JOptionPane SuccessfulMsg = new JOptionPane("Successfully Created Consultation Hour");
                    SuccessfulMsg.showMessageDialog(set_CH_page,"Successfully Created Consultation Hour","Successful", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        } 
    }
    
    public boolean deleteCH(String venue, String date, String time, ArrayList<ConsultationHour> CHprofile,Lecturer loggedinUser){
        boolean flag = false;
        for(int i=0;i<loggedinUser.getCHprofile().size();i++)
        {
            ConsultationHour c = loggedinUser.getCHprofile().get(i);
            if(date.equals("") || venue.equals("Select") || time.equals("Select")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Consultation Hour");
                ErrorMsg.showMessageDialog(set_CH_page, "Please Select Date & Time & Venue", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(date.equals(c.getDate()) && venue.equals(c.getVenue()) && time.equals(c.getTime())){
                loggedinUser.getCHprofile().remove(c);
                CHprofile.remove(c);
                flag = true;
                JOptionPane SuccessfulMsg = new JOptionPane("Successfully Deleted Consultation Hour");
                SuccessfulMsg.showMessageDialog(edit_CH_page,"Successfully Deleted Consultation Hour","Successful", JOptionPane.INFORMATION_MESSAGE);
                break;
            }else if (i == (loggedinUser.getCHprofile().size() - 1)){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Consultation Hour");
                ErrorMsg.showMessageDialog(set_CH_page, "Consultation Hour Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }
        } 
        return flag;
    }
    
    public boolean editCH(String newVenue,String newDate, String newTime, String oriVenue,String oriDate,String oriTime,ArrayList<ConsultationHour> CHprofile, Lecturer loggedinUser){
        boolean flag=false;
        for(int i=0;i<loggedinUser.getCHprofile().size();i++)
        {
            if(newDate.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Create Consultation Hour");
                ErrorMsg.showMessageDialog(edit_CH_page,"Date Is Not Set.","Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }
            ConsultationHour c = loggedinUser.getCHprofile().get(i);
            if(newDate.equals(c.getDate()) && newTime.equals(c.getTime())){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Create Consultation Hour");
                ErrorMsg.showMessageDialog(edit_CH_page,"ConsultationHour Exists","Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }else if (i == (loggedinUser.getCHprofile().size()-1)){
                for(int j=0;j<loggedinUser.getCHprofile().size();j++){
                    ConsultationHour d = loggedinUser.getCHprofile().get(j);
                    if(oriVenue.equals(d.getVenue()) && oriDate.equals(d.getDate()) && oriTime.equals(d.getTime())){
                        d.setVenue(newVenue);
                        d.setDate(newDate);
                        d.setTime(newTime);
                        flag = true;
                        JOptionPane SuccessfulMsg = new JOptionPane("Successfully Edited Consultation Hour");
                        SuccessfulMsg.showMessageDialog(edit_CH_page,"Successfully Edited Consultation Hour","Successful", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }          
                }
            }
        }
        return flag;
    }
    
    public void searchCH(String venue, String date, String time, ArrayList<ConsultationHour> CHprofile,Lecturer loggedinUser){
        String studentname;
        for(int i=0;i<loggedinUser.getCHprofile().size();i++)
        {
            ConsultationHour c = loggedinUser.getCHprofile().get(i);
            if(date.equals("") || venue.equals("Select") || time.equals("Select")){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(view_CH_page, "Please Select Date & Time & Venue", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(date.equals(c.getDate()) && venue.equals(c.getVenue()) && time.equals(c.getTime())){
                try{
                    studentname = c.getStud().getName();
                }catch(Exception e){
                    studentname = "";
                }
                JOptionPane searchCH = new JOptionPane("Search Consultation Hour");
                searchCH.showMessageDialog(view_CH_page,"Student: "+studentname+"\nDate: "+c.getDate()
                                            +"\nTime: "+c.getTime()+"\nVenue: "+c.getVenue(),"Consultation Hour Found", JOptionPane.INFORMATION_MESSAGE);
                break;
            }else if (i == (loggedinUser.getCHprofile().size() - 1)){
                JOptionPane ErrorMsg = new JOptionPane("Failed");
                ErrorMsg.showMessageDialog(view_CH_page, "Consultation Hour Not Found", "Failed", JOptionPane.ERROR_MESSAGE);
                break;
            }
        }         
    }
    
    public void viewOwnProfile(LecturerPage lecturer_page, Lecturer loggedinUser){
        JOptionPane showOwnProfile = new JOptionPane("View Own Profile");
        showOwnProfile.showMessageDialog(lecturer_page, "User ID: "+loggedinUser.getUserID()+"\nPassword: "
                                         +loggedinUser.getPassword()+"\nName: "+loggedinUser.getName()
                                         +"\nContact No: "+ loggedinUser.getContactNo()+"\nEmail Address: "
                                         +loggedinUser.getEmailAdd());
    }

    public void editOwnProfile(LecturerPage lecturer_page, Lecturer loggedinUser){
        String inputPassword,inputContactNo,inputEmailAdd;
        String remainPassword=null,remainContactNo=null,remainEmailAdd=null;
        while(true)
        {
            inputPassword = JOptionPane.showInputDialog("Enter New Password: (Can Proceed with 'No Changes')","No Changes");    //Ask user input new password
            if(inputPassword == null || inputPassword.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(lecturer_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(inputPassword.equals("No Changes")){
                remainPassword = loggedinUser.getPassword();
            }
            inputContactNo = JOptionPane.showInputDialog("Enter New Contact No: (Can Proceed with 'No Changes')","No Changes");            //Ask user input new name
            if(inputContactNo == null || inputContactNo.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(lecturer_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }else if(inputContactNo.equals("No Changes")){
                remainContactNo = loggedinUser.getContactNo();
            }
            inputEmailAdd = JOptionPane.showInputDialog("Enter New Email Address: (Can Proceed with 'No Changes')","No Changes");            //Ask user input new name
            if(inputEmailAdd == null || inputEmailAdd.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(lecturer_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
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
            SuccessfulMsg.showMessageDialog(lecturer_page,"Successfully Edited Profile","Successful", JOptionPane.INFORMATION_MESSAGE);            break;
        }
    }    

    public String [][] viewCHprofile(){
        int CHsize = this.getCHprofile().size();
        String [][]data = new String[CHsize][4];
        for(int i=0;i<CHsize;i++){
            ConsultationHour d = this.getCHprofile().get(i);
            try{        
                data[i][0] = d.getStud().getName();
            }catch(Exception e){
                data[i][0] = "";
            }
            data[i][1] = d.getDate();
            data[i][2] = d.getTime();
            data[i][3] = d.getVenue();
        }
        return data;
    }    
    

    
    
    
    
    
        
    public String toString(){
        return "\nUser ID: " + this.getUserID() +
                "\nPassword: " + this.getPassword() +
                "\nName: " + this.getName() +
                "\nContact No: " + this.getContactNo() +
                "\nEmail Address: " + this.getEmailAdd();
    }

    
    
    
}
//    public ArrayList<Lecturer> getLecturerProfile() {
//        return lecturerProfile;
//    }
//}
