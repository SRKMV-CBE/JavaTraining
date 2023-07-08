import java.util.Scanner;

public class StudentConsoleInput
{
	public String name;
	public int age;
	
	public static void main(String... args)
	{
		Scanner input = new Scanner(System.in);
	
		Student s1 = new Student();
		/*s1.name =  "Yogesh";
		s1.age = 19;*/

		System.out.print("Enter Student's name : " );
		/*String  nameArg = input.nextLine();
		s1.name = nameArg;*/
		s1.name = input.nextLine();

		System.out.print("Enter Student's Age : " );
		/*int ageArg = input.nextInt();
		s1.age = ageArg; */
		s1.age = input.nextInt();

		System.out.println("Student Name :  " + s1.name);
		System.out.println("Student Age :  " + s1.age);
	}
}
