public class DataTypeConversion
{
	public static void main(String... args)
	{
		System.out.println("DataTypeConversion");	

		String s = "24";
		int n = Integer.parseInt(s);
		System.out.println("Number in String : " + s);
		System.out.println("Number Converted to Integer : " + n);
	}
}