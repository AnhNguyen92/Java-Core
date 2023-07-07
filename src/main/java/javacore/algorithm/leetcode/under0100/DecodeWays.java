package javacore.algorithm.leetcode.under0100;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 91. Decode Ways
 */
public class DecodeWays {
	int count = 0;
	Map<Integer, Integer> map = new HashMap<>();

	public int numDecodings(String s) {
		int n = s.length();
		traverse(s, 0, n);
		return map.getOrDefault(0, 0);
	}

	private int traverse(String s, int idx, int n) {
		if (map.containsKey(idx)) {
			return map.get(idx);
		}
		char c = s.charAt(idx);
		if (c == '0') {
			map.put(idx, 0);
			return 0;
		}
		if (idx == n - 1) {
			map.put(idx, 1);
			return 1;
		}
		char l = s.charAt(idx + 1);
		if (idx == n - 2) {
			if (l == '0' && c - '3' >= 0) {
				map.put(idx, 0);
				return 0;
			} else if ((c == '1' && l != '0') || (c == '2' && l - '6' <= 0 && l - '0' > 0)) {
				map.put(idx, 2);
				return 2;
			} else {
				map.put(idx, 1);
				return 1;
			}
		}
		int res1 = traverse(s, idx + 1, n);
		int res2 = 0;
		if (c == '1' || (c == '2' && l - '6' <= 0)) {
			res2 = traverse(s, idx + 2, n);
		}
		map.put(idx, res1 + res2);
		return res1 + res2;
	}
}
