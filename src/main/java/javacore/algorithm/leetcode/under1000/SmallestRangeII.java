package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/*
 * LeetCode 910. Smallest Range II
 */
public class SmallestRangeII {
	public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = nums[n - 1] - nums[0];
        int max;
        int min;
        for (int i = 0; i < n - 1; i++) {
            max = Math.max(nums[i] + k, nums[n - 1] - k);
            min = Math.min(nums[0] + k, nums[i + 1] - k);
            ans = Math.min(ans, max - min);
        }
        return ans;
    }

}
