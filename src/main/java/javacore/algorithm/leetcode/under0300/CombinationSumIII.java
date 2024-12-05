package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * LeetCode 216. Combination Sum III
 */
public class CombinationSumIII {
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> ans = new ArrayList<>();
		int max = n - k * (k - 1) / 2;
		if (max > 9) {
			max = 9;
		}
		for (int i = 1; i <= max; i++) {
			List<Integer> item = new ArrayList<>();
			item.add(i);
			ans.add(item);
		}
		for (int i = 2; i <= k; i++) {
			int len = ans.size();
			for (int j = len - 1; j >= 0; j--) {
				List<Integer> item = ans.get(j);
				int val = item.get(item.size() - 1);
				for (int ii = val + 1; ii <= max; ii++) {
                    List<Integer> newItem = new ArrayList<>(item);
					newItem.add(ii);
					ans.add(newItem);
				}
				ans.remove(item);
			}
		}
		return ans.stream().filter(set -> set.stream().reduce(0, (a, b) -> a + b) == n).collect(Collectors.toList());
	}

	// 2nd solution using recursion
	public List<List<Integer>> combinationSumIIIRecursion(int k, int n) {
		List<List<Integer>> ans = new ArrayList<>();
		combinationSum(ans, new ArrayList<>(), k, n, 1);

		return ans;
	}

	private void combinationSum(List<List<Integer>> lst, List<Integer> item, int k, int n, int start) {
		if (k == item.size() && n == 0) {
			lst.add(new ArrayList<>(item));
		} else {
			for (int i = start; i < 9; i++) {
				item.add(start);
				combinationSum(lst, item, k, n - i, i + 1);
				item.remove(item.size() - 1);
			}
		}
	}
}
