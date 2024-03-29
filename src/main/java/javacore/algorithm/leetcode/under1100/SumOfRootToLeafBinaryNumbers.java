package javacore.algorithm.leetcode.under1100;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1022. Sum of Root To Leaf Binary Numbers
 */
public class SumOfRootToLeafBinaryNumbers {
	int rootToLeaf = 0;

	public void preorder(TreeNode r, int currNumber) {
		if (r != null) {
			currNumber = (currNumber << 1) | r.val;
			// if it's a leaf, update root-to-leaf sum
			if (r.left == null && r.right == null) {
				rootToLeaf += currNumber;
			}
			preorder(r.left, currNumber);
			preorder(r.right, currNumber);
		}
	}

	public int sumRootToLeaf(TreeNode root) {
		preorder(root, 0);
		return rootToLeaf;
	}
}
