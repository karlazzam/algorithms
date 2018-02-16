package tree;



public class TrimBinaryTree {

	/**
	 * Given a binary search tree and the lowest and highest boundaries as L and
	 * R, trim the tree so that all its elements lies in [L, R] (R >= L). You
	 * might need to change the root of the tree, so the result should return
	 * the new root of the trimmed binary search tree.
	 * 
	 */

	public TreeNode trimBST(TreeNode root, int L, int R) {

		if(root == null) {
			return null;
		}
		//if node is < L, tree is on right side so go to right
		if (root.val < L) {
			return trimBST(root.right, L, R);
		}
		
		//if node is < R, tree is on left side so go to left
		if (root.val > R) {
			return trimBST(root.left, L, R);
		}

		//else trim both then return the root
		root.left = trimBST(root.left, L, R);
		root.right = trimBST(root.right, L, R);
		return root;
	}

}
