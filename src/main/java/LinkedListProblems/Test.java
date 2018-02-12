package LinkedListProblems;

public class Test {

	public static void main(String[] args) {
		
		LinkedListOperations list = new LinkedListOperations();
		//Create head node with value of 8
		Node head = new Node(8);
		
		//Add 5 and make it the head
		head = list.addToHead(head, 5);
		
		//Add 4 to tail
		list.addToTail(head, 4);
		
		//remove head
		head = list.removeHead(head);
		
		//remove tail
		list.removeTail(head);
	
		//Add a bunch of more nodes
		list.addToTail(head, 2);
		list.addToTail(head, 4);
		list.addToTail(head, 5);
		list.addToTail(head, 6);
		
		//Remove node with value 8
		head = list.removeNode(head, 8);


		//Insert node with value 3 in 2nd position
		list.insertNode(head, 3, 1);
	
		
		//print linked list
		list.printLinkedList(head);
		
		System.out.println("");
	
		//print linked list backwards
		list.printLinkedListReverse(head);
		
		System.out.println("\nreverse list: ");
		head = list.reverseList(head);
		list.printLinkedList(head);


	}
}
