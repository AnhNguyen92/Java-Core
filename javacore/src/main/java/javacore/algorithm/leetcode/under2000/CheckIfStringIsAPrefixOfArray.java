package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1961
*/
public class CheckIfStringIsAPrefixOfArray {
	public boolean isPrefixString(String s, String[] words) {
		int i = 0;
		for (String s1 : words) {
			for (int j = 0; j < s1.length(); j++) {
				if (s1.charAt(j) != s.charAt(i++)) {
					return false;
				}
				if (i == s.length()) {
					return j == s1.length() - 1;
				}
			}
		}

		return false;
	}

	public boolean isPrefixString1(String s, String[] words) {
		StringBuilder sb = new StringBuilder();
		for (String s1 : words) {
			sb.append(s1);
			if (sb.length() < s.length() && !s.contains(sb)) {
				return false;
			} else if (sb.length() == s.length()) {
				return sb.toString().contains(s);
			}
		}

		return false;
	}
}
