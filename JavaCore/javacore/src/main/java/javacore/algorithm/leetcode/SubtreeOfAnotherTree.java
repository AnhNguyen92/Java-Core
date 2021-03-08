package javacore.algorithm.leetcode;

import javacore.algorithm.leetcode.model.TreeNode;

public class SubtreeOfAnotherTree {
    public static void main(String[] args) {
        TreeNode s = new TreeNode(3, new TreeNode(4, new TreeNode(1), null), new TreeNode(5, new TreeNode(2), null));
        TreeNode t = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        System.out.println(isSubtree(s, t));
    }

    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null && t == null)
            return true;
        else if (s == null || t == null)
            return false;

        if (s.val == t.val && isSubtree(s.left, t.left) && isSubtree(s.right, t.right)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
}
