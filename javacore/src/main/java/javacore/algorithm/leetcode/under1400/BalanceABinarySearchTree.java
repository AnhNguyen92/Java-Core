package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1382
 */
public class BalanceABinarySearchTree {
	List<Integer> lst = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        travel(root);
        return insertAVLTree(0, lst.size() - 1);
    }
    
    private TreeNode insertAVLTree(int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        return new TreeNode(lst.get(mid), insertAVLTree(start, mid - 1), insertAVLTree(mid + 1, end));
    }
    
    private void travel(TreeNode root) {
        if (root != null) {
            travel(root.left);
            lst.add(root.val);
            travel(root.right);
        }
    }
}
