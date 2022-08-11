package javaDailyChallenge20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class MajorityNumInArray_6of20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.*/

		/*
		 * Put the array into a map
		 * Get the key and their respective values
		 * Value greater then n/2 would be the output
		 */

		int num [] = {2,2,1,1,1,2,2};		
		
     int output =    majorityNumInArray(num);
     System.out.println("The Majority element in the given array is : " + output);

	}


	public static int majorityNumInArray(int [] num) {
		
		Integer output=0;
		int length = num.length;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for(int i =0; i<length; i++) {

			if(map.containsKey(num[i])) {
				map.put(num[i], map.get(num[i]).intValue()+1);
			}
			else {
				map.put(num[i], 1);
			}
		}

		System.out.println(map);
		System.out.println("Length is :" + length);
		for(Entry<Integer, Integer> entry: map.entrySet()) {

			if(entry.getValue()> length/2) {
				output = entry.getKey();
			}

		}
		
		return output;
	}

}


