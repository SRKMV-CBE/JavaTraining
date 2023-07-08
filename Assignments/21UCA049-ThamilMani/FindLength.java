class FindLength{
	public static void main(String args[]){
		String s="Nantha Kumar";
		char[] n=s.toCharArray();	//Without String Length() To Calc.The Length Of String By Using toCharArray()
		int count=0;
		System.out.println("The String is : "+s);
		for(int i=0;i<n.length;i++){
			count++;
		}
		System.out.println("The Length Of The String is : "+count);
	}
}
