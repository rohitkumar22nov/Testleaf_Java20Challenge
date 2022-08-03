package javaDailyChallenge20;

public class LengthOfLastWordOfString1of20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfLastWordOfString1of20 obj = new LengthOfLastWordOfString1of20();
		
		
		int length = obj.lengthofLastWord("To activate the sms service give missed call at 9089878765");
		System.out.println(length);
		
	}
	
	
	public int lengthofLastWord(String s) {
		
		 String stringArray [] = s.split(" ");
		 String lastWord = stringArray[stringArray.length-1];
		 char charArray [] = lastWord.toCharArray();
		 int lengthOfLastWord = charArray.length;
		 
		 return lengthOfLastWord;
		 
		
	}
	
	

}
