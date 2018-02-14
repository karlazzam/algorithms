package linkedList;

public class DeleteNode {

	/**
	 * Write a function to delete a node (except the tail) in a singly linked
	 * list, given only access to that node.
	 * 
	 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third
	 * node with value 3, the linked list should become 1 -> 2 -> 4 after
	 * calling your function.
	 */

	
	/**
	 * The trick is you're replacing the value of the node you want to delete with the node it's pointing to, 
	 * then skipping over the node whose value you're replacing
	 */
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
