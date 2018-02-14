package linkedListTests;

import java.util.Arrays;
import java.util.List;

import linkedList.ListNode;

public class HelperMethods {
	

	/**
	 * Helper method to compare 2 lists, used in linked list tests to compare if two lists are equal
	 */
	public static boolean compareLists(ListNode a, ListNode b) {
		
		//if a or b is null, not both, then one list is shorter than other so return null
		if(a == null ^ b == null) {
			return false;
		}
		
		//if a and b are both null, then we reached tail's pointer so a.val was always b.val throughout both lists which means they're equal
		if(a == null && b == null) {
			return true;
		}
		
		//if a and b have different values, return false
		if(a.val != b.val) {
			return false;
		}
		
		//keep going if reach tail's pointer which is null, then return true, else return false
		return compareLists(a.next, b.next);
	}
	
	
	/**
	 * Adds list of nodes to tail of head
	 * @param nodeList the list of nodes to add to the head
	 * @param head the head of the list, has to be initialized
	 * @return the new list each iteration until it adds all the nodes to head
	 */

	public static ListNode createList(List<Integer> nodeList, ListNode head) {

		if (nodeList.size() == 0) {
			return head;
		} else {
			ListNode newNode = new ListNode(nodeList.get(0));
			ListNode temp = head;
			nodeList.remove(nodeList.get(0));
			
			while ((head.next != null)) {
		           head = head.next;
		    }
			
			head.next = newNode;
			return createList(nodeList, temp);
		}
	}
}
