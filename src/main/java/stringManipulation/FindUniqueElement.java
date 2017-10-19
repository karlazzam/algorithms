package stringManipulation;

import java.util.*;

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
		
		if(arr.length == 1) {
			return arr[0];
		}
		else if(arr.length == 0) {
			return 0;
		}
			
		int result = 0;
		
		for(Integer element : arr) {
			
			result ^= element;
		}
	
		return result; 
	}
	
	
	/**
	 * Find unique element in array where there is no unbounded number of duplicates for a given element
	 * 
	 * To do in O(n), need to use two hash sets:
	 * one that adds all the keys to the set (key set)
	 * one that will end up having the unique key (result set)
	 * 
	 * Then you check if the key set contains the key: O(1) operation
	 * if so you remove it from result set
	 * else you add it to both sets
	 * 
	 
	 */
	
	public int uniqueElementSolutionThree(int[] arr) {
		
		if(arr.length == 1) {
			return arr[0];
		}
		else if(arr.length == 0) {
			return 0;
		}
		
		Set<Integer> keySet = new HashSet<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>();
		
		for(Integer key : arr) {
			
			if(keySet.contains(key)) {
				resultSet.remove(key); //remove key from result set if duplicate
			}
			else {
				//add key to both sets if first time encountering this key
				keySet.add(key); 
				resultSet.add(key);
			}
		}

		//result set will only have the unique key left, so return the unique key
		if(resultSet.size() == 1) {
			return resultSet.iterator().next(); 
		}
		else {
			return 0; //no unique element found
		}
		
	}
	

}
