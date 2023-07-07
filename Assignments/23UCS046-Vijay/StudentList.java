import java.util.*;

public class StudentList{

        public String Name;
        public int Age;



public static void main(String... args){

        Scanner s = new Scanner(System.in);

        StudentList s1 = new StudentList();

        System.out.print("Enter Name: ");

        s1.Name = s.nextLine();

        System.out.print("Enter Age: ");
        s1.Age = s.nextInt();

        System.out.println("Name: " + s1.Name);
        System.out.println("Age: " + s1.Age);
}

}
