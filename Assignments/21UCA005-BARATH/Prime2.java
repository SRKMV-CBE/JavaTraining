//Prime number to print numbers from 1 to 30//
import java.util.*;
public class Prime2
{
	public static void main(String args[])
	{
		int i,j;
        System.out.println("Prime Number Are:");
		for(i=2;i<30;i++)
		{
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
				  System.out.print("");
				  break;
				}
            }
			if(j==i)
			{
			  
              System.out.println(+j);
			}
		}
		
	}
}
