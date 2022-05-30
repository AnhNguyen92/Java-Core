package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1374
 */
public class GenerateAStringWithCharactersThatHaveOddCounts {
	public String generateTheString(int n) {
		StringBuilder sb = new StringBuilder("");
		int size = (n % 2 == 0) ? (n - 1) : n;
		for (int i = 1; i <= size; i++) {
			sb.append("a");
		}
		if (n % 2 == 0)
			sb.append("b");
		return sb.toString();
	}
}
