package algorithm.linkedlist.problems;

import algorithm.linkedlist.list.LinkedList;
import algorithm.linkedlist.list.Node;

public class ReverseLinkedlist {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(1);
		list.insert(2);
		list.insert(3);
//		list.insert(4);
		list.printList();
		System.out.println();
		Node newRoot = reverseRecursively(list.getHead());
		list.setHead(newRoot);
		list.printList();	
	}
	
    private static Node reverseRecursively(Node node){        
        if(node ==  null || node.getNext() == null) {
            return node;
        }
    	Node newHead = reverseRecursively(node.getNext());
     
        node.getNext().setNext(node);
        node.setNext(null);    
        return newHead;
     }

}
