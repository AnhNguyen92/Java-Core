package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 14
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		String prefix = "";
		int i = 0;
		if (strs.length == 0 || strs[0].length() == 0) {
			return prefix;
		}
		int minLength = getMinlength(strs);
		while ((i < minLength) && hasSameChar(strs, i)) {
			prefix += strs[0].charAt(i);
			i++;
		}

		return prefix;
	}

	private boolean hasSameChar(String[] strs, int position) {
		boolean hasCommonPrefix = true;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].charAt(position) != strs[0].charAt(position))
				hasCommonPrefix = false;
		}

		return hasCommonPrefix;
	}

	private int getMinlength(String[] strs) {
		int minLength = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minLength) {
				minLength = strs[i].length();
			}
		}

		return minLength;
	}
}
