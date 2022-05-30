package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 230
 */
public class KthSmallestElementInABST {
	public int kthSmallest(TreeNode root, int k) {
        List<Integer> lst = new ArrayList<>();
        travel(lst, root);
        Collections.sort(lst);
        return lst.get(k-1);
    }
    
    private void travel(List<Integer> lst, TreeNode root) {
        if (root != null) {
            lst.add(root.val);
            travel(lst, root.left);
            travel(lst, root.right);
        }
    }
}
