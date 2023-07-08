class CmdLineBooleanValueLogicalAND{
	public static void main(String args[]){
		String str=args[0];
		String str2=args[1];
		boolean g=Boolean.parseBoolean(str);
		boolean h=Boolean.parseBoolean(str2);
		boolean i=g&&h;
		System.out.println("The Value OF G In Boolean : "+g);
		System.out.println("The Value OF H In Boolean : "+h);
		System.out.println("The Value OF G&&H In Boolean : "+i);
	}
}
