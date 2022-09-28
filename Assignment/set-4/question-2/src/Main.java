import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int N=scanner.nextInt();
        for(int i=0;i<N;i++){
            System.out.println("Enter isbn no. :  ");
            int isbn=scanner.nextInt();
            System.out.println("Enter book name:  ");
            String name=scanner.nextLine();
            System.out.println("Enter author name:");
            String author=scanner.nextLine();

            List list= library.viewBooksByAuthor(author);
            if(list==null) {
                System.out.println("The list is empty");
            }
        }




    }
}