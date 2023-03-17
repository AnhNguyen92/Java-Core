package javacore.algorithm.leetcode.under1300;

/*
 * LeetCode 1221. Split a String in Balanced Strings
 */
public class SplitAStringInBalancedStrings {
	public int balancedStringSplit(String s) {
		int count = 0;
		int left = 0;
		int right = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'L')
				left++;
			else
				right++;
			if (left == right) {
				count++;
				left = 0;
				right = 0;
			}
		}
		return count;
	}
}
