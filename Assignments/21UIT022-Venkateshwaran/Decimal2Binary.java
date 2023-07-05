import java.util.Scanner;

public class Decimal2Binary
{
	public static void main(String arg[])
	{
		System.out.println("Enter Any Decimal Number:");
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		int rem;
		int dec=n;
		String bin="";
		while(n>0)
		{
			rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
		System.out.println("The Given Decimal Number"+" "+dec+" "+"Converted into Binary Number of Is:"+bin);
	}
}

