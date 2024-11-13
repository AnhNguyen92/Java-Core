package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 485. Max Consecutive Ones
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		int con = 0;
		int max = 0;
        for (int num : nums) {
            if (num == 0) {
                if (max < con) {
                    max = con;
                }
                con = 0;
            } else {
                con++;
            }
        }
		if (con > max) {
			max = con;
		}
		return max;
	}
}
