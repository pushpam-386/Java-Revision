import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the 2 numbers: ");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(a+" "+b);
//        System.out.println(a%b);
        try {
            float r=a/b;
            System.out.println("The quotient of "+"a/b"+"="+Math.round(r));
        }catch (ArithmeticException arithmeticException){
            System.out.println("DivideByZeroException caught");
        }finally {
            System.out.println("Inside finally block");
        }
    }
}