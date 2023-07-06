public class CommandLineArgAdd
{
	public static void main(String[] args)
	{
		System.out.println("COmmandLineArgTest");
		int argsLength = args.length;
		System.out.println("Args Length : " + argsLength);
		
		if(argsLength > 0)
		{		
			/* First argument */
			String s1 = args[0];
			String s2 = args[1];
			System.out.println("S1 : " + s1 + ", S2 : " + s2);

			int n1 = Integer.parseInt(s1);
			int n2 = Integer.parseInt(s2);
			System.out.println("N1 : " + n1 + ", N2 : " + n2);

			int sum = n1 + n2;
			System.out.println("Sum : " + sum);
		}
	}
}
