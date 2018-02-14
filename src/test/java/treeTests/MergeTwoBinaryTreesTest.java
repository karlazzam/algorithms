package treeTests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import tree.MergeTwoBinaryTrees;
import tree.TreeNode;

public class MergeTwoBinaryTreesTest {
	
	@Test
	public void testMergeTwoBinaryTrees() {
		MergeTwoBinaryTrees tree = new MergeTwoBinaryTrees();
		TreeNode a = new TreeNode(1);
		TreeNode b = new TreeNode(2);
		populateBinaryTrees(a, b);
		
		TreeNode expectedMergedTree = new TreeNode(3);
		expectedMergedTree = populateExpectedTree(expectedMergedTree);
			
		TreeNode mergedBinaryTree = tree.mergeTrees(a, b);
		boolean result = HelperMethods.compareTrees(expectedMergedTree, mergedBinaryTree);
		assertEquals(true, result);
	}
	
	private void populateBinaryTrees(TreeNode a, TreeNode b) {
		
		List<Integer> aNodes = new ArrayList<Integer>();
		aNodes.add(3);
		aNodes.add(5);
		aNodes.add(2);
		
		List<String> aPositions = new ArrayList<String>();
		aPositions.add("left-left");
		aPositions.add("left-left");
		aPositions.add("right-right");
		
		a = HelperMethods.populateTree(aNodes, aPositions, a);
		System.out.println(a);

		
		List<Integer> bNodes = new ArrayList<Integer>();
		bNodes.add(1);
		bNodes.add(4);
		bNodes.add(3);		
		bNodes.add(7);

		List<String> bPositions = new ArrayList<String>();
		bPositions.add("left-left");
		bPositions.add("left-right");
		bPositions.add("right-right");
		bPositions.add("right-right");
		
			
		b = HelperMethods.populateTree(bNodes, bPositions, b);
		System.out.println(b);

	}
	
	private TreeNode populateExpectedTree(TreeNode root) {
		List<Integer> nodeList = new ArrayList<Integer>();
		nodeList.add(4);
		nodeList.add(5);
		nodeList.add(4);
		nodeList.add(5);
		nodeList.add(7);

		List<String> position = new ArrayList<String>();
		position.add("left-left");
		position.add("left-left");
		position.add("left-right");
		position.add("right-right");
		position.add("right-right");
		
		return HelperMethods.populateTree(nodeList, position, root);
	}
}
