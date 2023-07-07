package javacore.algorithm.leetcode.under2800;

/*
 * LeetCode 2716. Minimize String Length
 */
public class MinimizeStringLength {
	public int minimizedStringLength(String s) {
		int[] crr = new int[26];
		for (char c : s.toCharArray()) {
			crr[c - 'a'] = 1;
		}
		int count = 0;
		for (int i : crr) {
			count += i;
		}
		return count;
	}
}
