public class DecimalToBinary
        {
     public static void main(String[] args)
                {
                        System.out.println("The decimal no of 9 ");
 int num=9,add=0,r;
  while(num>0)
     {
          r = num%8;
          add = add * 10 + r;
           num = num/8;
     }
System.out.println("The octal number of num 9 :" +add);
                }
        }

