package javacore.algorithm.leetcode.under1600;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1525. Number of Good Ways to Split a String
 */
public class NumberOfGoodWaysToSplitAString {
	public int numSplits(String s) {
		Map<Character, Integer> left = new HashMap<>();
		Map<Character, Integer> right = new HashMap<>();
		char[] arr = s.toCharArray();
		for (char c : arr) {
			right.merge(c, 1, Integer::sum);
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			left.merge(arr[i], 1, Integer::sum);
			right.merge(arr[i], -1, Integer::sum);
			if (right.get(arr[i]) == 0) {
				right.remove(arr[i]);
			}
			count += left.size() == right.size() ? 1 : 0;
		}
		return count;
	}
}
