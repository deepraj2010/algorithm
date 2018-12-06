package algorithm.linkedlist.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import algorithm.linkedlist.list.Node;

public class DublicatesInSortedList {

	public static void main(String[] args) {

	}
	
	public static List<Node> duplicates(Node head) {
		Node current = head;
		Set<Integer> set = new HashSet<Integer>();
		while(current!= null) {
			if(set.contains(current.getData())) {
				
			}
		}
		return null;
	}
}
