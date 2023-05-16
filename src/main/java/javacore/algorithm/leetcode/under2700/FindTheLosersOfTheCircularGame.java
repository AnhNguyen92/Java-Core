package javacore.algorithm.leetcode.under2700;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2682. Find the Losers of the Circular Game
 */
public class FindTheLosersOfTheCircularGame {
	public int[] circularGameLosers(int n, int k) {
		List<Integer> lst = new ArrayList<>();
		int count = 1;
		int s = 1;
		while (!lst.contains(s)) {
			lst.add(s);
			s += (k * count++) % n;
			if (s > n) {
				s %= n;
			}
			if (s == 0) {
				s = n;
			}
		}
		int[] arr = new int[n - lst.size()];
		int j = 0;
		for (int i = 1; i <= n; i++) {
			if (!lst.contains(i)) {
				arr[j++] = i;
			}
		}
		return arr;
	}
}
