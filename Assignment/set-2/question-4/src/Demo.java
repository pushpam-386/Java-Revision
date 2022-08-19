import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter UseName of Length 3 t0 8 character & Alphabet only: ");
        String username=sc.next();
        System.out.println("Enter Password of length 3 t0 8 character & Alpha-Numeric: ");
        String pass=sc.next();
        System.out.println("Enter EmailId containing @ : ");
        String email=sc.next();
        System.out.println("Enter Mobile Number start with 6,7,8,9 & with 10 digits: ");
        String mobile=sc.next();

        if(validateCredentials(username, pass, email, mobile)){
            Customer customer=new Customer(username,pass,email,mobile);
            System.out.println("Email--> "+customer.getEmail());
            System.out.println("Mobile no.-->  "+customer.getMobileNumber());
            System.out.println("UserName-->  "+customer.getUsername());
            System.out.println("Password-->  "+customer.getPassword());
        }
        else{
            System.out.println("Wrong credentials entered");
        }
    }

    private static boolean validateCredentials(String username, String pass, String email, String mobile) {
        Pattern usernamePattern = Pattern.compile("^[a-zA-z]{3,8}$");
        Pattern passPattern = Pattern.compile("^[0-9a-zA-z]{3,8}$");
        Pattern mobilePattern = Pattern.compile("^[6-9]{1}[0-9]{9}$");
        Pattern emailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        return usernamePattern.matcher(username).matches() && passPattern.matcher(pass).matches()
                && mobilePattern.matcher(mobile).matches() && emailPattern.matcher(email).matches();
    }
}