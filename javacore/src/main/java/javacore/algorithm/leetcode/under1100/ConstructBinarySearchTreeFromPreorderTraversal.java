package javacore.algorithm.leetcode.under1100;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1008
 */
public class ConstructBinarySearchTreeFromPreorderTraversal {
	
	public TreeNode bstFromPreorder(int[] preorder) {
        return arrayToTree(preorder, 0, preorder.length - 1);
    }

	private TreeNode arrayToTree(int[] preorder, int i, int j) {
		if (i > j)
			return null;
		int k = i + 1;
		TreeNode tree = new TreeNode(preorder[i]);
		while (k <= j && preorder[k] < preorder[i]) {
			k++;
		}
		tree.left = arrayToTree(preorder, i + 1, k - 1);
		tree.right = arrayToTree(preorder, k,  j);
		
		return tree;
	}
	
	
}
