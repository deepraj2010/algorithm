package algorithm.linkedlist.problems;

import algorithm.linkedlist.list.LinkList;
import algorithm.linkedlist.list.Node;

public class AddOneToLinkedlist {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		
		list.insert(1);
		list.insert(0);
		list.insert(0);
		list.insert(0);
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
