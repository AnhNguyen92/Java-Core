package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 102
 */
public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        travel(ans, root, 0);
        return ans;
    }
    
    private void travel(List<List<Integer>> ans,TreeNode root , int height) {
        if (root != null) {
            if (height == ans.size()) {
                ans.add(new ArrayList<>());
            }
            List<Integer> lst = ans.get(height);
            if (lst == null) {
                lst = new ArrayList<>();
            }
            lst.add(root.val);
            travel(ans, root.left, height + 1);
            travel(ans, root.right, height + 1);
        }
    }
}
