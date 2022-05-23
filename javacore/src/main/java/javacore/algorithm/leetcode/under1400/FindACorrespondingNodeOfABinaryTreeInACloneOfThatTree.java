package javacore.algorithm.leetcode.under1400;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * Leetcode 1379
 */
public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {
	public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (cloned != null) {
            if (cloned.val == target.val) {
                return cloned;
            }
            TreeNode res = getTargetCopy(original, cloned.left, target);
            if (res != null) {
                return res;
            }
            return getTargetCopy(original, cloned.right, target);
        }
        return null;    
    }
}
