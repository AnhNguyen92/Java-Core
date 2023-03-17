package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2529. Maximum Count of Positive Integer and Negative Integer
 */
public class MaximumCountOfPositiveIntegerAndNegativeInteger {
	public int maximumCount(int[] nums) {
        int n = nums.length;
        if (nums[0] > 0 || nums[n - 1] < 0) {
            return n;
        }
        int max = 0;
        int pos = 0;
        int i = 0;
        while (i < n && nums[i] < 0) {
            i++;
            pos++;
        }
        max = Math.max(max, pos);
        if (max >= n / 2) {
            return max;
        }
        i = n - 1;
        pos = 0;
        while (i >= 0 && nums[i] > 0) {
            i--;
            pos++;
        }
        return Math.max(max, pos);
    }
}
