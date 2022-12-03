package javacore.algorithm.leetcode.under0500;

/*
 * LeetCode 402. Remove K Digits
 */
public class RemoveKDigits {

	public String removeKdigits(String num, int k) {
		StringBuilder sb = new StringBuilder(num);
		if (sb.length() == k)
			return "0";
		int i = 0;
		while (i < sb.length() && k > 0) {
			if (i < sb.length() - 1 && sb.charAt(i) - sb.charAt(i + 1) > 0) {
				sb.deleteCharAt(i);
				k--;
				if (i > 0) {
					i--;
				}
			} else {
				i++;
			}
		}
		if (k > 0) {
            i = sb.length();
			sb.delete(i - k, i);
		}
		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}
}
