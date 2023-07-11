/*Factorial program First off is the normal method Second off Method is out of box thinking*/
import java.util.*;
class FactorialOutOfBox
{
 public static void main(String args[])
 {
	 // First off
	/* System.out.println("Enter The Factorial Number:");
	 int fact=1;
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 for(int i=1;i<=n;i++)
	 {
		 fact*=i;
	 }
	 System.out.println("The Factorial Of Given Number is :"+fact);
	 */
	 // Second off
	 System.out.println("Enter The Factorial Number:");
	 Scanner in = new Scanner(System.in);
	 int n = in.nextInt();
	 int fact=1;
	 int i;
	 for(i=n;i!=0;i--)
	 {
		fact*=i; //fact=fact*i;
	 }
	 System.out.println("The Factorial Of Given Number"+" "+n+" "+"is:"+fact);
 }
}
