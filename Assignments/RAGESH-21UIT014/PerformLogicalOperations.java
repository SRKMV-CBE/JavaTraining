//Java Program to perform logical operation
import java.util.*;
public class PerformLogicalOperations 
{
  public static void main(String[] args) 
  {
      //Create instance of the Scanner Class
      Scanner s=new Scanner(System.in);
       while(true)
        {
            System.out.println("");
            
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 1 for && ");
            System.out.println("Choose 2 for || ");
            System.out.println("Choose 3 for ! ");
            System.out.println("Choose 4 for EXIT");
           
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.println("Enter the two numbers to perform operations ");
                    System.out.print("Enter the first number : ");
                    int x = s.nextInt();
                    System.out.print("Enter the second number : ");
                    int y = s.nextInt();
                    System.out.print("Enter the third number : ");
                    int z = s.nextInt();
                    System.out.println("Result of ("+x+" > "+y+") && ("+z+" > "+x+")");
                    System.out.println((x > y) && (z > x));  
                     System.out.println("Result of ("+x+" > "+y+") && ("+z+" < "+x+")");
                    System.out.println((x > y) && (z < x));  
                    break;
 
                case 2:
                    System.out.println("Enter the two numbers to perform operations ");
                    System.out.print("Enter the first number : ");
                    int p = s.nextInt();
                    System.out.print("Enter the second number : ");
                    int q = s.nextInt();
                    System.out.print("Enter the third number : ");
                    int r = s.nextInt();
                    System.out.println("Result of ("+q+" < "+p+") || ("+r+" > "+p+")");
                    System.out.println((q < p) || (r > q));  
                    System.out.println("Result of ("+q+" > "+p+") || ("+r+" < "+p+")");
                    System.out.println((q > p) || (r < q));  
                    System.out.println("Result of ("+q+" < "+p+") || ("+r+" < "+p+")");
                    System.out.println((q < p) || (r < q));  
                    break;
 
                case 3:
                    System.out.println("Enter the two numbers to perform operations ");
                    System.out.print("Enter the first number : ");
                    int a = s.nextInt();
                    System.out.print("Enter the second number : ");
                    int b = s.nextInt();
                    System.out.println("Result of (!"+a+" == "+b+")");
                    System.out.println(!(a == b)); 
                     System.out.println("Result of (!"+a+" > "+b+")");
                    System.out.println(!(a > b));  
                    break;
 
                case 4:
                    System.exit(0);
            }
        }
  }
}
