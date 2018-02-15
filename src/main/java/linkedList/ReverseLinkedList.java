package linkedList;

public class ReverseLinkedList {
	/**
	 * O(n) solution, traverse list iteratively and build a new list that is reversed
	 */
	public ListNode reverseList(ListNode head) {	
	
		ListNode reversed = null;
		while (head != null) {
			ListNode next = head.next; //temp head, points to next node
			head.next = reversed;
			reversed = head; 
			head = next;  //head becomes next node to start next iteration
		}
		return reversed;
	}
}
