/* java program to find prime numbers */
import java.util.Scanner;
public class Prime
{
	public static void main(String[] args)
	{
		System.out.println("Enter the Number:");
		Scanner s =new Scanner(System.in);
		int num =s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
              count++;
			}
		}
          if(count==2)
		  {
          System.out.println("Number"  +"\t"+ num +"\t" +" is a prime number");
		  }
		 else
		 {
System.out.println("Number"  +"\t"+ num +"\t"+ " is not a prime number");
		 }
}
}
