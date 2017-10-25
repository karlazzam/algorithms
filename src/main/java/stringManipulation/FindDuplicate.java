package stringManipulation;

import java.util.*;

public class FindDuplicate {
	
	public int findDuplicate(int[] arr) {
		
		if(arr.length == 1) {
			return 0;
		}
		
		Set<Integer> nonDuplicates = new HashSet<Integer>();
		
		for(Integer num : arr) {
			if(!nonDuplicates.add(num)) {
				return num;
			}
		}
		return 0;
	}
}
