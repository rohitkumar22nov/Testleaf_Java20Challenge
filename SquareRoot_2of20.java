package javaDailyChallenge20;

public class SquareRoot_2of20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Square Root of a given number
		 * start an initial number 1 and go till the given number range
		 * Keep multiplying the initial number series with itself, until the product equals the given number
		 * Once it is equal, that is square root		 * 
		 */

		SquareRoot_2of20 sr = new SquareRoot_2of20();
		int result = sr.squareRoot(1215);
		System.out.println(result);
		
	}
	
	
	//25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49
	//0   1  2  3  4  5  6  7 
	
	public int squareRoot(int num) {
		
		int i =2;
		
		for( i=1; i<num; i++) {
			
			int product = i*i;
			
			if(product == num) {
				break;
			}
			else if(product >num) {
				--i;
				break;
			}
					
		
		}
		
		return i;
						
	}
	
//	public int squareRoot (int num) {
//		int i=2;
//		
//		while (i<num) {
//			int result = num%(i;
//			
//			if(result == 0) {
//				System.out.println("square root is: " + i);
//				break;
//			}
//			i++;
//		}
//			return i;
//	}
}
