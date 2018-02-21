package stringManipulation;

public class ReverseString {
	
	public String reverseStr(String s) {
		if(s == null) {
			return null;
		}
		
		if(s.length() == 0) {
			return "";
		}
		
		if(s.length() == 1) {
			return s;
		}
		
		StringBuilder reverse = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			reverse.append(s.charAt(i));
		}
		
		return reverse.toString();		
	}

}
