package squirtlecoin.donotpanic;

/**
 * Created by Victi on 4/7/2018.
 */

public class User {

    // Fields

    private int userID;
    private String userName;
    private String password;

    // Constructors

    public User(int id, String username, String pw) {
        this.userID = id;
        this.userName = username;
        this.password = pw;
    }

    // Functions

    public void setID(int id) {
        this.userID = id;
    }

    public int getID() {
        return this.userID;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getStudentName() {
        return this.userName;
    }

}