import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String... args)
	{
		int i=1,num=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The Number :");
		
		int n=scanner.nextInt();
		
		while(i<=n)
		{
			if(n%i==0)
			num=num+1;
			i=i+1;
		}
		if(num==2)
		{
			System.out.println("It Is Prime Number");
		}
		else
		{
			System.out.println("It Is Not Prime Number");
		}
	}
}
