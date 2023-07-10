import java.util.*;
public class PrimeNumber
{
	public static void main (String args[])
	{
		System.out.println("Enter the Number:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=2;i<=n;i++)
		{
				if(n%i==0)
				{
					System.out.println("The Given Number"+" "+n+" "+"is Not  an Prime Number");
					break;
			    }
				else
				{
					System.out.println("The Given Number"+" "+n+" "+"is an Prime Number");
					break;
				}
		}
		
	}
}

