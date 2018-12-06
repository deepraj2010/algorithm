package algorithm.tree.problems;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class MirrorTree {
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(20);
		tree.insert(12);
		tree.insert(24);
		tree.insert(24);
		tree.insert(53);
		tree.insert(12);
		tree.insert(11);
		tree.insert(-2);
		tree.insert(9);
		tree.insert(3);
		tree.inorder();
		System.out.println();
		System.out.println(IfTreeIsBST.isBst(tree.getRoot()));
		Node newTree = mirrorTree(tree.getRoot());
		tree.setRoot(newTree);
		tree.inorder();
	}
	
	public static Node mirrorTree(Node root) {
		
		if(root == null || (root.getLeft() == null && root.getRight() ==null)) {
			return root;
		}
		
		Node left = mirrorTree(root.getLeft());
		Node right = mirrorTree(root.getRight());
		root.setLeft(right);
		root.setRight(left);
		return root;
	}

}
