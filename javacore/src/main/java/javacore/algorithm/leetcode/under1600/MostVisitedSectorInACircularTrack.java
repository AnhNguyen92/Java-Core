package javacore.algorithm.leetcode.under1600;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1560. Most Visited Sector in a Circular Track
 */
public class MostVisitedSectorInACircularTrack {
	public List<Integer> mostVisited(int n, int[] rounds) {
		List<Integer> lst = new ArrayList<>();
		int[] arr = new int[n + 1];
		arr[rounds[0]]++;

		for (int i = 1; i < rounds.length; i++) {
			int end = rounds[i];
			int j = rounds[i - 1];
			while (j++ != end) {
				if (j > n) {
					j = 1;
				}
				arr[j]++;
			}
		}
		int max = -1;
		for (int i = 1; i <= n; i++) {
			max = Math.max(max, arr[i]);
		}
		for (int i = 1; i <= n; i++) {
			if (arr[i] == max) {
				lst.add(i);
			}
		}
		return lst;
	}
}
