package algorithm.tree.problems;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class IfTreeIsBST {

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
	}
	
    public static boolean isBst(Node root)  { 
    	return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isBSTUtil(Node node, int min, int max) { 
    	
        if (node == null) 
            return true; 
  
        if (node.getData() < min || node.getData() > max) 
            return false; 
  
        return (isBSTUtil(node.getLeft(), min, node.getData()) && 
                isBSTUtil(node.getRight(), node.getData()+1, max)); 
    } 
}
