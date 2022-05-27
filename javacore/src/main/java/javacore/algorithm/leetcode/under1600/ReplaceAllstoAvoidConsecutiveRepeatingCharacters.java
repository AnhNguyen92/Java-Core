package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1576
 */
public class ReplaceAllstoAvoidConsecutiveRepeatingCharacters {
	public String modifyString(String s) {
		char[] cs = s.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] != '?')
				continue;
			char left = (i == 0) ? ' ' : cs[i - 1];
			char right = (i == cs.length - 1) ? ' ' : cs[i + 1];
			if (left != 'a' && right != 'a') {
				cs[i] = 'a';
			} else if (left == 'a') {
				if (right == ' ' || Math.abs(right - 'c') > 1) {
					cs[i] = 'c';
				} else {
					cs[i] = 'f';
				}
			} else if (right == 'a') {
				if (left == ' ' || Math.abs(left - 'c') > 1) {
					cs[i] = 'c';
				} else {
					cs[i] = 'f';
				}
			}
		}
		return new String(cs);
	}

	public String modifyString1(String s) {
		StringBuilder sb = new StringBuilder(s);
		while (sb.indexOf("?") >= 0) {
			int index = sb.indexOf("?");
			if (index == 0) {
				if (sb.length() == 1) {
					sb.replace(0, 1, "a");
				} else {
					if (sb.charAt(1) == 'a') {
						sb.replace(0, 1, "b");
					} else {
						sb.replace(0, 1, "a");
					}
				}
			} else if (index == s.length() - 1) {
				if (sb.charAt(index - 1) == 'a') {
					sb.replace(index, index + 1, "b");
				} else {
					sb.replace(index, index + 1, "a");
				}
			} else {
				char c1 = sb.charAt(index + 1);
				char c2 = sb.charAt(index - 1);
				String abc = "abc";

				sb.replace(index, index + 1, abc.replace("" + c1, "").replace("" + c2, "").substring(0, 1));
			}
		}
		return sb.toString();
	}
}
