package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 886. Possible Bipartition
 */
public class PossibleBipartition {
	private Map<Integer, List<Integer>> map = new HashMap<>();

	public boolean possibleBipartition(int n, int[][] dislikes) {
		for (int[] arr : dislikes) {
			List<Integer> keys = map.getOrDefault(arr[0], new ArrayList<>());
			keys.add(arr[1]);
			map.put(arr[0], keys);
			List<Integer> reverseKeys = map.getOrDefault(arr[1], new ArrayList<>());
			reverseKeys.add(arr[0]);
			map.put(arr[1], reverseKeys);
		}
		int[] colors = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			if (map.containsKey(i)) {
				if (colors[i] == 0 && !dfs(colors, i, 1)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean dfs(int[] colors, int i, int color) {
		if (colors[i] != 0) {
			return colors[i] == color;
		}
		colors[i] = color;
		List<Integer> keys = map.get(i);
		for (int key : keys) {
			if (!dfs(colors, key, -1 * color)) {
				return false;
			}
		}
		return true;
	}

}
