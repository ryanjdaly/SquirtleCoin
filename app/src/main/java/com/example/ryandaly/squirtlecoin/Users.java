package com.example.ryandaly.squirtlecoin;

public class Users {
    // fields
    private int userID;
    private String userName;
    // constructors
    public Users() {}
    public Users(int id, String username) {
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
    public void setStudentName(String username) {
        this.userName = username;
    }
    public String getUserName() {
        return this.userName;
    }
}
