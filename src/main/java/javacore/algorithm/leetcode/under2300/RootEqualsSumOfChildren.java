package javacore.algorithm.leetcode.under2300;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 2236. Root Equals Sum of Children
 */
public class RootEqualsSumOfChildren {
	public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}
