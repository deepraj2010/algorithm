package algorithm.linkedlist.problems;

import algorithm.linkedlist.list.LinkList;
import algorithm.linkedlist.list.Node;

public class MergeLinkedList {
	
	public static void main(String args[]) {
		LinkList firstList = new LinkList();
		firstList.insert(2);
		firstList.insert(6);
		firstList.insert(8);
		firstList.insert(10);
		firstList.insert(12);
		firstList.insert(14);
		firstList.insert(16);
		firstList.insert(18);
		firstList.printList();
		System.out.println();
		
		LinkList secondList = new LinkList();
		secondList.insert(1);
		secondList.insert(3);
		secondList.insert(5);
		secondList.insert(7);
		secondList.insert(9);
		secondList.insert(19);
		secondList.insert(21);
		secondList.insert(23);
		secondList.insert(25);
		secondList.insert(27);
		secondList.printList();
		System.out.println();
		
	//	Node nodeNormal = merge(firstList.getHead(), secondList.getHead());
		Node nodeRecursive = recursiveMerge(firstList.getHead(), secondList.getHead());
	//	firstList.setHead(nodeNormal);
	//	firstList.printList();
	//	System.out.println();
		firstList.setHead(nodeRecursive);
		firstList.printList();
		System.out.println();	
	}
	
	public static Node merge(Node firstList, Node secondList) {
		Node primaryList, secondaryList, firstHead;
		if(firstList == null) {
			return secondList;
		}
		if(secondList == null) {
			return firstList;
		}
		if(firstList.getData() >= secondList.getData()) {
			primaryList = secondList;
			secondaryList = firstList;
		} else {
			primaryList = firstList;
			secondaryList = secondList;
		}
		firstHead = primaryList;
  		while(secondaryList != null && primaryList!= null) {
			while(primaryList.getNext()!= null && primaryList.getNext().getData() <= secondaryList.getData()) {
				primaryList = primaryList.getNext();
			}
			Node temp = primaryList.getNext();
			primaryList.setNext(secondaryList);
			secondaryList = secondaryList.getNext();
			primaryList = primaryList.getNext();
			primaryList.setNext(temp);
		}
		return firstHead;
	}
	
	public static Node recursiveMerge(Node first, Node second) {
		if(first == null) {
			return second;
		}
		if(second == null) {
			return first;
		}
		if(first.getData() < second.getData()) {
			first.setNext(recursiveMerge(first.getNext(), second));
			return first;
		} else {
			second.setNext(recursiveMerge(first, second.getNext()));
			return second;
		}
	}
}
