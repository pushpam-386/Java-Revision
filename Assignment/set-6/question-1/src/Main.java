import java.lang.reflect.Array;

public class Main {
    public static void changeArray(Object[] A){
        for (Object o:A) {
            if(o instanceof Student){
                System.out.println("Student ["+"Roll="+((Student) o).getRoll()+", Name="+((Student) o).getName()+", Marks="+(((Student) o).getMarks()+10)+" ]");
//                System.out.println(((Student) o).getMarks()+10);
            }
            else if(o instanceof Employee){
                System.out.println("Student ["+"Employee="+((Employee) o).getId()+", Name="+((Employee) o).getName()+", Salary="+(((Employee) o).getSalary()+10000)+" ]");
            }
            else if(o instanceof String){
                String reverse= reverse(o.toString());
                System.out.println(reverse);
            }
            else if (o instanceof Integer){
                System.out.println(((Integer) o).intValue()+20);
            }

        }
    }

    private static String reverse(String str) {
        String bag="";
        for (int i=str.length()-1;i>=0;i--){
            bag+=str.charAt(i);
        }
        return bag;
    }

    public static void main(String[] args) {
        Object[] A={new Student(23,"Rakesh",450),new Employee(12,"Lokesh",84000),"String",50};

        changeArray(A);

    }
}