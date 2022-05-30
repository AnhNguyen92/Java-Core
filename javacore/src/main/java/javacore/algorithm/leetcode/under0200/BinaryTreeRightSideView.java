package javacore.algorithm.leetcode.under0200;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 199
 */
public class BinaryTreeRightSideView {
	public List<Integer> rightSideView(TreeNode root) {
        return levelOrder(root);
    }
    
    public List<Integer> levelOrder(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        travel(lst, root, 0);
        List<Integer> ans = new ArrayList<>();
        for (List<Integer> item : lst) {
            ans.add(item.get(item.size() - 1));
        }
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
