package stringManipulation;

import java.util.HashMap;
import java.util.Map;

public class PermutationCheck {

	/**
	 * Given two strings, write a method to decide if one is a permutation of the other.
	 * Example: s1 = abc, s2 = bca would = true
	 * 
	 * Estimated worst case O(2*N) = O(N). Average case is O(N + N/2) = O(N)
	 */
	public boolean isPermutation(String s1, String s2) {
		
		//if the strings aren't the same length, its impossible for them to be permutations of each other
		if(s1.length() != s2.length()) {
			return false;
		}
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		//loop through both strings and update count of each character in both strings. O(N)
		for(int i = 0; i < s1.length(); i++) {
			char s1Char = s1.charAt(i);
			char s2Char = s2.charAt(i);
			
			if(charCount.containsKey(s1Char)) {
				charCount.put(s1Char, charCount.get(s1Char) + 1 );
			}
			else {
				charCount.put(s1Char, 1);
			}
			
			if(charCount.containsKey(s2Char)) {
				charCount.put(s2Char, charCount.get(s2Char) + 1 );
			}
			else {
				charCount.put(s2Char, 1);
			}
		}
		
		//Loop through hashmap, worst case O(N)
		for (Integer count : charCount.values()) {
		    //Check if count is odd, if odd means strings are not permutation of each other
			if(count % 2 != 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. 
	 * In other words, one of the first string's permutations is the substring of the second string.
	 */
	public  boolean isPermutation2(String s1, String s2) {
		return false;
	}
}
