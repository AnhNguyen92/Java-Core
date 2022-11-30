package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 77. Combinations
 */
public class Combinations {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> lst = new ArrayList<>();
		backtracking(lst, new ArrayList<>(), 1, n, k);

		return lst;
	}

	public void backtracking(List<List<Integer>> lst, List<Integer> item, int start, int end, int k) {
		if (item.size() == k) {
			lst.add(new ArrayList<>(item));
			return;
		}
		for (int i = start; i <= end; i++) {
			item.add(i);
			backtracking(lst, item, i + 1, end, k);
			item.remove(item.size() - 1);
		}
	}
}
