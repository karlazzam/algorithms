package tree;

public class MaxDepth {

	public int maxDepth(TreeNode root) {
		
		//if empty tree, return 0
		if(root == null) {
			return 0;
		}
		
		//return larger depth between left and right children + 1 to count root also
		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
	}

}
