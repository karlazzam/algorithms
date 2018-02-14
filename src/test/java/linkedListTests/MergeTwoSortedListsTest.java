package linkedListTests;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import linkedList.ListNode;
import linkedList.MergeTwoSortedLists;


public class MergeTwoSortedListsTest {
	
	@Test
	public void testReversedList() {
		MergeTwoSortedLists list =  new MergeTwoSortedLists();
		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(1);
		populateLinkedLists(a, b);
		
		ListNode expectedList = new ListNode(1);
		expectedList = populateExpectedList(expectedList);

		ListNode mergedList = list.mergeTwoLists(a, b);
		boolean result = HelperMethods.compareLists(expectedList, mergedList);
		assertEquals(true, result);
	}
	
	
	private void populateLinkedLists(ListNode a, ListNode b) {
		List<Integer> aVals= new ArrayList<Integer>();
		aVals.add(2);		
		aVals.add(4);
		aVals.add(5);
		a = HelperMethods.createList(aVals, a);
		
		List<Integer> bVals= new ArrayList<Integer>();
		bVals.add(2);		
		bVals.add(3);
		bVals.add(4);
		bVals.add(7);
		b = HelperMethods.createList(bVals, b);
	}
	
	private ListNode populateExpectedList(ListNode list) {
		List<Integer> vals = new ArrayList<Integer>();
		vals.add(1);
		vals.add(2);
		vals.add(2);		
		vals.add(3);
		vals.add(4);
		vals.add(4);
		vals.add(5);
		vals.add(7);
		return HelperMethods.createList(vals, list);
	}
}
