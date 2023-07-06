public class CommandLineArgTest
{
	public static void main(String[] args)
	{
		System.out.println("COmmandLineArgTest");
		int argsLength = args.length;
		System.out.println("Args Length : " + argsLength);
		
		if(argsLength > 0)
		{
			String firstArg = args[0];
			System.out.println("First Arg : " + firstArg);		
		
			String lastArg = args[argsLength-1];
			System.out.println("Last Arg : " + lastArg);
		}
	}
}
