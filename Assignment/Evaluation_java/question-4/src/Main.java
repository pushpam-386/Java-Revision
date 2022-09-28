import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you want to add employee: (Y/N)");
        String input=scanner.next();
        Department department=new Department();

        while (input.equalsIgnoreCase("Y")) {
            int count=1;
            System.out.println("Enter the Details for:"+count+"Employee");
            System.out.println("Enter the Employee id: ");
            int id=scanner.nextInt();
            System.out.println("Enter the Employee Name: ");
            String name=scanner.next();
            System.out.println("Enter the Employee Address: ");
            String address=scanner.next();
            System.out.println("Enter the Employee Salary: ");
            double salary=scanner.nextDouble();
            System.out.println("Enter the Joining Date: ");
            String jdate=scanner.next();
            DateTimeFormatter format=DateTimeFormatter.ofPattern("dd/mm/yyyy");
            LocalDate localDate;
            try {
                localDate=LocalDate.parse(jdate,format);
            }
            catch (Exception e){
                System.out.println("Please Pass Date in proper Format: (dd/mm/yyyy)");
                continue;
            }

            Employeee employeee=new Employeee(id,name,address,salary,localDate);
            department.addEmployee(employeee);

            System.out.println("Do you want to add more Employee? (Y/N): ");
            input=scanner.next();

        }
        System.out.println("Thank You");
        department.printDetails();
    }
}