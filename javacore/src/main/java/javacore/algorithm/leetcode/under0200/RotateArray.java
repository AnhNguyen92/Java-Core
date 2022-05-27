package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 189
 */
public class RotateArray {
	public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % nums.length;
        int[] ans = new int[nums.length];
        for (int i = n - k; i < n; i++) {
            ans[i + k - n] = nums[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[i + k] = nums[i];
        }
        System.arraycopy(ans, 0, nums, 0, n);
    }
}
