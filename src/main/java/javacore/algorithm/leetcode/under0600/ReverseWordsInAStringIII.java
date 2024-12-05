package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 557. Reverse Words in a String III
 */
public class ReverseWordsInAStringIII {
	public String reverseWords(String s) {
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : arr) {
			sb.append(" ");
			StringBuilder input = new StringBuilder();
			input.append(str);
			sb.append(input.reverse());
		}
		sb.deleteCharAt(0);
		return sb.toString();
	}
}
