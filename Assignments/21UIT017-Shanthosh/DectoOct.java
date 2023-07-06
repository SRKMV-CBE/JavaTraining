public class DectoOct
        {
     public static void main(String[] args)
                {
                        System.out.println("The decimal no of 9 ");
 int n=9,add=0,r;
  while(n>0)
     {
          r = n%8;
          add = add * 10 + r;
           n = n/8;
     }
System.out.println("The octal number of num 9 :" +add);
                }
       }
