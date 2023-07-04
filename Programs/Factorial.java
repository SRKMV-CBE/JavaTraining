public class Factorial
{
	public static void main(String... args)
	{
		System.out.println("Factorial Program");
		
		int n = 5;
		int fact = 1;
		
		for(int i=1; i<=n; i++)
		{
			/* Longer Pattern : fact = fact * i;  */
			/* Shorter Pattern : fact *= i;  */				
			fact *= i;
		}
		
		System.out.println("Input number : " + n);
		System.out.println("Factorial : " + fact);
	}
}