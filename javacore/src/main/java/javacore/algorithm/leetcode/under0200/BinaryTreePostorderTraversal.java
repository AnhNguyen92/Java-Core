package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 145
 */
public class BinaryTreePostorderTraversal {
	public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        travel(result, root);
        
        return result;
    }

    public void travel(List<Integer> result, TreeNode  root) {
        if (root != null) {
            travel(result, root.left);
            travel(result, root.right);
            result.add(root.val);
        }
    }
}
