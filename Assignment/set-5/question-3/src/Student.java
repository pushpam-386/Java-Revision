import java.io.Serial;
import java.io.Serializable;

public class Student implements Serializable {
    private int Roll;
    private String Name;
    private double Marks;

    public Student() {
    }

    public Student(int roll, String name, double marks) {
        Roll = roll;
        Name = name;
        Marks = marks;
    }

    public int getRoll() {
        return Roll;
    }

    public void setRoll(int roll) {
        Roll = roll;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getMarks() {
        return Marks;
    }

    public void setMarks(double marks) {
        Marks = marks;
    }
}

