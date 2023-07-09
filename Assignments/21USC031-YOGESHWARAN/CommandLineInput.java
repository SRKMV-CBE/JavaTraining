public class CommandLineInput
{
	public static void main(String... args)
	{
		String name=args[0];
		System.out.println("Enter Student Name :"+name);
		
		int age=Integer.parseInt(args[1]);
		System.out.println("Enter Student Age :"+age);
	}	

}
