package algorithm.linkedlist.problems;

public class OwnAddOne {

	public static void main(String[] args) {
		Node head = new Node(8);
		head.next = new Node(0);
		head.next.next = new Node(9);
		Node current = head;
		while(current != null) {
			System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
		Node newNode = addOne(head);
		current = newNode;
		while(current != null) {
			System.out.print(current.data);
			current = current.next;
		}
	}
	
	public static Node addOne(Node head) {
	    int carry = carry(head);
	    if(carry == 0) {
	        return head;
	    }
	    Node node = new Node(carry);
	    node.next = head;
	    return node;
    }
    
    public static int carry(Node node) {
		if(node == null) {
			return 1;
		}
		int nodeData = node.data + carry(node.next);
		if(nodeData >=10) {
			node.data = nodeData%10;
			return nodeData/10;
		} else {
			node.data = nodeData;
			return 0;
		}
	}
}

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
	}
}
