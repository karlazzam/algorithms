package linkedListTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import linkedList.ListNode;
import linkedList.ReverseLinkedList;

public class ReversedLinkedListTest {

	@Test
	public void testReversedList() {
		ReverseLinkedList list =  new ReverseLinkedList();
		
		ListNode head = new ListNode(1);
		ListNode reverse = new ListNode(5);
		populateLinkedLists(head, reverse);
		
		ListNode reversedList = list.reverseList(head);
		boolean result = HelperMethods.compareLists(reverse, reversedList);
		assertEquals(true, result);
	}
	
	private void populateLinkedLists(ListNode head, ListNode reverse) {
		List<Integer> headVals= new ArrayList<Integer>();
		headVals.add(2);		
		headVals.add(3);
		headVals.add(4);
		headVals.add(5);
		head = HelperMethods.createList(headVals, head);
		
		List<Integer> reverseVals= new ArrayList<Integer>();
		reverseVals.add(4);		
		reverseVals.add(3);
		reverseVals.add(2);
		reverseVals.add(1);
		reverse = HelperMethods.createList(reverseVals, reverse);
	}
}
