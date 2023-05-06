package javacore.algorithm.leetcode.under2700;

/*
 * LeetCode 2609. Find the Longest Balanced Substring of a Binary String
 */
public class FindTheLongestBalancedSubstringOfABinaryString {
	public int findTheLongestBalancedSubstring(String s) {
		int ans = 0;
		int len = s.length();
		int zero = 0;
		int one = 0;
		for (int i = 0; i < len; i++) {
			if (s.charAt(i) == '0') {
				zero++;
			} else {
				while (i < len && s.charAt(i) == '1') {
					one++;
					i++;
				}
				ans = Math.max(ans, 2 * Math.min(zero, one));
				zero = 0;
				one = 0;
				i--;
			}

		}
		return ans;
	}
}
