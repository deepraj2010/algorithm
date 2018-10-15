package algorithm.tree.problems;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import algorithm.tree.Node;
import algorithm.tree.Tree;

public class VerticalOrderTraversal {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.insert(10);
		tree.insert(5);
		tree.insert(12);
		tree.insert(17);
		tree.insert(7);
		tree.insert(2);
		tree.inorder();
		System.out.println();
		Map<Integer, List<Integer>> map = verticalTraversal(tree.getRoot(), 0, new HashMap<Integer, List<Integer>>());
		System.out.print(map);
	}
	
	
	public static Map<Integer, List<Integer>> verticalTraversal(Node node, int width, Map<Integer, List<Integer>> map){
		if(node == null) {
			return map;
		}
		List<Integer> list = map.get(width);
		if(list == null) {
			list = new LinkedList<Integer>();
			list.add(node.getData());
			map.put(width, list);
		} else {
			list.add(node.getData());
		}
		verticalTraversal(node.getLeft(), width - 1, map);
		verticalTraversal(node.getRight(), width + 1, map);
		return map;
	}

}
