package javacore.algorithm.leetcode.under100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 90
 */
public class SubsetsII {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> output = new HashSet<>();
		output.add(new ArrayList<>());

		for (int num : nums) {
			Set<List<Integer>> newSubsets = new HashSet<>();
			for (List<Integer> curr : output) {
				List<Integer> item = new ArrayList<>(curr);
				item.add(num);
				newSubsets.add(item);
			}
			for (List<Integer> curr : newSubsets) {
				output.add(curr);
			}
		}
		return new ArrayList<>(output);
	}
}
