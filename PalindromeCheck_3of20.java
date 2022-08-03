package javaDailyChallenge20;

public class PalindromeCheck_3of20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*First remove all the gaps from the String and convert to lowercase
		 * Covert the string into an char array
		 * reverse the String
		 * compare the initial gap removed String to the reversed string
		 * if equals then Palindrome else Not		 * 
		 */

		PalindromeCheck_3of20 obj = new PalindromeCheck_3of20();
		boolean outcome = obj.isPalindrome("A man, a plan, a canal: Panama ");
		System.out.println(outcome);

	}
	
	
	public boolean isPalindrome(String s) {
		
		String reversed = "";
		boolean result = true;
		String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().strip();
		char [] charArray = str.toCharArray();
		
		for(int i= charArray.length-1; i>=0; i--) {
			
			 reversed = reversed + charArray[i];
		}
		
		if(str.equals(reversed)) {
			System.out.println("Is Palindrome");
			 result = true;
		}
		else { result = false;}
		System.out.println("str : " + str);
		System.out.println("reversed  :" + reversed);
		return result;
	}
	
	

}
