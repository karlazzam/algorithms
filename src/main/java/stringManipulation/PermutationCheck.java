package stringManipulation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PermutationCheck {
	
	public static void main(String[] args) {
		
		
		isPermutation2("pqzhi", "ghrqpihzybre");
	}

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
			
			charCount.put(s1Char, charCount.getOrDefault(s1Char, 0) + 1);		
			charCount.put(s2Char, charCount.getOrDefault(s2Char, 0) + 1);		
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
	 * 
	 *  Estimated worst case O(2*N) = O(N). Average case is O(2*N) = O(N)
	 */
	public static boolean isPermutation2(String s1, String s2) {
		
		if(s1.length() > s2.length()) {
			return false;
		}
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		
		
		//go through substring and save character count for each character in substring O(N)
		for(int i = 0; i < s1.length(); i++) {
			char s1Char = s1.charAt(i);
			charCount.put(s1Char, charCount.getOrDefault(s1Char, 0) + 1);		
		}
						
		int possibleSubstringLen = 0;
		int backToBackChars = 0; //back to back of the same character
		
		Set<Character> subStringChars = new HashSet<Character>();
		Map<Character, Integer> subStringDupes = new HashMap<Character, Integer>();

		
		//go through full string and check if substring exists inside full string, O(N)
		for(int j = 0; j < s2.length(); j++) { 
			char s2Char = s2.charAt(j);
	
			if(charCount.containsKey(s2Char)) {
				if(charCount.get(s2Char) > 1) {
					subStringDupes.put(s2Char, subStringDupes.getOrDefault(s2Char, 0) + 1);	
					
					if(subStringDupes.get(s2Char) > subStringDupes.get(s2Char)) {
						possibleSubstringLen = 0;
						subStringChars = new HashSet<Character>();
						subStringDupes = new HashMap<Character, Integer>();
					}
					else {
						possibleSubstringLen++;
					}
				}
				else { 
					if(subStringChars.add(s2Char)) {
						possibleSubstringLen++;
					}
					else {
						backToBackChars++;
					
						if(possibleSubstringLen + 1 != s1.length() || backToBackChars > 1) {
							possibleSubstringLen = 0;
							backToBackChars = 0;
							subStringChars = new HashSet<Character>();
							subStringDupes = new HashMap<Character, Integer>();
						}
					}
				}
			}
			else {
				possibleSubstringLen= 0;
				subStringChars = new HashSet<Character>();
				subStringDupes = new HashMap<Character, Integer>();
			}
			
			if(possibleSubstringLen == s1.length()) {
				return true;
			}
		}
		return false;
	}
}
