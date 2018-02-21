package tree;

import java.util.Stack;

public class ValidBST {
	
	
	/**
	 * Iterate through tree in-order, check if prev <= current. If prev  > current, return false
	 * O(n) because if it is valid, will visit each node
	 */

	public boolean isValidBST(TreeNode root) {

		if (root == null) {
			return true;
		}

		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		TreeNode current = root;
		TreeNode prev = null;
		
		while(!stack.isEmpty() || current != null) {		
			
			if(current != null) {
				stack.push(current);	
				current = current.left;
			}
			else {
				
				TreeNode head  = stack.pop();
				
				if(prev != null && head.val <= prev.val ) {
					return false;
				}
				
				prev = head; 
				current = head.right; 
			}
		}

		return true;
	}
}
