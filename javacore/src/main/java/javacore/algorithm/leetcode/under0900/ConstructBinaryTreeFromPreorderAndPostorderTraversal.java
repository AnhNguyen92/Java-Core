package javacore.algorithm.leetcode.under0900;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 889
 */
public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
	Map<Integer, Integer> postorderMap = new HashMap<>();
	int idx = 0;

	public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
		for (int i = 0; i < postorder.length; i++) {
			postorderMap.put(postorder[i], i);
		}
		return arrayToTree(preorder, 0, preorder.length - 1);
	}

	private TreeNode arrayToTree(int[] preorder, int start, int end) {
		if (start > end) {
			return null;
		}

		TreeNode treeNode = new TreeNode(preorder[idx++]);
		if (end > start && idx < preorder.length) {
			Integer k = postorderMap.get(preorder[idx]);
			treeNode.left = arrayToTree(preorder, start, k);
		    treeNode.right = arrayToTree(preorder, k + 1, postorderMap.get(treeNode.val) - 1);
        }

		return treeNode;
	}
	
}
