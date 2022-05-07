package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leetcode 448
 */
public class FindAllNumbersDisappearedInAnArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		if (nums.length == 0)
			return new ArrayList<>();
		Arrays.sort(nums);
		List<Integer> ans = new ArrayList<>();
		int j = 0;
		int i = 1;
		while (i <= nums[nums.length - 1] && j < nums.length) {
			if (i < nums[j]) {
				for (int k = i; k < nums[j]; k++) {
					ans.add(k);
				}
				i = nums[j] + 1;
			} else if (i == nums[j]) {
				j++;
				i++;
			} else {
				j++;
			}
		}
		for (int k = nums[nums.length - 1] + 1; k <= nums.length; k++)
			ans.add(k);
		return ans;
	}
}
