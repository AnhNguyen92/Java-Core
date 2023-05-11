package javacore.algorithm.leetcode.under2700;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2670. Find the Distinct Difference Array
 */
public class FindTheDistinctDifferenceArray {
	public int[] distinctDifferenceArray(int[] nums) {
		int len = nums.length;
		int[] ans = new int[len];
		Set<Integer> prefixSet = new HashSet<>();
		Set<Integer> suffixSet = new HashSet<>();
		for (int i = 0; i < len; i++) {
			prefixSet.add(nums[i]);
			ans[i] += prefixSet.size();
			suffixSet.add(nums[len - 1 - i]);
			if (i < len - 1) {
				ans[len - 2 - i] -= suffixSet.size();
			}
		}

		return ans;
	}
}
