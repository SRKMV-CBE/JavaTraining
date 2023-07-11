import java.util.Scanner;
public class Students
{

	String name;
	int age;

	public static void main(String... args)
	{
	 Scanner scan=new Scanner(System.in);
	 Students s1=new Students();
         
	 System.out.println("Enter Student Name :");
         s1.name=scan.nextLine();
	 System.out.println("Enter Student Age :");
	 s1.age=scan.nextInt();
	 {
		 System.out.println("Student Name :"+s1.name);
		 System.out.println("Student Age :"+s1.age);
	 }
		
	}
}
