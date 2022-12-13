package javacore.algorithm.leetcode.under1000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 997. Find the Town Judge
*/
public class FindTheTownJudge {
	public int findJudge(int n, int[][] trust) {
		if (trust.length == 0) {
			return (n != 1) ? -1 : 1;
		}
		int[] key = new int[n + 1];
		int[] value = new int[n + 1];
		for (int[] a : trust) {
			key[a[0]]++;
			value[a[1]]++;
		}
		for (int i = 1; i <= n; i++) {
			if (value[i] == n - 1 && key[i] == 0)
				return i;
		}
		return -1;
	}

	public int findJudge2(int n, int[][] trust) {
		if (trust.length == 0) {
			return (n != 1) ? -1 : 1;
		}
		Map<Integer, Integer> reverseMap = new HashMap<>();
		Map<Integer, Integer> map = new HashMap<>();
		for (int[] a : trust) {
			reverseMap.put(a[0], map.getOrDefault(a[0], 0) + 1);
			map.put(a[1], map.getOrDefault(a[1], 0) + 1);
		}
		List<Integer> lst = map.entrySet().stream().filter(m -> m.getValue() == n - 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		if (lst.size() != 1) {
			return -1;
		}
		int just = lst.get(0);
		if (reverseMap.get(just) != null) {
			return -1;
		}
		return just;
	}
}
