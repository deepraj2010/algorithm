package algorithm.linkedlist.problems;

import algorithm.linkedlist.list.LinkList;
import algorithm.linkedlist.list.Node;

/**
 * 
 * @author deep
 *
 */

/*
 
Given a singly linked list, rearrange it in a way that all odd position nodes are together and all even positions node are together,

Input: You have to complete the method which takes one argument: the head of the linked list. You should not read any input from stdin/console.. 
Note: There are multiple test cases, for each test case, this method will be called individually.

Output:  
Your function should return pointer to head of the modified list.

Constraints:
1 <=T<= 50
1 <=N<= 100
1 <=value<= 1000

Example:
Input:
2
4
1 2 3 4
5
1 2 3 4 5

Output:
1 3 2 4
1 3 5 2 4
 
 */
public class RearrangeLinkedList {

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
		list.insert(10);
		list.insert(11);
		list.printList();
		System.out.println();
		rearrange(list.getHead());
		list.printList();
	}
	
	public static void rearrange(Node head) {
		if(head != null && head.getNext() != null) {
			Node current = head;
			Node start = head.getNext();
			Node end = start;
		
			while(end != null && end.getNext() != null) {
				current.setNext(end.getNext());
				end.setNext(end.getNext().getNext());
				current = current.getNext();
				current.setNext(start);
				end = end.getNext();
			}
		}
	}
}
