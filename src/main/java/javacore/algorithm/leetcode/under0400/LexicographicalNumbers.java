package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 386. Lexicographical Numbers
 */
public class LexicographicalNumbers {
	public List<Integer> lexicalOrder(int n) {
		List<Integer> ans = new ArrayList<>();
		int x = 1;
		for (int i = 1; i <= n; i++) {
			ans.add(x);
			if (x * 10 <= n) {
				x *= 10;
			} else if (x % 10 == 9 || x == n) {
				while (x % 10 == 9 || x == n) {
					x = x / 10;
				}
				x++;
			} else {
				x++;
			}
		}

		return ans;
	}
}
