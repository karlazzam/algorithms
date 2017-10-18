package stringManipulation;

import java.util.*;
/**
 * Check if string has all unique characters
 * @author karlazzam
 *
 */
public class UniqueStringCheck {
	

	/**
	 * Checks to see if character is added to set, if false then string is not unique
	 */
	

	public boolean isUnique(String s) {
		
		int length = s.length();

		if(length > 128 || length == 0) {  //ASCII length is 256 so can't have unique string is character length > 128
			return false;
		}
		else if(length == 1) {
			return true;
		}

		Set<Character> charSet = new HashSet<Character>();

		boolean isNotDuplicate = true;

		for(int i = 0; i < length; i++) {
			isNotDuplicate = charSet.add(s.charAt(i));

			if(!isNotDuplicate) { //if character is a duplicate, then return false
				return false;
			}
		}

		return true;
	}

}
