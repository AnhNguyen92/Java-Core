package javacore.algorithm.leetcode.under0700;

import java.util.HashMap;
import java.util.Map;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 653
 */
public class TwoSumIVInputIsABST {
	public boolean findTarget(TreeNode root, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        return isContainTwoSum(root, k, map);
    }
    
    private boolean isContainTwoSum (TreeNode root, int k, Map<Integer, Integer> map) {
        if (root == null) return false;
        int implement = k - root.val;
        if (map.containsKey(implement)) return true;
        else map.put(root.val, 0);
        
        return isContainTwoSum (root.left, k, map)
               || isContainTwoSum (root.right, k, map);
    }
}
