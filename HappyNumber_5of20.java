package javaDailyChallenge20;

public class HappyNumber_5of20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1- Get first digit number and multiply by itself
		 *2- Get second digit number and multiply by itself
		 *3- Keep doing this until all the digits are covered
		 *4- Sum of all the digits to get a new number
		 *5- Repeate these steps for the new number to get further new number
		 *6- Keep repeating to check if it reaches to number '1', then it is a happy number
		 * 
		 * 13
		 * (3*3) + (1*1) = 9+1 = 10
		 * (0*0) + (1*1) = 0+1 = 1
		 * 
		 * 12
		 * (2*2) + (1*1) = 4+1 = 5
		 * (5*5)               = 25
		 * (5*5) + (2*2) =25+4 = 29
		 * (9*9) + (2*2) =81+4 = 85
		 * (5*5) + (8*8) =25+64 = 89
		 * (9*9) + (8*8) = 81+64=145
		 * (1*1) + (4*4) + (5*5) = 1+16+25 = 42
		 * (2*2) + (4*4) = 4+16 = 20
		 * (0*0) + (2*2) = 0+4 = 4       
		 */
		
		int num = 12;
		int result = num;
		
		while(result != 1 && result !=4) {
			result = checkHappyNumber(result);
		}
		
		if(result==1) {
			System.out.println(num + "  is a Happy Number");
		}
		else {
			System.out.println(num + "  is NOT a happy Number, instead a SAD-NUMBER");
		}

		
    }  
		
		
	
	
	public static int checkHappyNumber(int num) {
		int rem, sum = 0;
		
		while(num>0) {
			rem = num%10;
			sum = sum + (rem*rem);
			num = num/10;
		}
System.out.println(sum);
		return sum;

	}
	
		
	
	
	
	
	

}
