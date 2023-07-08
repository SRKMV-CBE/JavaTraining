import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter The Given String Is Palindrome Or Not : ");
		String s=input.nextLine();
		int c=1;
		char[] n=s.toCharArray();
		for(int i=0;i<n.length;i++){
			for(int j=n.length-1;j>=0;j--){
				if(n[i]==n[j])
					c=1;
				else
					c=0;
			} 	
		}
	if(c==0){
		System.out.println("It Is Not A Palindrome");
	}
	else{
		System.out.println("It Is A Palindrome...");
		}
	}
}
