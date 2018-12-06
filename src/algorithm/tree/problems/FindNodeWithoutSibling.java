package algorithm.tree.problems;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class FindNodeWithoutSibling {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
		tree.insert(17);
		tree.insert(7);
		tree.insert(9);
		printWithoutSibling(tree.getRoot());
	}
	
	private static void printWithoutSibling(Node root) {
		if(root == null) {
			return;
		}
		if(root.getLeft() != null && root.getRight() == null) {
			System.out.print(root.getLeft().getData() + " ");
		}
		if(root.getRight() != null && root.getLeft() == null) {
			System.out.print(root.getRight().getData() + " ");
		}
		printWithoutSibling(root.getLeft());
		printWithoutSibling(root.getRight());
	}

}
