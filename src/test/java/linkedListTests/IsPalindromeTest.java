package linkedListTests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import linkedList.IsPalindrome;
import linkedList.ListNode;

public class IsPalindromeTest {
	
	@Test
	public void testIsPalimdrome() {
		IsPalindrome isPalimdrome = new IsPalindrome();
		ListNode list = new ListNode(-129);
		list = populateExpectedList(list);
		
		ListNode temp = list;
		boolean result = isPalimdrome.isPalindrome(temp);
		assertEquals(true, result);
	}

	
	private ListNode populateExpectedList(ListNode list) {
		List<Integer> vals = new ArrayList<Integer>();
		vals.add(9);
		vals.add(6);		
		vals.add(6);		
		vals.add(9);		
		vals.add(-129);
		return HelperMethods.createList(vals, list);
	}
}
