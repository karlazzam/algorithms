package treeTests;

import java.util.Arrays;
import java.util.List;

import linkedList.ListNode;
import tree.TreeNode;

public class HelperMethods {
	

	/**
	 * Helper method to compare 2 binary trees, used in tree tests to compare if two trees are equal
	 * This assumes if both trees have the same depth and same values for all child nodes, then they are equal
	 * Also assumes since values for each node is an int, values can't be null
	 */
	public static boolean compareTrees(TreeNode a, TreeNode b) {
		
		//if a or b is null, then one of the trees doesn't have the same depth as the other
		if(a == null ^ b == null) {
			return false;
		}
		
		//if a ==b, then they are both null which means we reached the end of the tree
		if(a == b) {
			return true;
		}
		
		//if a and b have different values return false
		if(a.val != b.val) {
			return false;
		}
		
		//compare right and left children leafs/nodes and if theyre not the same then return false
		
		if(!compareTrees(a.left, b.left)) {
			return false;
		}
		
		if(!compareTrees(a.right, b.right)) {
			return false;
		}
		
		//if all checks pass, return true
		return true;
	}
	
	
	public static TreeNode populateTree(List<Integer> nodeList, List<String> position, TreeNode root) {
		
		if (nodeList.size() == 0) {
			return root;
		} else {
			TreeNode newNode = new TreeNode(nodeList.get(0));
			TreeNode temp = root;
			
			if(position.get(0).equals("left-left")) { //left branch, leftmost mode
				while(root.left != null) {
					root = root.left;
				}
				root.left = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);
			}
			else if(position.get(0).equals("left-right")) { //left branch, rightmost node
				while(root.left != null) {
					root = root.left;
				}
				root.right = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);
				
			}
			else if(position.get(0).equals("right-right")) { //right branch, rightmost node
				while(root.right != null) {
					root = root.right;
				}
				root.right = newNode;
				nodeList.remove(nodeList.get(0));
				position.remove(position.get(0));
				return populateTree(nodeList, position, temp);
				
			}
			else if(position.get(0).equals("right-left")) { //right branch, leftmost node
				while(root.right != null) {
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
