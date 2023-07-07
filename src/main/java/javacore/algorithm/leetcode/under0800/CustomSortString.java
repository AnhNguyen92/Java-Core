package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 791. Custom Sort String
 */
public class CustomSortString {
	public String customSortString(String order, String s) {
		StringBuilder builder = new StringBuilder();
		int[] crr = new int[26];
		char c;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (order.indexOf(c) < 0) {
				builder.append(c);
			} else {
				crr[c - 'a']++;
			}
		}
		for (int i = 0; i < order.length(); i++) {
			c = order.charAt(i);
			for (int j = 0; j < crr[c - 'a']; j++) {
				builder.append(c);
			}
		}
		return builder.toString();
	}
}
