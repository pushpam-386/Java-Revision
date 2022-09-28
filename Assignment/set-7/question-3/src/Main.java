import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(7,"pushpam",30,40,50));
        studentList.add(new Student(4,"vick",60,50,30));
        studentList.add(new Student(5,"vick",50,80,90));
        studentList.add(new Student(9,"rick",80,90,40));

        Collections.sort(studentList,new SortByName());

        Collections.sort(studentList,new Comparatorss());
        for (Student student:studentList) {
            System.out.println(student.getRollNo()+"---"+student.getName());
        }
    }
}