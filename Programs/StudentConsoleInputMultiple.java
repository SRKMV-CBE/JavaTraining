import java.util.Scanner;

public class StudentConsoleInputMultiple
{
	public String name;
	public int age;
	
	public static void main(String... args)
	{
		Scanner input = new Scanner(System.in);
	
		//int[] ageArray = new int[10];

		int size = 3;

		/* Creating an Array of Student objects, with the size of 10 */
		Student[] studentArray = new Student[size];
	
		for(int i=0; i < size; i++)
		{
			Student s1 = new Student();
			System.out.println("Enter Student's name : " );
			s1.name = input.nextLine();

			System.out.println("Enter Student's Age : " );
			s1.age = input.nextInt();

			System.out.println("Student Name :  " + s1.name);
			System.out.println("Student Age :  " + s1.age);
			
			studentArray[i] = s1;
		}

		System.out.println("Student Array  Length : " + studentArray.length);
	}
}
