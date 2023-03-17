package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 713. Subarray Product Less Than K
 */
public class SubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int ans = 0;
        int prod;
        int j;
        for (int i = 0; i < nums.length; i++) {
            prod = 1;
            j = i;
            while (j < nums.length && prod * nums[j] < k) {
                ans++;
                prod *= nums[j++];
            }
        }
        return ans;
    }
}
