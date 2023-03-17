package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;

/*
 * LeetCode 1984. Minimum Difference Between Highest and Lowest of K Scores
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {
	public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            if (ans > nums[i + k - 1] - nums[i]) {
                ans = nums[i + k - 1] - nums[i];
            }
        }
        return ans;
    }
}
