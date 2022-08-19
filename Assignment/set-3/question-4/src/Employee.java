import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable,Comparable {
    String name;
    String employeeId;
    Double salary;
    LocalDate joiningDate;

    public Employee() {

    }



    public Employee(String name, String employeeId, Double salary, LocalDate joiningDate) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public int compareTo(Object o) {
        this.getJoiningDate()
    }
}
