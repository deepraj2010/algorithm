package algorithm.tree.problems;

import java.util.HashMap;
import java.util.Map;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class LeftRightViewOfTree {

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
		System.out.println(leftViewTree(tree.getRoot()));
		System.out.println(rightViewTree(tree.getRoot()));

	}
	
	public static Map<Integer, Node> leftViewTree(Node root) {
		Map<Integer, Node> map = new HashMap<>();
		int level = 0;
		leftViewTreeHelper(root, level, map);
		return map;
	}

	public static void leftViewTreeHelper(Node root, int level, Map<Integer, Node> map) {
		if(root == null) {
			return;
		}
		if(!map.containsKey(level)) {
			map.put(level, root);
		}
		leftViewTreeHelper(root.getLeft(), level+1, map);
		leftViewTreeHelper(root.getRight(), level+1, map);
	}
	
	public static Map<Integer, Node> rightViewTree(Node root) {
		Map<Integer, Node> map = new HashMap<>();
		int level = 0;
		rightViewTreeHelper(root, level, map);
		return map;
	}

	public static void rightViewTreeHelper(Node root, int level, Map<Integer, Node> map) {
		if(root == null) {
			return;
		}
		if(!map.containsKey(level)) {
			map.put(level, root);
		}
		rightViewTreeHelper(root.getRight(), level+1, map);
		rightViewTreeHelper(root.getLeft(), level+1, map);
	}


}
