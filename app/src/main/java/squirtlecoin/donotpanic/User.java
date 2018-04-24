package squirtlecoin.donotpanic;

/**
 * Created by Victi on 4/7/2018.
 */

public class User {

    // fields

    private int userID;

    private String userName;

    // constructors

    public User() {}

    public User(int id, String username) {

        this.userID = id;

        this.userName = username;

    }

    // properties

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