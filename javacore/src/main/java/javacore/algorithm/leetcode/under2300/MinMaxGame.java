package javacore.algorithm.leetcode.under2300;

/*
 * LeetCode 2293
 */
public class MinMaxGame {
	public int minMaxGame(int[] nums) {
        int n = nums.length;
        while (n > 1) {
            int j = 0;
            for (int i = 0; i < n; i += 2) {
                if (i % 4 == 0)
                    nums[j++] = Math.min(nums[i], nums[i+1]);
                else
                    nums[j++] = Math.max(nums[i], nums[i+1]);
            }
            n = j;
        }
        return nums[0];
    }
}
