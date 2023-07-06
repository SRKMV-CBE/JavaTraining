public class CheckPrime
{
	public static void main(String... args)
	{
		System.out.println("CheckPrime Program");
		
		/* Quick Reference of Prime Numbers : 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 */
		int n = 11;
		n=12;
		
		boolean isPrime = true;
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.println("Number [" + n + "] is divisible by : " + i);
				isPrime = false;
				/* Uncomment this line and observe the change in the Output */
				break;
			}
		}
		
		System.out.println("Input number : " + n);
		System.out.println("isPrime ? " + isPrime);		
	}
}
