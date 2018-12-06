package algorithm.tree.problems;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class PrintRootToLeafPath {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(4);
		tree.insert(15);
		tree.insert(16);
		tree.insert(17);
		tree.insert(7);
		tree.insert(9);
		printRootToLeafPath(tree.getRoot(), new int[100], 0);
	}
	
	private static void printRootToLeafPath(Node root, int[] pathArray, int pathLen) {
		if(root == null) {
			return ;
		}
		pathArray[pathLen] = root.getData();
		pathLen++;
		if(root.getLeft() == null && root.getRight() == null) {
			print(pathArray, pathLen);
		} else {
			printRootToLeafPath(root.getLeft(), pathArray, pathLen);
			printRootToLeafPath(root.getRight(), pathArray, pathLen);
		}
	}
	
	private static void print(int[] array, int len) {
		for(int i = 0 ; i < len; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
