package tree;

public class BalanceBinaryTree {
	
	private boolean result = true;

	public boolean isBalanced(TreeNode root) {
		maxHeight(root);		
		return result;
	}
	
	public int maxHeight(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int left = maxHeight(root.left);
		int right = maxHeight(root.right);
		
		if(Math.abs(left - right) > 1) {
			result = false;
		}
	
		return Math.max(maxHeight(root.left), maxHeight(root.right)) + 1;
	}

}
