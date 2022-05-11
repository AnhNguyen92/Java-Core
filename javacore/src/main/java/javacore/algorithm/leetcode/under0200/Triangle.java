package javacore.algorithm.leetcode.under0200;

import java.util.List;

/*
 * LeetCode 120
 */
public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int n = triangle.size();

		int[] memo = new int[n];

		for (int i = 0; i < n; i++) {
			for (int j = i; j >= 0; j--) {
				if (j == 0) {
					memo[j] = memo[j] + triangle.get(i).get(j);
				} else if (j == i) {
					memo[j] = memo[j - 1] + triangle.get(i).get(j);
				} else
					memo[j] = Math.min(memo[j], memo[j - 1]) + triangle.get(i).get(j);
			}

		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			min = Math.min(min, memo[i]);
		}

		return min;
	}
}
