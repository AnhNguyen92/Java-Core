package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1695. Maximum Erasure Value
 */
public class MaximumErasureValue {
	public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] psum = new int[n + 1];
        int[] present = new int[10001];
        for (int i = 0; i < 10001; i++)
            present[i] = -1;
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = -1;
        int idx = 0;
        while (j < n) {
            psum[j+1] = psum[j] + nums[j];
            idx = present[nums[j]];
            if (idx >= 0 && idx >= i) {
                sum = psum[j] - psum[i];
                max = Math.max(max, sum);
                i = idx + 1;
            }
            present[nums[j]] = j++;
        }
        return Math.max(max, psum[j] - psum[i]);
    }
}
