package algorithm.tree;

public class AVLTree {
	
	Tree tree = new Tree();
	
	private int calculateTreeHeight(Node currentNode) {
	    return tree.height();
	}
	
	private Node leftRotation(Node currentNode) {

	    System.out.println("Beginning left rotation ... on node: " + currentNode.getData());

	    Node newRootNode = currentNode.getRight();
	    Node leftChildOfRight = newRootNode.getLeft();

	    // Step 1. set the left child of the new root node
	    newRootNode.setLeft(currentNode);

	    // Step 2. set the right child of the new left child
	    currentNode.setRight(leftChildOfRight);

	    // Step 3. Update the height of the trees that were updated.
	    newRootNode.setHeight(calculateTreeHeight(newRootNode));
	    currentNode.setHeight(calculateTreeHeight(currentNode));

	    return newRootNode;
	}

}
