package tree;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nodeList = new ArrayList<Integer>();
		nodeList.add(2);
		nodeList.add(2);

		
		List<String> position = new ArrayList<String>();
		position.add("left-left");
		position.add("left-left");


		TreeNode root = new TreeNode(1);
		
		System.out.println(populateTree(nodeList, position, root));
	}

	public static TreeNode populateTree(List<Integer> nodeList, List<String> position, TreeNode root) {

		if (nodeList.size() == 0) {
			return root;
		} else {
			TreeNode newNode = new TreeNode(nodeList.get(0));
			TreeNode temp = root;

			if (position.get(0).equals("left-left")) { // left branch, leftmost
														// mode
				while (root.left != null) {
					root = root.left;
				}
				root.left = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);
			} else if (position.get(0).equals("left-right")) { // left branch,
																// rightmost
																// node
				while (root.left != null) {
					root = root.left;
				}
				root.right = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);

			} else if (position.get(0).equals("right-right")) { // right branch,
																// rightmost
																// node
				while (root.right != null) {
					root = root.right;
				}
				root.right = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);

			} else if (position.get(0).equals("right-left")) { // right branch,
																// leftmost node
				while (root.right != null) {
					root = root.right;
				}
				root.left = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);
			}

		}
		return root;
	}

}
