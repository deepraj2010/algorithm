package algorithm.miscellenious;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class CreateBSTFromSortedArray {

	public static void main(String[] args) {
		int array[] = {0,1,2,3,4,5,6,7,8,9,10};
		Tree tree = new Tree();
		Node node = arrayToBST(array, 0, array.length-1);
		tree.setRoot(node);
		tree.inorder();
		System.out.println();
		System.out.println("Height: "+tree.getHeight());
	}
	
	
	private static Node arrayToBST(int[] array, int start, int end) {
		if(start > end) {
			return null;
		}

		int mid = (start+end)/2;
		Node node = new Node(array[mid]);
		
		node.setLeft(arrayToBST(array, start, mid-1));
		node.setRight(arrayToBST(array, mid+1, end));
		return node;
	}

}
