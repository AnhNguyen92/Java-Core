package javacore.algorithm.leetcode.under0051;

import java.util.Arrays;

/*
 * LeetCode 41. First Missing Positive
 */
public class FirstMissingPositive {
	public int firstMissingPositive(int[] nums) {
		Arrays.sort(nums);
		int missing = 1;
        for (int num : nums) {
            if (num == missing) {
                missing++;
            }
        }
		return missing;
	}
}
