package javacore.algorithm.leetcode.under200;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 107
 */
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        addByLevel(root, ans, 0);
        Stack<List<Integer>> stack = new Stack<>();
        while (!ans.isEmpty()) {
            stack.push(ans.get(0));
            ans.remove(0);
        }
        while (!stack.isEmpty()) {
            List<Integer> item = stack.pop();
            ans.add(item);
        }
        return ans;
    }
    
    private void addByLevel(TreeNode root, List<List<Integer>> ans, int level) {
        if (root != null) {
            if (ans.size() <= level) {
                ans.add(new ArrayList<>());
            }
            List<Integer> item = ans.get(level);
            item.add(root.val);
            addByLevel(root.left, ans, level + 1);
            addByLevel(root.right, ans, level + 1);
        }
    }
}
