import javax.swing.text.DateFormatter;
import java.text.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void check(double age) throws userDefinedException {
        if (age>=18&&age<60){
            System.out.println("Age is between 18 to 60--> "+age);
        }
        else {
            throw new userDefinedException("Error in Age Provided");
        }
    }
    public static void main(String[] args) throws userDefinedException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=sc.next();
        System.out.println("Enter DateOFBirth: ");
        String dob=sc.next();
        try {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate ld = LocalDate.parse(dob,dtf);
            double age = Period.between(ld, LocalDate.now()).getYears();
            check(age);
        }catch (DateTimeParseException e){
            System.out.println("Parse error");
        }
        catch (userDefinedException e){
            System.out.println(e.getMessage());
        }
    }
}