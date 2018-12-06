package algorithm.tree.problems;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class DepthOfTree {

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
		System.out.println(tree.getHeight());
		System.out.print(depthOfTree(tree.getRoot()));
	}
	
	public static int depthOfTree(Node root) {
		return depth(root, 0);
	}
	
	private static int depth(Node root, int depth) {
		if(root == null) {
			return depth;
		}
		return Math.max(depth(root.getLeft(), depth+1), depth(root.getRight(), depth+1));
	}
	

}
