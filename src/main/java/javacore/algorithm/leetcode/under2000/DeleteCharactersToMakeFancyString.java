package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1957. Delete Characters to Make Fancy String
 */
public class DeleteCharactersToMakeFancyString {
	public String makeFancyString(String s) {
		if (s.length() < 3) {
			return s;
		}
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i <= s.length() - 3) {
			if (s.charAt(i) != s.charAt(i + 1) || s.charAt(i) != s.charAt(i + 2)) {
				sb.append(s.charAt(i));
			}
			i++;
		}
		sb.append(s.charAt(i));
		sb.append(s.charAt(i + 1));
		return sb.toString();
	}
}
