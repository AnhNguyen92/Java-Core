package javacore.algorithm.leetcode.under51;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 46
 */
public class Permutations {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> output = new ArrayList<>();
		output.add(new ArrayList<>());
		for (int num : nums) {
			List<List<Integer>> newSubsets = new ArrayList<>();
			for (List<Integer> curr : output) {
				for (int i = 0; i <= curr.size() - 1; i++) {
					List<Integer> tempItem = new ArrayList<>(curr);
					tempItem.add(i, num);
					newSubsets.add(tempItem);
				}
				curr.add(num);
			}
			for (List<Integer> item : newSubsets) {
				output.add(item);
			}
		}

		return output;
	}
}
