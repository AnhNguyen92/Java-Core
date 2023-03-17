package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 144. Binary Tree Preorder Traversal
 */
public class BinaryTreePreorderTraversal {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        travel(result, root);
        
        return result;
    }
    
    public void travel(List<Integer> result, TreeNode  root) {
        if (root != null) {
            result.add(root.val);
            travel(result, root.left);
            travel(result, root.right);
            
        }
    }
}
