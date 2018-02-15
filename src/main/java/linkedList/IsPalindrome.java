package linkedList;

public class IsPalindrome {

	/**
	 * Given a singly linked list, determine if it is a palindrome.
	 * 
	 * Big O = O(N/2) + O(N/2) + O(N/2) = O(N) + O(N/2) = O(N)
	 */
	public boolean isPalindrome(ListNode head) {
			
		//if list is empty or size 1, its a palindrome
		if(head == null || head.next == null) {
			return true;
		}
		
		ListNode fastIterator = head; 
		ListNode middleNode = head;
		
		//fastIterator will iterate head twice as fast while middleNode iterates normal speed so it reaches middle node
		while(fastIterator != null && fastIterator.next != null) {
			fastIterator = fastIterator.next.next;
			middleNode = middleNode.next;
		}
		
		ListNode reversedList = reverseHalfList(middleNode);
		
		while(head != middleNode && reversedList != null) {
			if(head.val != reversedList.val) {
				return false;
			}
			head = head.next;
			reversedList = reversedList.next;
		}
		return true;
	}

	//reverse the half list
	private ListNode reverseHalfList(ListNode head) {
		ListNode reversed = null;
		
		while(head != null) {
			ListNode temp = head.next;
			head.next = reversed;
			reversed = head;
			head = temp;
		}
		return reversed;
	}
}

