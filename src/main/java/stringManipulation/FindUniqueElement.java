package stringManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindUniqueElement {
	
	/**
	 * Find unique element in array where every element is duplicated except 1
	 */

	
	public int uniqueElementSolutionOne(int[] arr) {
		
		
		if(arr.length == 1) {
			return arr[0];
		}
		else if(arr.length == 0) {
			return 0;
		}
				
		Set<Integer> set = new HashSet<Integer>();
		
		boolean addedElement = true;
		
		for(Integer element : arr) {
			
			addedElement = set.add(element);
						
			if(!addedElement) { //if element was duplicate (not added to set), remove it
				set.remove(element);
			}	
		}
		
		if(set.size() == 0) { //if set size is 0,there is no unique element
			return 0;
		}
				
		return set.iterator().next(); //return only number left in set (distinct element)
	}
	
	/*
	 *  XOR of itself = 0 ex: 3 ^ 3 = 0
	 *  
	 *  XOR of element ^ 0 = element  ex: 3 ^ 0 = 3
	 *  
	 *  so if array = [1, 2, 2, 1, 3]
	 *  
	 *  then result = 1 ^ 2 ^ 2 ^ 1 ^ 3 = (1 ^ 1) ^ (2 ^ 2) ^ 3 = 0 ^ 0 ^ 3 = 3
	 */
	
	public int uniqueElementSolutionTwo(int[] arr) {
		
		int result = 0;
		
		for(Integer element : arr) {
			
			result ^= element;
			
		}
	
		return result; 
	}

}
