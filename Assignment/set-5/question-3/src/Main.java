public class Main {

    public static void changeArray(Object[] l){
        for(Object o: l){
            if(o instanceof Student){
                System.out.println(((Student) o).getMarks()+10);
            } else if (o instanceof Employee) {
                System.out.println(((Employee) o).getSalary()+10000);
            } else if (o instanceof String) {
                Main m=new Main();
                m.reverse(o.toString());

            } else if (o instanceof Integer) {
                System.out.println(((Integer) o).byteValue()+20);
            }
        }
    }

    public void reverse(String S){
        String bag="";
        for (int i=S.length()-1;i>=0;i--){
            bag+=S.charAt(i);
        }
        System.out.println(bag);
    }
    public static void main(String[] args) {
        Object l[] = {new Student(23, "rakesh", 450),
                new Employee(12, "Lokesh", 84000),"String",50};
        changeArray(l);

    }
}