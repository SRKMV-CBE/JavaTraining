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
