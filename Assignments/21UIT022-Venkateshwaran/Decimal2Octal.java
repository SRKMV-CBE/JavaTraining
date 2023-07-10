import java.util.Scanner;

public class Decimal2Octal
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
			rem=n%8;
			bin=rem+bin;
			n=n/8;
		}
		System.out.println("The Given Decimal Number"+" "+dec+" "+"Converted into Octal Number of Is:"+bin);
	}
}

