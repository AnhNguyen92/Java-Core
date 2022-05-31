package javacore.algorithm.leetcode.under1700;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 1609
 */
public class EvenOddTree {
	public boolean isEvenOddTree(TreeNode root) {
        List<List<Integer>> lst = new ArrayList<>();
        travel(lst, root, 0);
        for (int i = 0; i < lst.size(); i += 2) {
            if (!increase(lst.get(i))) {
                return false;
            }
        }
        for (int i = 1; i < lst.size(); i += 2) {
            if (!decrease(lst.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    private void travel(List<List<Integer>> lst, TreeNode root, int level) {
        if (root != null) {
            if (level == lst.size()) {
                lst.add(new ArrayList<>());
            }
            List<Integer> item = lst.get(level);
            item.add(root.val);
            travel(lst, root.left, level + 1);
            travel(lst, root.right, level + 1);
        }
    }
    
    private boolean increase(List<Integer> lst) {
        if (lst.get(0) % 2 == 0)
            return false;
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 0 || lst.get(i-1) >= lst.get(i))
                return false;
        }
        return true;
    }
    
    private boolean decrease(List<Integer> lst) {
        if (lst.get(0) % 2 == 1)
            return false;
        for (int i = 1; i < lst.size(); i++) {
            if (lst.get(i) % 2 == 1 || lst.get(i-1) <= lst.get(i))
                return false;
        }
        return true;
    }
}
