import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private int rollNo;
    private String name;
    private float mathsMarks;
    private float scienceMarks;
    private float engMarks;

    public Student() {
    }

    public Student(int rollNo, String name, float mathsMarks, float scienceMarks, float engMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
        this.engMarks = engMarks;
    }



    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(float mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public float getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(float scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public float getEngMarks() {
        return engMarks;
    }

    public void setEngMarks(float engMarks) {
        this.engMarks = engMarks;
    }
}
