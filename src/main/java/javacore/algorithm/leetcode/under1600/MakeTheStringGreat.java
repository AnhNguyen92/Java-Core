package javacore.algorithm.leetcode.under1600;

/*
 * LeetCode 1544. Make The String Great
 */
public class MakeTheStringGreat {
	public String makeGood(String s) {
		StringBuilder sb = new StringBuilder(s);
		int i = sb.length() - 1;
		while (i >= 1) {
			if ((i >= 0) && (i + 1 < sb.length()) && (Math.abs(sb.charAt(i) - sb.charAt(i + 1)) == 32)) {
				sb.delete(i, i + 2);
			} else if ((i < sb.length()) && (i - 1 >= 0) && (Math.abs(sb.charAt(i) - sb.charAt(i - 1)) == 32)) {
				sb.delete(i - 1, i + 1);
			}
			i--;
		}
		return sb.toString();
	}
}
