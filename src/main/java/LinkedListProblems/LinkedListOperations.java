package LinkedListProblems;

public class LinkedListOperations {

	/*
	 * Add node to tail
	 */
	public Node addToTail(Node head, int d) {

		Node newNode = new Node(d);

		if (head == null) {
			return newNode;
		}

		while (head.next != null) {
			head = head.next;
		}
		head.next = newNode;

		return head;
	}

	/*
	 * Add node to head of linked list
	 */
	public Node addToHead(Node head, int d) {
		Node newNode = new Node(d);

		if (head == null) {
			return newNode;
		} else {
			newNode.next = head;
		}

		return newNode;
	}

	/*
	 * Method to remove head
	 */

	public Node removeHead(Node head) {

		if (head == null || head.next == null) {
			return null;
		} else {
			return head.next;
		}
	}

	/*
	 * Method to remove tail
	 */

	public Node removeTail(Node head) {

		// go to element where its next node's next node is null (2nd to last
		// node)
		while (head.next.next != null) {
			head = head.next;
		}

		head.next = null;
		return head;
	}

	/*
	 * Method to remove a specific node from linked list
	 */

	public Node removeNode(Node head, int d) {

		// if head is node we want to delete, make 2nd node the head
		if (head.data == d) {
			return head.next;
		}

		while (head.next != null) {

			if (head.data == d) {
				head.next = head.next.next;
				return head;
			}
			head = head.next;
		}
		return head;
	}

	/*
	 * Insert node at specific position
	 */

	public Node insertNode(Node head, int d, int position) {

		Node newNode = new Node(d);

		if (head == null || head.next == null) {
			return newNode;
		}

		Node temp = null;

		if (position == 1) {
			temp = head.next;
			head.next = newNode;
			newNode.next = temp;
			return head;
		}

		for (int i = 0; i < position - 1; i++) {
			head = head.next;
			temp = head.next;
		}

		head.next = newNode;
		newNode.next = temp;
		return head;
	}

	/*
	 * Method to print linked list
	 */
	public void printLinkedList(Node head) {

		System.out.print(head.data);

		while (head.next != null) {
			System.out.print("," + head.next.data);
			head = head.next;
		}
	}

	/*
	 * Method to print linked list in reverse
	 */

	public void printLinkedListReverse(Node head) {

		if (head == null) {
			return;
		}

		printLinkedListReverse(head.next);
		System.out.print(head.data + " ");
	}

	/*
	 * Method to reverse linked list
	 */

	
	public Node reverseList(Node head) {
		Node prev = null;
		while (head != null) {
			Node temp = head.next;
			head.next = prev;
			prev = head;
			head = temp;
		}
		return prev;
	}
	
}
