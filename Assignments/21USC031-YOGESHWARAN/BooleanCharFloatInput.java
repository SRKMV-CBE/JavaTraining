import java.util.Scanner;
public class BooleanCharFloatInput
{
	public static void main(String... args)
	{
		Scanner scanner=new Scanner(System.in);

			System.out.println("Enter The Boolean Value(True/False) :");
			boolean booleanValue=scanner.nextBoolean();
	
			System.out.println("Enter The Char Value :");
			char charValue=scanner.next().charAt(0);

			System.out.println("Enter The Float Value :");
			float floatValue=scanner.nextFloat();
			{
				System.out.println("Boolean Value :"+booleanValue);
                                System.out.println("Char Value :"+charValue);
				System.out.println("Float Value :"+floatValue);
			}
	}
}
