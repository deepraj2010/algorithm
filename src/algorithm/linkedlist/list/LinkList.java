package algorithm.linkedlist.list;

public class LinkList {
	
	private Node head;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		} else {
			Node current = head;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(node);
		}
	}
	
	public void printList() {
		Node current = head;
		while(current != null) {
			System.out.print(current.getData() + " ");
			current = current.getNext();
		}
	}

}
