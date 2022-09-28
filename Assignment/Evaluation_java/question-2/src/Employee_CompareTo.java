import java.util.Comparator;

public class Employee_CompareTo implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getEmployeeSalary()-o2.getEmployeeSalary());
    }
}
