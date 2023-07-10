import java.util.Scanner;

public class Decimal2Hex
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
			rem=n%16;
			bin=rem+bin;
			n=n/16;
		}
		System.out.println("The Given Decimal Number"+" "+dec+" "+"Converted into Hexadecimal Number of Is:"+bin);
	}
	
}

