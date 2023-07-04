public class CheckAndListPrime
{
	public static void main(String... args)
	{
		System.out.println("CheckPrime Program");
		
		/* Quick Reference of Prime Numbers : 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 */
		boolean isPrime = true;
		
		int[] primeNumbersArray = new int[15];
		int primeNumCounter = 0;
		
		for(int j=1; j <=30; j++)
		{
			isPrime = true;
			
			for(int i=2; i<=j/2; i++)
			{
				if(j%i==0)
				{
					//System.out.println("Number [" + j + "] is divisible by : " + i);
					isPrime = false;
					/* Uncomment this line and observe the change in the Output */
					break;
				}
			}
			
			if(isPrime) {
				primeNumbersArray[primeNumCounter++] = j;
			}
			
			System.out.print("Input number : " + j);
			System.out.println(". isPrime ? " + isPrime);
		}
		
		System.out.println("Prime Numbers between 1 and 30");
		System.out.println("------------------------------");
		
		for(int i = 0; i < primeNumbersArray.length; i++)
		{
			System.out.print("[" + primeNumbersArray[i] + "] ");
		}
		
		System.out.println("");
		
		System.out.println("------------------------------");
		System.out.println("Prime Numbers between 1 and 30");
		System.out.println("------------------------------");
		
		for(int i = 0; i < primeNumCounter; i++)
		{
			System.out.print("[" + primeNumbersArray[i] + "] ");
		}
	}
}