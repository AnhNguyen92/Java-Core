package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1920
 */
public class BuildArrayFromPermutation {
	public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
