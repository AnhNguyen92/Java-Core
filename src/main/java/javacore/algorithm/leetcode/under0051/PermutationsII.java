package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 47. Permutations II
 */
public class PermutationsII {
	public Set<List<Integer>> permuteUnique(int[] nums) {
		Set<List<Integer>> output = new HashSet<>();
		output.add(new ArrayList<>());
		for (int num : nums) {
			Set<List<Integer>> newSubsets = new HashSet<>();
			for (List<Integer> curr : output) {
				for (int i = 0; i <= curr.size() - 1; i++) {
					List<Integer> tempItem = new ArrayList<>(curr);
					tempItem.add(i, num);
					newSubsets.add(tempItem);
				}
				curr.add(num);
			}
			for (List<Integer> item : newSubsets) {
				if (!exist(output, item)) {
					output.add(item);
				}
			}
		}

		return output;
	}
	
	private boolean exist(Set<List<Integer>> output, List<Integer> item) {
		for (List<Integer> exist : output) {
			int count = 0;
			for (int i = 0; i < item.size(); i++) {
				if (exist.get(i).intValue() == item.get(i).intValue()) {
					count++;
				} else {
					break;
				}
			}
			if (count == item.size()) {
				return true;
			}
		}
		return false;
	}
}
