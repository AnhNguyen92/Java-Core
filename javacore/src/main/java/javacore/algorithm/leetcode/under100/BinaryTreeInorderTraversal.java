package javacore.algorithm.leetcode.under100;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 94
 */
public class BinaryTreeInorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        travel(result, root);
        
        return result;
    }
    
    public void travel(List<Integer> result, TreeNode  root) {
        if (root != null) {
            travel(result, root.left);
            result.add(root.val);
            travel(result, root.right);
        }
    }
}
