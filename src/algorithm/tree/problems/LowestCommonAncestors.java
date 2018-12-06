package algorithm.tree.problems;

import java.util.Stack;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class LowestCommonAncestors {

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
		path(tree.getRoot(), new Node(-2));
		System.out.println();
		path(tree.getRoot(), new Node(53));
	}
	
/*	public static Node lowestCommonAncestor(Node root, Node node1, Node node2) {
		
	}
*/	
	
	public static void path(Node root, Node node) {
		Stack<Node> pathNode = new Stack<>();
		path(root, node, pathNode);
	}
	
	private static void path(Node root, Node node, Stack<Node> pathStack) {
		if(root == null) {
			return;
		}
		pathStack.push(root);
		if(root.getData() == node.getData()) {
			printPath(pathStack);
		}
		path(root.getLeft(), node, pathStack);
		path(root.getRight(), node, pathStack);
	}
	
	private static void printPath(Stack<Node> pathArray) {
		for(int i = 0 ; i < pathArray.size(); i++) {
			System.out.print(pathArray.get(i).getData() + " ");
		}
		System.out.println();
	}
	

}
