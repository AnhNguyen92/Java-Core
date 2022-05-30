package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1021
 */
public class RemoveOutermostParentheses {
	public String removeOuterParentheses(String S) {
		StringBuilder builder = new StringBuilder();
		char[] chr = S.toCharArray();
		int sum = 0;
		for (int i = 0; i < chr.length; i++) {
			if ((chr[i] == '(' && sum++ > 0) || (chr[i] == ')' && --sum > 0)) {
				builder.append(chr[i]);
			}
		}
		return builder.toString();
	}
}
