package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 513. Find Bottom Left Tree Value
 */
public class FindBottomLeftTreeValue {
	public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        travel(ans, root, 0);
        return ans.get(ans.size()-1).get(0);
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
