public class StringPalindromeCheck
{
	public static void main(String... args)
	{
		System.out.println("StringPalindromeCheck");
		
		// Madam, Malayalam
		String s1 = "Madam";
		System.out.println("Input String : [ " + s1 + "]");
		
		boolean isPalindrome = false;
		
		String reversedString = new StringBuilder(s1).reverse().toString();
		System.out.println("Reverse String : [" + reversedString + "]");
		
		if(s1.equalsIgnoreCase(reversedString)) {
			System.out.println("Input String is a Palindrome!");
		} else {
			System.out.println("Input String is NOT a Palindrome!");
		}
	}
}