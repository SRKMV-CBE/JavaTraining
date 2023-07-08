<<<<<<< HEAD
Class DecimaltoBinary
	{
     		public static void main(String[] args)
		{
 		int n=8,remainder;
		 System.out.println("enter the decimal numi");
  while(n>0)
     {
          remainder = n%2;
          add = add * 10 + remainder;
           n = n/2;
     }
  System.out.println("The binary number is %d" ,add);
		}
	}
=======
public class DecimaltoBinary
        {
     public static void main(String[] args)
                {
                        System.out.println("The decimal no of 9 ");
 int n=9,add=0,r;
  while(n>0)
     {
          r = n%2;
          add = add * 10 + r;
           n = n/2;
     }
System.out.println("The binary number of num 9 :" +add);
                }
        }

>>>>>>> db4332f3d15e2d704eaa752e1dea7e14635af09c
