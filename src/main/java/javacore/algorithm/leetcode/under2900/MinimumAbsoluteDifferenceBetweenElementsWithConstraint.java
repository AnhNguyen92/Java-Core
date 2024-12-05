package javacore.algorithm.leetcode.under2900;

import java.util.List;
import java.util.TreeSet;

/**
 * 2817. Minimum Absolute Difference Between Elements With Constraint
 */
public class MinimumAbsoluteDifferenceBetweenElementsWithConstraint {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        int minDiff = Integer.MAX_VALUE;
        Integer high;
        Integer low;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = x; i < nums.size(); i++) {
            set.add(nums.get(i-x));
            high = set.ceiling(nums.get(i));
            low = set.floor(nums.get(i));
            if (high != null) {
                minDiff = Math.min(high- nums.get(i), minDiff);
            }
            if (low != null) {
                minDiff = Math.min(nums.get(i) - low, minDiff);
            }
        }
        return minDiff;
    }
}
