class  StringToDiffDataType{
	
	public static int StrToInt(String str,String str2){
		int a=Integer.parseInt(str);
		int b=Integer.parseInt(str2);
		int c=a+b;
		System.out.println("The Value OF A In Integer : "+a);
		System.out.println("The Value OF B In Integer : "+b);
		System.out.println("The Value OF A+B In integer : "+c);
		return c;
	}
	
	public static float StrToFloat(String str,String str2){
		float d=Float.parseFloat(str);
		float e=Float.parseFloat(str2);
		float f=d+e;
		System.out.println("The Value OF A In Float : "+d);
		System.out.println("The Value OF B In Float : "+e);
		System.out.println("The Value OF A+B In Float : "+f);
		return f;
	}
	
	public static long StrToLong(String str,String str2){
		long h=Long.parseLong(str);
		long i=Long.parseLong(str2);
		long j=h+i;
		System.out.println("The Value OF A In Long : "+h);
		System.out.println("The Value OF A In Long : "+i);
		System.out.println("The Value OF A+B In Long : "+j);
		return j;
	}
	
	public static double StrToDouble(String str,String str2){
		double o=Double.parseDouble(str);
		double p=Double.parseDouble(str2);
		double q=o+p;
		System.out.println("The Value OF A In double : "+o);
		System.out.println("The Value OF A In double : "+p);
		System.out.println("The Value OF A+B In double : "+q);
		return q;
	}
	
	public static boolean StrToBoolean(String y,String z){
		boolean k=Boolean.parseBoolean(y);
		boolean n=Boolean.parseBoolean(z);
		boolean m=k&&n;
		System.out.println("The Value OF G In Boolean : "+k);
		System.out.println("The Value OF H In Boolean : "+n);
		System.out.println("The Value OF G&&H In Boolean : "+m);
		return m;		
	}
	
	public static void main(String args[]){
		String str="100";
		String str2="200";
		String str3=str+str2;
		
		System.out.println("The Value OF A In String : "+str);
		System.out.println("The Value OF B In String : "+str2);
		System.out.println("The Value OF A+B In String : "+str3);		
		
		StringToDiffDataType.StrToInt(str,str2);
		StringToDiffDataType.StrToLong(str,str2);
		StringToDiffDataType.StrToDouble(str,str2);
		StringToDiffDataType.StrToFloat(str,str2);
		String y="true";
		String z="true";
		StringToDiffDataType.StrToBoolean(y,z);
		
	}
}
