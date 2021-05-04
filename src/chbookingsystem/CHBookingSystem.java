package chbookingsystem;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class CHBookingSystem {
    public static void main(String[] args) {
        ArrayList<Admin> adminProfile;          //Declare new arraylist for admin profile
        ArrayList<Lecturer> lecturerProfile;    //Declare new arraylist for lecturer profile
        ArrayList<Student> studentProfile;      //Declare new arraylist for student profile
        ArrayList<ConsultationHour> CHprofile;  //Declare new arraylist for consultation hour profile
        try
        {
            Scanner adminFile = new Scanner(new File("admin.txt"));     //Scan admin.txt file
            adminProfile = new ArrayList<Admin>();
            while(adminFile.hasNext()){     //While not end of file
                String userID = adminFile.nextLine();       //Get userID from file
                String password = adminFile.nextLine();     //Get password from file
                String name = adminFile.nextLine();         //Get name from file
                adminFile.nextLine();
                Admin a = new Admin(userID, password, name);  //Create new admin object
                adminProfile.add(a);        //Add object into admin arraylist
            }
            Scanner lecturerFile = new Scanner(new File("lecturer.txt"));   //Scan lecturer.txt file
            lecturerProfile = new ArrayList<Lecturer>();
            while(lecturerFile.hasNext()){  //While not end of file
                String userID = lecturerFile.nextLine();        //Get userID from file
                String password = lecturerFile.nextLine();      //Get password from file
                String name = lecturerFile.nextLine();          //Get name from file
                String contactNo = lecturerFile.nextLine();     //Get contact number from file
                String emailAdd = lecturerFile.nextLine();      //Get email address from file
                lecturerFile.nextLine();
                Lecturer a = new Lecturer(userID, password, name, contactNo, emailAdd);  //Create new lecturer object
                lecturerProfile.add(a);     //Add object into lecturer arraylist
            }
            Scanner studentFile = new Scanner(new File("student.txt"));     //Scan student.txt file
            studentProfile = new ArrayList<Student>();
            while(studentFile.hasNext()){   //While not end of file
                String userID = studentFile.nextLine();         //Get userID from file
                String password = studentFile.nextLine();       //get password from file
                String name = studentFile.nextLine();           //Get name from file
                String courseAndLevel = studentFile.nextLine(); //Get course & level from file
                String contactNo = studentFile.nextLine();      //Get contact number from file
                String emailAdd = studentFile.nextLine();       //Get email address from file
                studentFile.nextLine();
                Student a = new Student(userID, password, name, courseAndLevel, contactNo, emailAdd);   //Create new student object  
                studentProfile.add(a);      //Add object into student arraylist
            }
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");     //Set date format to MM/dd/yyyy
            Date date = new Date(); 
            Scanner consultationHourFile = new Scanner(new File("consultationhour.txt"));
            CHprofile = new ArrayList<ConsultationHour>();
            while(consultationHourFile.hasNext()){
                String lectName = consultationHourFile.nextLine();
                String studName = consultationHourFile.nextLine();
                String venue = consultationHourFile.nextLine();
                String date1 = consultationHourFile.nextLine();
                String time = consultationHourFile.nextLine();
                consultationHourFile.nextLine();
                Date date2 = dateFormat.parse(date1);   //convert the string into Date format
                if(studName.equals("") && (((date).compareTo(date2)<0) || (((date)).compareTo(date2) == 0))){   //compare those dates to today date and filter those expired
                    Student d = null;
                    for(int i=0;i<lecturerProfile.size();i++){
                        Lecturer b = lecturerProfile.get(i);
                        if(b.getName().equals(lectName)){
                            ConsultationHour CH = new ConsultationHour(b,d,venue,date1,time);
                            CHprofile.add(CH);
                            b.getCHprofile().add(CH);
                            break;
                        }
                    }
                }else if(!studName.equals("") && (((date).compareTo(date2)<0) || (((date)).compareTo(date2) == 0))){
                    for(int i=0;i<lecturerProfile.size();i++){
                        Lecturer e = lecturerProfile.get(i);
                        if(e.getName().equals(lectName)){
                            for(int j=0;j<studentProfile.size();j++){
                                Student c = studentProfile.get(j);
                                if(c.getName().equals(studName)){
                                    ConsultationHour a = new ConsultationHour(e,c,venue,date1,time);
                                    CHprofile.add(a);
                                    e.getCHprofile().add(a);
                                    c.getCHprofile().add(a);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }catch(Exception e){
            adminProfile = new ArrayList<Admin>();
            lecturerProfile = new ArrayList<Lecturer>();
            studentProfile = new ArrayList<Student>();
            CHprofile = new ArrayList<ConsultationHour>();
        } 
        new LoginMenu(adminProfile, lecturerProfile, studentProfile, CHprofile).setVisible(true);  //Call & show the first GUI
    }
}
