package javaDailyChallenge20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SingleInArray_4of20 {

	public static void main(String[] args) {

		int num [] = {4, 1, 2, 1, 2};

		SingleInArray_4of20 obj = new SingleInArray_4of20();
		int output = obj.singleInNumArray(num);
		System.out.println(output);

	}

	// {1,2,2,3,3,4,4}  // {1,1,2,2,4,4, 4, 5 ,5 ,6, 7, 7}

	public int singleInNumArray(int num []) {

		Arrays.sort(num);
		int value = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<num.length; i++) {
			
			map.put(num[i], map.getOrDefault(num[i], 0)+1);
		}			
		
		for(Entry<Integer, Integer> entry: map.entrySet()) {
			if(entry.getValue()==1) {
				value = entry.getKey();
			}
		}
		
		return value;
		
	}

}
