import java.util.Scanner;

public class ConsoleInputDemo
{
	public static void main(String... args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your name : ");
		String name = input.nextLine();

		System.out.println("Enter your age : ");
		String ageStr = input.nextLine();
		int age = Integer.parseInt(ageStr);
		
		System.out.println("Name : " + name);
		System.out.println("Age  : " + ageStr);
		System.out.println("Age (Number) : " + age);
		
		System.out.println("Enter your age again : ");
		int ageInt = input.nextInt();
		System.out.println("Age (Int) : " + ageInt);
	}
}
