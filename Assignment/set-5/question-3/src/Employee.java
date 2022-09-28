import java.io.Serializable;

public class Employee implements Serializable {
    private int Id;
    private String Name;
    private double Salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }
}
