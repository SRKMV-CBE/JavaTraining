public class Factorial
{
	public static void main (String...args)
	{
			int r=10;
			int factorial=1;
			for (int p=1;p<=r;p++)
		{
			factorial =factorial*p;
		}
		System.out.println("The given Number is " +r);
		System.out.println("The Factorial is" +factorial);
	}
}
