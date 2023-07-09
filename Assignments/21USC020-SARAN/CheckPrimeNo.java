public class CheckPrimeNo
{
	public static void main(String... args)
	{
		System.out.println("CheckPrime Program");
		

		int n = 10;

		
		boolean Prime = true;
		
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				System.out.println("Number [" + n + "] is divisible by : " + i);
				Prime = false;

			break;
			}
		}
		
		System.out.println("Input number : " + n);
		System.out.println("is Prime " +Prime);		
	}
}
