package algorithm.linkedlist.problems;

import algorithm.linkedlist.list.LinkList;
import algorithm.linkedlist.list.Node;

public class AddOneToLinkedlist {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.printList();
		System.out.println();

		Node node = oneThird(list.getHead());
		System.out.print(node.getData());

	}
	
	public static int addOne(Node node) {
		if(node == null)
			return 1;

		int nodeData = node.getData() + addOne(node.getNext());
		if(nodeData >=10)
			node.setData(nodeData%10);
		else
			node.setData(nodeData);
		return nodeData/10;
	}
	
	
	public static Node oneThird(Node node) {
		Node slow = null;
		Node fast = node;
		
		while (fast != null && fast.getNext()!= null && fast.getNext().getNext()!= null) {
			if(slow == null) {
				slow = fast;
				fast = fast.getNext().getNext();
			} else {
				fast = fast.getNext().getNext().getNext();
				if(fast != null)
					slow = slow.getNext();
			}
		}
		return slow;
	}
}
