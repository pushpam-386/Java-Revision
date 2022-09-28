import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Department implements Serializable {
        private List<Employeee> employeeeList=new ArrayList<>();


    public Department() {
    }

    public void addEmployee(Employeee employeee){
        if(checkExp(employeee.getJoiningDate())>=5){
            employeee.setEmployeeSalary(employeee.getEmployeeSalary()+5000);
            employeeeList.add(employeee);
            System.out.println("Employee added and Salary is increased by 5000");
            return;
        }
        employeeeList.add(employeee);
        System.out.println("Employee added ");
    }

    private int checkExp(LocalDate joiningDate) {
        Period period=Period.between(joiningDate,LocalDate.now());
        return period.getYears();
    }

    public void printDetails(){
        System.out.println("Employee Details");
        for (Employeee employeee:employeeeList) {
            System.out.println("Employee [employeeId="+employeee.getEmployeeId()+
                    ", employeeName="+employeee.getEmployeeName()+", employeeAddress=noida,"+
                    employeee.getEmployeeAddress()+", employeeSalary="+employeee.getEmployeeSalary()+
                    ", Joining Date:"+employeee.getJoiningDate()+"]");
            System.out.println("------------------------------------------------------");
        }
    }

}
