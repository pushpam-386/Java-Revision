import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Employee> set=new TreeSet<>(new Employee_CompareTo());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of Employee to be entered:  ");
        int input=sc.nextInt();
        for (int i=1;i<=input;i++){
            System.out.println("Enter Employee_Id:  ");
            int id=sc.nextInt();
            System.out.println("Enter Employee Name:  ");
            String name=sc.next();
            System.out.println("Enter Employee Address:  ");
            String address=sc.next();
            System.out.println("Enter salary of Employee:  ");
            double salary=sc.nextDouble();

            Employee employee=new Employee(id,name,address,salary);
            set.add(employee);
        }
        for (Employee e1:set) {
            System.out.println("Display Employee Details:  ");
            System.out.println("Employee id:-->"+e1.getEmployeeId());
            System.out.println("Employee name: -->"+e1.getEmployeeName());
            System.out.println("Employee address:-->"+e1.getEmployeeAddress());
            System.out.println("Employee Salary:-->"+e1.getEmployeeSalary());
        }

    }
}