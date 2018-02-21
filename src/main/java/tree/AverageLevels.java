package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevels {

	/**
	 * Use BFS to traverse tree since we need to hit each level of the tree and
	 * all it's nodes on that level
	 * 
	 * Add null node to queue so can keep track of what level I'm at. If hit null node, then I'm changing levels.
	 * If there's back to back nulls, that means queue has no more non-null vals, so I vreak
	 * 
	 * to get average of each level: Add up all values of a level and divide by # of nodes on that level
	 */
	public List<Double> averageOfLevels(TreeNode root) {

		List<Double> levels = new ArrayList<Double>();
		Queue<TreeNode> queue = new LinkedList<>();

		if (root == null) {
			return levels;
		}

		queue.add(root);
		queue.add(null);

		//add root to list 
		double rootVal = (double) root.val;
		levels.add(rootVal);

		boolean levelChange = false;
		double sum = 0;
		int totalNodes = 0;
		
		//go through each level in the tree except root's level and get average
		while (!queue.isEmpty()) {

			TreeNode node = queue.poll();

			if (node == null) {
				levelChange = true;
				queue.add(null);
				if (queue.peek() == null) {
					break;
				} else {
					continue;
				}
			}

			//if level changed, calculate average of previous level before doing anything on new level
			if (levelChange) {
				double avg = sum / totalNodes;
				levels.add(avg);
				levelChange = false;
				sum = 0;
				totalNodes = 0;

			}

			if (node.left != null) {
				queue.add(node.left);
				sum += node.left.val;
				totalNodes++;
			}

			if (node.right != null) {
				queue.add(node.right);
				sum += node.right.val;
				totalNodes++;
			}
		}
		return levels;
	}
}
