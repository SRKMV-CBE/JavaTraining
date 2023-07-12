import java.util.*;
public class Decimal2BOH1
{
	public static void main(String args[])
	{
	 System.out.println("Enter Any Decimal Number:");
	 Scanner input = new Scanner(System.in);
	 int n =input.nextInt();
	 int rem;
	 int dec=n;
	 String bin="";
	 System.out.println("Enter the Base Vaule you Went To Converted Like 2,8,16");
	 Scanner d = new Scanner(System.in);
	 basevalue=d.nextInt();
	 switch(basevalue)
	 {
		case 2:
		while(n>0)
		{
			rem=n%2;
			bin=rem+bin;
			n=n/2;
		}
		System.out.println("The Given Decimal Number"+" "+dec+" "+"Converted into Binary Number of Is:"+bin);
		break;
		case 8:
		while(n>0)
		{
			rem=n%8;
			bin=rem+bin;
			n=n/8;
		}
		System.out.println("The Given Decimal Number"+" "+dec+" "+"Converted into Octal Number of Is:"+bin);
		break;
		case 16:	
		while(n>0)
		{
			rem=n%16;
			bin=rem+bin;
			n=n/16;
		}
		System.out.println("The Given Decimal Number"+" "+dec+" "+"Converted into Hexadecimal Number of Is:"+bin);
		break;
		default:
		System.out.println("Please Enter the Correct Base value You went?");
	 }
	} 
}
