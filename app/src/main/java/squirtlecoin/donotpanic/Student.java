package squirtlecoin.donotpanic;

/**
 * Created by Victi on 4/7/2018.
 */

public class Student {

    // fields

    private int studentID;

    private String studentName;

    // constructors

    public Student() {}

    public Student(int id, String studentname) {

        this.studentID = id;

        this.studentName = studentname;

    }

    // properties

    public void setID(int id) {

        this.studentID = id;

    }

    public int getID() {

        return this.studentID;

    }

    public void setStudentName(String studentname) {

        this.studentName = studentname;

    }

    public String getStudentName() {

        return this.studentName;

    }

}