package javacore.algorithm.leetcode.under0500;

import java.util.Arrays;

/*
 * Leetcode 455. Assign Cookies
 */
public class AssignCookies {
	public int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		int i = 0;
		int j = 0;
		while (i < g.length && j < s.length) {
			if (g[i] <= s[j]) {
				i++;
				count++;
			}
			j++;
		}
		return count;
	}
}
