package javacore.algorithm.leetcode.under1300;

/*
 * LeetCode 1209
 */
public class RemoveAllAdjacentDuplicatesInStringII {
	public String removeDuplicates(String s, int k) {
		StringBuilder sb = new StringBuilder(s);
		int count = 0;
		int i = 0;
		while (i < sb.length()) {
			if (count != 0 && sb.charAt(i - 1) == sb.charAt(i)) {
				count++;
				i++;
				if (count == k) {
					sb.delete(i - k, i);
					count = 0;
					i = updateIndex(k, sb, i);
				}
			} else {
				count = 1;
				i++;
			}
		}
		return sb.toString();
	}

	private int updateIndex(int k, StringBuilder sb, int i) {
		i = (i > k) ? (i - k - 1) : 0;
		while (i > 0 && sb.charAt(i - 1) == sb.charAt(i)) {
			i--;
		}
		return i;
	}
}
