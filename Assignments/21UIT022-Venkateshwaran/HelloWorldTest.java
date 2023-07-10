import java.util.*;
class HelloWorldTest
{
  public static void main (String args[])
  { 
	  System.out.println("Enter Your Name:");
	  Scanner input = new Scanner(System.in);
	  String user = input.nextLine();
	  System.out.println("Your Name Is:"+user);
  }
}
