/*In This Java Program We Are First Given An Input Like String And Find The Length Of The Given String*/
import java.util.*;
class LenthOfGivenString
{
	public static void main(String args[])
	{
		int count=0;
		System.out.println("Enter The Input:");
		Scanner input = new Scanner(System.in);
		String v=input.nextLine();
		char n[] =v.toCharArray();
		System.out.println("The String is : "+v);
		for(int i=0;i<n.length;i++)
		{
			count++;
		}
		System.out.println("The Length Of The String is : "+count);
	}
}
