package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageLevels {
	
	
	/**
	 * Use DFS to traverse tree since we need to hit each level of the tree and all it's nodes on that level
	 */

	
	public List<Double> averageOfLevels(TreeNode root) {
		
	    List<Double> levels = new ArrayList<>();
	    Queue<TreeNode> q = new LinkedList<>();
	    
		if(root == null) {
			return levels;
		}
	    
	    //add root to queue
	    q.add(root);
		
		//iterate through all levels
		while(!q.isEmpty()) { 
			int n = q.size(); //number of nodes on the current level, grows bigger as we add nodes to the queue in for loop
			double sum = 0.0;
			
			//iterate through level and all of its nodes and add up the sum
			for(int i = 0; i <n; i++) { 
				TreeNode node = q.poll();
				sum += node.val;
				
				if(node.left != null) {
					q.offer(node.left);
				}

				if(node.right != null) {
					q.offer(node.right);
				}
			}		
			levels.add(sum);
		}
		
		return levels;
	}

}
