package algorithm.tree;

public class Tree {
	
	private Node root;
	
    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else {
            if (data <= node.getData())
                node.setLeft(insert(node.getLeft(), data));
            else
                node.setRight(insert(node.getRight(), data));
        }
        return node;
    }
    
    public int getHeight() {
    	return getHeight(root, 0);
    }
        
    private int getHeight(Node node, int height) {
        if (node == null)
            return height;
        return 1+Math.max(getHeight(node.getLeft(), height), getHeight(node.getRight(), height));
    }
    
    public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public void delete(int k) {
        if (isEmpty())
            System.out.println("Tree Empty");
        else if (search(k) == false)
            System.out.println("Sorry "+ k +" is not present");
        else {
            root = delete(root, k);
            System.out.println(k+ " deleted from the tree");
        }
    }
    
    private Node delete(Node root, int k) {
        Node p, p2, n;
        if (root.getData() == k) {
            Node leftNode, rightNode;
            leftNode = root.getLeft();
            rightNode = root.getRight();
            if (leftNode == null && rightNode == null)
                return null;
            else if (leftNode == null) {
                p = rightNode;
                return p;
            }
            else if (rightNode == null) {
                p = leftNode;
                return p;
            }
            else {
                p2 = rightNode;
                p = rightNode;
                while (p.getLeft() != null)
                    p = p.getLeft();
                p.setLeft(leftNode);
                return p2;
            }
        }
        if (k < root.getData()) {
            n = delete(root.getLeft(), k);
            root.setLeft(n);
        }
        else {
            n = delete(root.getRight(), k);
            root.setRight(n);             
        }
        return root;
    }
    
    public int countNodes() {
        return countNodes(root);
    }
    
    private int countNodes(Node r) {
        if (r == null)
            return 0;
        else {
            int l = 1;
            l += countNodes(r.getLeft());
            l += countNodes(r.getRight());
            return l;
        }
    }
    
    public boolean search(int val) {
        return search(root, val);
    }
    
    public boolean isEmpty() {
        return root == null;
    }

    private boolean search(Node r, int val) {
        boolean found = false;
        while ((r != null) && !found)
        {
            int rval = r.getData();
            if (val < rval)
                r = r.getLeft();
            else if (val > rval)
                r = r.getRight();
            else
            {
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    
    public void inorder() {
        inorder(root);
    }
    
    private void inorder(Node root) {
        if (root != null)
        {
            inorder(root.getLeft());
            System.out.print(root.getData() +" ");
            inorder(root.getRight());
        }
    }
    
    public void preorder() {
        preorder(root);
    }
    
    private void preorder(Node r) {
        if (r != null) {
            System.out.print(r.getData() +" ");
            preorder(r.getLeft());             
            preorder(r.getRight());
        }
    }
   
    public void postorder() {
        postorder(root);
    }
    
    private void postorder(Node root) {
        if (root != null) {
            postorder(root.getLeft());             
            postorder(root.getRight());
            System.out.print(root.getData() +" ");
        }
    }
    
    public int height() {
    	return height(root);
    }
    
	private int height(Node root) {
		if(root == null) {
			return 0;
		}
		if(root.getLeft() == null && root.getRight() == null) {
			return 1;
		}
		return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
	}

}
