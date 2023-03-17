package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2465. Number of Distinct Averages
 */
public class NumberOfDistinctAverages {
	public int distinctAverages(int[] nums) {
		Set<Double> set = new HashSet<>();
		Arrays.sort(nums);
		int j = nums.length - 1;
		for (int i = 0; i < (j + 1) / 2; i++) {
			set.add((nums[i] + nums[j - i]) * 1.0 / 2);
		}
		return set.size();
	}
}