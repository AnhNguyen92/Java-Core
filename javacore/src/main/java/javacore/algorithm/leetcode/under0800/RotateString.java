package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 796
 */
public class RotateString {
	public boolean rotateString(String a, String b) {
		if (a.length() != b.length())
			return false;
		if (a.equals(b))
			return true;
		int i = 0;
		char c = b.charAt(0);
		int len = a.length();
		while (i < len && a.indexOf(c, i) >= 0) {
			int index = a.indexOf(c, i);
			String left = a.substring(index, len);
			String right = (index > 0) ? a.substring(0, index) : "";
			String test = left + right;
			if (test.equals(b)) {
				return true;
			}
			i = index + 1;
		}

		return false;
	}
}
