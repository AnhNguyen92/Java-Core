package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.List;

import javacore.algorithm.leetcode.model.TreeNode;

/*
 * LeetCode 515. Find Largest Value in Each Tree Row
 */
public class FindLargestValueInEachTreeRow {
	List<Integer> max = new ArrayList<>();
    public List<Integer> largestValues(TreeNode root) {
        if (root != null) {
             max.add(root.val);
        addMax(root, 0);
        }
       
        return max;
    }
    
    private void addMax(TreeNode root, int index) {
        if (root != null) {
            if (index == max.size()) {
                max.add(index, root.val);
            } else {
                max.set(index, Math.max( max.get(index), root.val));
            }
            addMax(root.left, index + 1);
            addMax(root.right, index + 1);
        }
    }
}
