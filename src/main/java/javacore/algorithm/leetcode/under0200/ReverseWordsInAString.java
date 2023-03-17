package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 151. Reverse Words in a String
 */
public class ReverseWordsInAString {

	public String reverseWords(String s) {
		StringBuilder ans = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		boolean foundSpace = false;
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				sb.append(c);
				foundSpace = false;
			} else {
				if (!foundSpace) {
					ans.insert(0, sb.toString());
					ans.insert(0, " ");
					sb = new StringBuilder();
					foundSpace = true;
				}
			}
		}
		if (sb.length() > 0) {
			ans.insert(0, sb.toString());
			ans.append(" ");
		}
		return ans.toString().trim();
	}

	public String reverseWords1(String s) {
		String[] split = s.split(" +");
		StringBuilder sb = new StringBuilder();
		for (int i = split.length - 1; i >= 0; i--) {
			sb.append(split[i]);
			sb.append(" ");
		}
		return sb.toString().trim();
	}

}
