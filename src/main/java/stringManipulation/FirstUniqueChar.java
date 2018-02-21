package stringManipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public int firstUniqChar(String s) {
       	
    	if(s == null || s.length() == 0) {
    		return -1;
    	}   	
    	if(s.length() == 1) {
    		return 0;
    	}
    	
    	Map<Character, Integer> iteratorMap = new LinkedHashMap<Character, Integer>();
    	Map<Character, Integer> uniqueMap = new LinkedHashMap<Character, Integer>();

    	for(int i = 0; i < s.length(); i++) {
    		
    		if(iteratorMap.containsKey(s.charAt(i))) {
    			//remove from unique map
    			if(uniqueMap.containsKey(s.charAt(i))) {
        			uniqueMap.remove(s.charAt(i));
    			}
    		}
    		else {
    			iteratorMap.put(s.charAt(i), i);
    			uniqueMap.put(s.charAt(i), i);
    		}    		
    	}
    	
    	
    	if(!uniqueMap.isEmpty()) {
    		Character firstKey = uniqueMap.keySet().iterator().next();
        	return uniqueMap.get(firstKey);
    	}
    	else {
    		return -1;
    	}
    }
	
	
}
