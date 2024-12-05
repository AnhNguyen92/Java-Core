package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 14. Longest Common Prefix
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder prefix = new StringBuilder();
		int i = 0;
		if (strs.length == 0 || strs[0].isEmpty()) {
			return prefix.toString();
		}
		int minLength = getMinlength(strs);
		while ((i < minLength) && hasSameChar(strs, i)) {
			prefix.append(strs[0].charAt(i));
			i++;
		}

		return prefix.toString();
	}

	private boolean hasSameChar(String[] strs, int position) {
        for (String str : strs) {
            if (str.charAt(position) != strs[0].charAt(position)) {
                return false;
            }
        }

		return true;
	}

	private int getMinlength(String[] strs) {
		int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

		return minLength;
	}
}
