package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 39
 */
public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		backtrack(ans, new ArrayList<>(), candidates, target, 0, 0);
		return ans;
	}

	public void backtrack(List<List<Integer>> ans, List<Integer> item, int[] candidates, int target, int sum,
			int index) {
		if (sum == target) {
			ans.add(new ArrayList<>(item));
			return;
		}
		if (sum > target) {
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			item.add(candidates[i]);
			sum += candidates[i];
			backtrack(ans, item, candidates, target, sum, i);
			sum -= candidates[i];
			item.remove(item.size() - 1);
		}
	}
}
