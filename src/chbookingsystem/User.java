package chbookingsystem;
public class User {
    private String userID, password, name;
    
    public User(String userID, String password, String name) {
        this.userID = userID;
        this.password = password;
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public void setUserID(String userID) {
        this.userID = userID;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
}
