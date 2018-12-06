package algorithm.linkedlist.problems;


import algorithm.linkedlist.list.LinkList;
import algorithm.linkedlist.list.Node;

public class FindKthNodeFromEnd {
	
	public static void main(String args[]) {
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
		list.insert(10);
		list.printList();
		Node node = getKthNodeFromEnd(list.getHead(), 2);
		System.out.print(node.getData());
	}
	
	private static Node getKthNodeFromEnd(Node head, int k) {
		return null;
	}

}
