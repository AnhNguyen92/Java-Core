package javacore.algorithm.leetcode.under1300;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1261. Find Elements in a Contaminated Binary Tree
 */
public class FindElementsInAContaminatedBinaryTree {
	class FindElements {
	    Map<Integer, Boolean> map = new HashMap<>();

	    public FindElements(TreeNode root) {
	        root.val = 0;
	        map.put(0, true);
	        recover(root);
	    }

	    public boolean find(int target) {
	        return map.get(target) != null;
	    }

	    private void recover(TreeNode root) {
	        if (root.left != null) {
	            root.left.val = root.val * 2 + 1;
	            map.put(root.left.val, true);
	            recover(root.left);
	        }
	        if (root.right != null) {
	            root.right.val = root.val * 2 + 2;
	            map.put(root.right.val, true);
	            recover(root.right);
	        }
	    }
	}
}
