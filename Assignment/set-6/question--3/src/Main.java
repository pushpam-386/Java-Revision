import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String =>");
        String str=sc.nextLine();
        System.out.println("Enter the Position =>");
        int i=sc.nextInt();
        again(str,i,sc);
    }

    private static void again(String str, int i,Scanner sc) {
        try {
            if (str.length()>i){
                System.out.println("Character at the position "+i+" => "+str.charAt(i));
            }
            else {
                System.out.println("Invalid position, Please enter a valid position =>");
                i=sc.nextInt();
                again(str,i,sc);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Out of range");
        }
    }
}