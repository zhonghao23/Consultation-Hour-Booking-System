package chbookingsystem;

public class ConsultationHour {
    private Lecturer lect;
    private Student stud;
    private String venue, date, time;
    public ConsultationHour(Lecturer lect, Student stud, String venue, String date, String time) {
        this.lect = lect;
        this.stud = stud;
        this.venue = venue;
        this.date = date;
        this.time = time;
    }

    public Lecturer getLect() {
        return lect;
    }
    public Student getStud() {
        return stud;
    }
    public String getVenue() {
        return venue;
    }
    public String getDate() {
        return date;
    }
    public String getTime() {
        return time;
    }

    public void setStud(Student stud) {
        this.stud = stud;
    }
    public void setVenue(String venue) {
        this.venue = venue;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void setTime(String time) {
        this.time = time;
    }
    
    
    
    public String toString(){
        return "\nLecturer: " + lect.getName() +
               "\nStudent: " + stud +
               "\nVenue: " + venue +
               "\nDate: " + date +
               "\nTime: " + time;
    }
}
