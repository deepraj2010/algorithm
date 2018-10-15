package algorithm.linkedlist.problems;

import algorithm.linkedlist.list.LinkedList;
import algorithm.linkedlist.list.Node;

public class AddOneToLinkedlist {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.insert(4);
		list.insert(8);
		list.insert(5);
		list.insert(9);
		list.printList();
		System.out.println();
		int carry = addOne(list.getHead());
		if(carry != 0) {
			Node node = new Node(carry);
			node.setNext(list.getHead());
			list.setHead(node);
		}
		list.printList();
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
}
