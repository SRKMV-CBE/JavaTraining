public class Factorial
{
	public static void main (String...args)
	{
		System.out.println("Factorial Program");
			int n=5;
			int fact=1;
			for (int i=1;i<=n;i++)
		{
			fact =fact*i;
		}
		System.out.println("The given Number is " +n);
		System.out.println("The Factorial is" +fact);
	}
}
