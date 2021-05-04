package chbookingsystem;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Admin extends User{
    private ArrayList<Admin> adminProfile;
    private ArrayList<Lecturer> lecturerProfile;
    private ArrayList<Student> studentProfile;
    private LoginMenu login_menu;
    private AdminPage admin_page;
    private ViewProfilePage view_profile_page;
    private Admin loggedinUser;
    
    //DECLARE OBJECT
    public Admin(String userID, String password, String name) {
        super(userID, password, name);
    }
    //VIEW OWN PROFILE
    public void viewOwnProfile(LoginMenu e, Admin x){
        login_menu = e;
        loggedinUser = x;
        JOptionPane showOwnProfile = new JOptionPane("View Own Profile");
        showOwnProfile.showMessageDialog(login_menu, "User ID: "+loggedinUser.getUserID()+"\nPassword: "
                                         +loggedinUser.getPassword()+"\nName: "+loggedinUser.getName());
    }
    //CREATE NEW LECTURER PROFILE
    public void createLProfile(ArrayList<Lecturer> b, LoginMenu e){
        login_menu = e;
        lecturerProfile = b;
        int lastInList = lecturerProfile.size() - 1;    
        Lecturer a = lecturerProfile.get(lastInList);   //Get last lecturer profile from arraylist
        String inputID,inputPassword,inputName,inputContactNo,inputEmailAdd = null;
        boolean flag = true;
        while(flag)
        {
            boolean found = false;
            inputID = JOptionPane.showInputDialog("Enter UserID: (Last ID is "+a.getUserID()+")", "LR");
            if(inputID == null || inputID.equals("")){      //If user input nothing/blank input
                JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                ErrorMsg.showMessageDialog(login_menu, "Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            for(int i=0; i<lecturerProfile.size(); i++)
            {
                Lecturer c = lecturerProfile.get(i);    //Get profile from arraylist
                if(c.getUserID().equals(inputID))       //If UserID found
                {
                    JOptionPane usernameExisted = new JOptionPane("Failed To Create Profile");
                    usernameExisted.showMessageDialog(login_menu,"UserID exist! Please Enter Again!");
                    found = true;
                    break;
                }
            }
            if(!found)  //If UserID not found in array list
            {
                inputPassword = JOptionPane.showInputDialog("Enter Temporary Password:");   //Ask user input password
                if(inputPassword == null || inputPassword.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputName = JOptionPane.showInputDialog("Enter Name:");                     //Ask user input name
                if(inputName == null || inputName.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputContactNo = JOptionPane.showInputDialog("Enter Contact Number:");      //Ask user input contact number
                if(inputContactNo == null || inputContactNo.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputEmailAdd = JOptionPane.showInputDialog("Enter Email Address:");        //Ask user input email address
                if(inputEmailAdd == null || inputEmailAdd.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                Lecturer d = new Lecturer(inputID, inputPassword, inputName, inputContactNo, inputEmailAdd); //Create new lecturer object
                lecturerProfile.add(d);     //Add new lecturer object into lecturer array list
                break;
            }
        }   
    }
    //CREATE NEW STUDENT PROFILE
    public void createSProfile(ArrayList<Student> b, LoginMenu e){
        login_menu = e;
        studentProfile = b;
        int lastInList = studentProfile.size() - 1;
        Student a = studentProfile.get(lastInList); //Get last student profile from array list
        String inputID, inputPassword,inputName,inputCourseAndLevel,inputContactNo,inputEmailAdd = null;    
        boolean flag = true;
        while(flag)
        {
            boolean found = false;
            inputID = JOptionPane.showInputDialog("Enter UserID: (Last ID is "+a.getUserID()+")", "SD");
            if(inputID == null || inputID.equals("")){  //If user input nothing/blank input
                JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            for(int i=0; i<studentProfile.size(); i++)
            {
                Student c = studentProfile.get(i);      //Get all student profile from array list one by one
                if(c.getUserID().equals(inputID))       //If userID found
                {
                    JOptionPane usernameExisted = new JOptionPane("Failed To Create Profile");
                    usernameExisted.showMessageDialog(login_menu,"Failed To Create Student Profile");
                    found = true;
                    break;
                }
            }
            if(!found)      //If userID not found
            {
                inputPassword = JOptionPane.showInputDialog("Enter Temporary Password:");      //Ask user input password
                if(inputPassword == null || inputPassword.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputName = JOptionPane.showInputDialog("Enter Name:");                        //Ask user input name
                if(inputName == null || inputName.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputCourseAndLevel = JOptionPane.showInputDialog("Enter Course & Level:");    //Ask user input course & level 
                if(inputCourseAndLevel == null || inputCourseAndLevel.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputContactNo = JOptionPane.showInputDialog("Enter Contact Number:");         //Ask user input contact number
                if(inputContactNo == null || inputContactNo.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                inputEmailAdd = JOptionPane.showInputDialog("Enter Email Address:");           //Ask user input email address
                if(inputEmailAdd == null || inputEmailAdd.equals("")){
                    JOptionPane ErrorMsg = new JOptionPane("Failed To Create Profile");
                    ErrorMsg.showMessageDialog(login_menu,"Cancelled", "Failed To Create Profile", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                //Create new student object
                Student d = new Student(inputID, inputPassword, inputName, inputCourseAndLevel, inputContactNo, inputEmailAdd); 
                studentProfile.add(d);      //Add new student object into student array list
                break;
            }
        }  
    }
    //VIEW LECTURER PROFILE
    public String [][] viewLProfile(AdminPage a, ArrayList<Lecturer> b){
        admin_page = a;
        lecturerProfile = b;
        int lecturer_size = lecturerProfile.size();
        String [][]data = new String[lecturer_size][4];     //Declare a 2D array by the size of the array and number of columns
        for(int i=0;i<lecturer_size;i++){
            Lecturer d = lecturerProfile.get(i);        //Get data from lecturer profile one by one
            data[i][0] = d.getUserID();     //Get lecturer userID
            data[i][1] = d.getName();       //Get lecturer name
            data[i][2] = d.getContactNo();  //Get lecturer contact number
            data[i][3] = d.getEmailAdd();   //Get lecturer email address
        }
        return data;
    }
    //VIEW STUDENT PROFILE
    public String [][] viewSProfile(AdminPage a, ArrayList<Student> b){
        admin_page = a;
        studentProfile = b;
        int student_size = studentProfile.size();
        String [][]data1 = new String[student_size][5];     //Declare 2D array to store student profile
        for(int i=0;i<student_size;i++){
            Student e = studentProfile.get(i);      //Get student profile one by one
            data1[i][0] = e.getUserID();            //Get student userID
            data1[i][1] = e.getName();              //Get student name
            data1[i][2] = e.getCourseAndLevel();    //Get student course & level
            data1[i][3] = e.getContactNo();         //Get student contact number
            data1[i][4] = e.getEmailAdd();          //Get student email address
        }
        return data1;
    }
    //EDIT LECTURER PROFILE
    public boolean editLProfile(ViewProfilePage a, ArrayList<Lecturer> b){
        boolean flag1 = false;
        view_profile_page = a;
        lecturerProfile = b;
        String inputID,inputName,inputContactNo,inputEmailAdd,remainName = null,remainContactNo = null,remainEmailAdd = null;
        boolean flag = true;
        while(flag)
        {
            boolean found = false;
            inputID = JOptionPane.showInputDialog("Enter UserID: ");
            if(inputID == null || inputID.equals(""))
            {
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            for(int i=0;i<lecturerProfile.size();i++)
            {
                Lecturer c = lecturerProfile.get(i);
                if(c.getUserID().equals(inputID))
                {    
                    inputName = JOptionPane.showInputDialog("Enter New Name: (Can Proceed with 'No Changes')","No Changes");
                    if(inputName == null|| inputName.equals(""))
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputName.equals("No Changes")){
                        remainName = c.getName(); 
                    }
                    inputContactNo = JOptionPane.showInputDialog("Enter New Contact No: (Can Proceed with 'No Changes')","No Changes");
                    if(inputContactNo == null|| inputContactNo.equals("")){
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputContactNo.equals("No Changes")){
                        remainContactNo = c.getContactNo();
                    }
                    inputEmailAdd = JOptionPane.showInputDialog("Enter New Email Address: (Can Proceed with 'No Changes')","No Changes");
                    if(inputEmailAdd == null|| inputEmailAdd.equals("")){
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputEmailAdd.equals("No Changes")){  
                        remainEmailAdd = c.getEmailAdd();
                    }
                    if(remainName != null){
                        c.setName(remainName);
                    }else{
                        c.setName(inputName);
                    }
                    if(remainContactNo != null){
                        c.setContactNo(remainContactNo);
                    }else{
                        c.setContactNo(inputContactNo);
                    }
                    if(remainEmailAdd != null){
                        c.setEmailAdd(remainEmailAdd);
                    }else{
                        c.setEmailAdd(inputEmailAdd);
                    }
                    JOptionPane SuccessfulMsg = new JOptionPane("Successfully Edited Profile");
                    SuccessfulMsg.showMessageDialog(view_profile_page,"Successfully Edited Profile","Successful", JOptionPane.INFORMATION_MESSAGE);
                    flag = false;
                    flag1 = true;
                    break;
                }else if(i == (lecturerProfile.size()-1))   //If search till the end of arraylist
                {
                    JOptionPane UserIDnotFound = new JOptionPane("Failed To Edit Profile");
                    UserIDnotFound.showMessageDialog(view_profile_page, "UserID Not Found");
                    break;
                }
            }
        }
        return flag1;
    }
    //EDIT STUDENT PROFILE
    public boolean editSProfile(ViewProfilePage a, ArrayList<Student> b){
        boolean flag1 = false;
        view_profile_page = a;
        studentProfile = b;
        String inputID,inputName,inputCourseAndLevel,inputContactNo,inputEmailAdd;
        String remainName = null, remainCourseAndLevel = null, remainContactNo = null, remainEmailAdd = null;
        boolean flag = true;
        while(flag)
        {
            boolean found = false;
            inputID = JOptionPane.showInputDialog("Enter UserID: ");
            if(inputID == null || inputID.equals(""))
            {
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            for(int i=0;i<studentProfile.size();i++)
            {
                Student c = studentProfile.get(i);
                if(c.getUserID().equals(inputID))       //If userID found
                {    
                    inputName = JOptionPane.showInputDialog("Enter New Name: (Can Proceed with 'No Changes')","No Changes");
                    if(inputName == null|| inputName.equals(""))
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputName.equals("No Changes")){
                        remainName = c.getName();
                    }
                    inputCourseAndLevel = JOptionPane.showInputDialog("Enter New Course & Level: (Can Proceed with 'No Changes')","No Changes");
                    if(inputCourseAndLevel == null|| inputCourseAndLevel.equals("")){
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputCourseAndLevel.equals("No Changes")){    
                        remainCourseAndLevel = c.getCourseAndLevel();
                    }
                    inputContactNo = JOptionPane.showInputDialog("Enter New Contact No: (Can Proceed with 'No Changes')","No Changes");
                    if(inputContactNo == null|| inputContactNo.equals(""))
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputContactNo.equals("No Changes")){ 
                        remainContactNo = c.getContactNo();
                    }
                    inputEmailAdd = JOptionPane.showInputDialog("Enter New Email Address: (Can Proceed with 'No Changes')","No Changes");
                    if(inputEmailAdd == null|| inputEmailAdd.equals("")){
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                        ErrorMsg.showMessageDialog(view_profile_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                        flag = false;
                        break;
                    }else if(inputEmailAdd.equals("No Changes")){ 
                        remainEmailAdd = c.getEmailAdd();
                    }
                    
                    if(remainName != null){
                        c.setName(remainName);
                    }else{
                        c.setName(inputName);
                    }
                    if(remainCourseAndLevel != null){
                        c.setCourseAndLevel(remainCourseAndLevel);
                    }else{
                        c.setCourseAndLevel(inputCourseAndLevel);
                    } 
                    if(remainContactNo != null){
                        c.setContactNo(remainContactNo);
                    }else{
                        c.setContactNo(inputContactNo);
                    }
                    if(remainEmailAdd != null){
                        c.setEmailAdd(remainEmailAdd);
                    }else{
                        c.setEmailAdd(inputEmailAdd);
                    }
                    JOptionPane SuccessfulMsg = new JOptionPane("Successfully Edited Profile");
                    SuccessfulMsg.showMessageDialog(view_profile_page,"Successfully Edited Profile","Successful", JOptionPane.INFORMATION_MESSAGE);
                    flag1 = true;
                    flag = false;
                    break;
                }else if(i == (studentProfile.size()-1))
                {
                    JOptionPane UserIDnotFound = new JOptionPane("Failed To Edit Profile");
                    UserIDnotFound.showMessageDialog(view_profile_page, "UserID Not Found");
                    break;
                }
            }
        }
        return flag1;
    }
    //EDIT OWN USER PROFILE
    public void editOwnProfile(AdminPage a, Admin b){
        admin_page = a;
        loggedinUser = b;
        String inputPassword,inputName;
        while(true)
        {
            inputPassword = JOptionPane.showInputDialog("Enter New Password: ");    //Ask user input new password
            if(inputPassword == null || inputPassword.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(admin_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            inputName = JOptionPane.showInputDialog("Enter New Name: ");            //Ask user input new name
            if(inputName == null || inputName.equals("")){
                JOptionPane ErrorMsg = new JOptionPane("Failed To Edit Profile");
                ErrorMsg.showMessageDialog(admin_page, "Cancelled", "Failed To Edit Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            JOptionPane SuccessfulMsg = new JOptionPane("Successfully Edited Profile");
            SuccessfulMsg.showMessageDialog(admin_page,"Successfully Edited Profile","Successful", JOptionPane.INFORMATION_MESSAGE);
            loggedinUser.setPassword(inputPassword);    //Set the current user password to new input
            loggedinUser.setName(inputName);            //Set the current user name to new input
            break;
        }
    }
    //DELETE LECTURER PROFILE
    public void deleteLProfile(AdminPage a, ArrayList<Lecturer> b){
        admin_page = a;
        lecturerProfile = b;
        String inputID,inputID1;    //Declare 2 variables for user input ID
        boolean flag = true;
        while(flag)
        {
            inputID = JOptionPane.showInputDialog("Enter Lecturer User ID You Wished To Delete: "); //Ask user input user ID
            if(inputID == null || inputID.equals(""))
            {
                JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Profile");
                ErrorMsg.showMessageDialog(admin_page, "Cancelled", "Failed To Delete Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            for(int i=0; i<lecturerProfile.size(); i++)
            {
                Lecturer c = lecturerProfile.get(i);
                if(c.getUserID().equals(inputID))   //Check if userID exists in arraylist
                {
                    inputID1 = JOptionPane.showInputDialog("Please Enter User ID Again To Confirm: ");  //Ask user input again
                    if(inputID1 == null || inputID1.equals(""))
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Profile");
                        ErrorMsg.showMessageDialog(admin_page, "Cancelled", "Failed To Delete Profile", JOptionPane.ERROR_MESSAGE);
                        break;
                    }else if(inputID1.equals(inputID)){   //Check if both input entry is the same
                        lecturerProfile.remove(c);
                        JOptionPane SuccessfulMsg = new JOptionPane("Successfully Deleted Profile");
                        SuccessfulMsg.showMessageDialog(admin_page,"Successfully Deleted Profile","Successful", JOptionPane.INFORMATION_MESSAGE); 
                        flag = false;
                        break;
                    }else
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Profile");
                        ErrorMsg.showMessageDialog(admin_page, "UserID Entered Are Not Same", "Failed To Delete Profile", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }else if(i == (lecturerProfile.size() - 1)){
                    JOptionPane UserIDnotFound = new JOptionPane("Failed To Delete Profile");
                    UserIDnotFound.showMessageDialog(admin_page, "UserID Not Found");
                    break;
                }
            }
        }  
    }
    
    public void deleteSProfile(AdminPage a, ArrayList<Student> b){
        admin_page = a;
        studentProfile = b;
        String inputID,inputID1;    //Declare 2 variables for user input ID
        boolean flag = true;
        while(flag)
        {
            inputID = JOptionPane.showInputDialog("Enter Student User ID You Wished To Delete: "); //Ask user input user ID
            if(inputID == null || inputID.equals(""))
            {
                JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Profile");
                ErrorMsg.showMessageDialog(admin_page, "Cancelled", "Failed To Delete Profile", JOptionPane.ERROR_MESSAGE);
                break;
            }
            for(int i=0; i<studentProfile.size(); i++)
            {
                Student c = studentProfile.get(i);
                if(c.getUserID().equals(inputID))   //Check if userID exists in arraylist
                {
                    inputID1 = JOptionPane.showInputDialog("Please Enter User ID Again To Confirm: ");  //Ask user input again
                    if(inputID1 == null || inputID1.equals(""))
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Profile");
                        ErrorMsg.showMessageDialog(admin_page, "Cancelled", "Failed To Delete Profile", JOptionPane.ERROR_MESSAGE);
                        break;
                    }else if(inputID1.equals(inputID)){   //Check if both input entry is the same
                        studentProfile.remove(c);
                        JOptionPane SuccessfulMsg = new JOptionPane("Successfully Deleted Profile");
                        SuccessfulMsg.showMessageDialog(admin_page,"Successfully Deleted Profile","Successful", JOptionPane.INFORMATION_MESSAGE); 
                        flag = false;
                        break;
                    }else
                    {
                        JOptionPane ErrorMsg = new JOptionPane("Failed To Delete Profile");
                        ErrorMsg.showMessageDialog(admin_page, "UserID Entered Are Not Same", "Failed To Delete Profile", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                }else if(i == (studentProfile.size() - 1)){
                    JOptionPane UserIDnotFound = new JOptionPane("Failed To Delete Profile");
                    UserIDnotFound.showMessageDialog(admin_page, "UserID Not Found");
                    break;
                }
            }
        }  
    }

    
    
    //RETURN STRING WHEN IT IS CALLED 
    public String toString(){
        return "\nUser ID: " + this.getUserID() +
                "\nPassword: " + this.getPassword() +
                "\nName: " + this.getName();
    }    
}
            

