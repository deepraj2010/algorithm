package algorithm.tree;

public class BinarySearchTree {
    public static void main(String[] args) {
    	Tree tree = new Tree();
    	tree.insert(10);
    	tree.insert(5);
    	tree.insert(15);
    	tree.insert(13);
    	tree.insert(8);
    	tree.insert(3);
    	tree.insert(12);
    	tree.insert(11);
    	tree.inorder();
    	System.out.print("Height:" + tree.height());
   }
}