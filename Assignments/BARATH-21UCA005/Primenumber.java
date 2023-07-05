/* java program to find prime numbers */
import java.util.Scanner;
public class Primenumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter the number to check:");
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
            System.out.println("number"  +"\t"+ num +"\t" +" is a prime number");
		  }
		 else
		 {
			 	System.out.println("number"  +"\t"+ num +"\t"+ " is not a prime number");
		 }
}
}
