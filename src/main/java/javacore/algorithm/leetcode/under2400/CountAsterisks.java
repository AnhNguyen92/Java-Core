package javacore.algorithm.leetcode.under2400;

/*
 * LeetCode 2315. Count Asterisks
 */
public class CountAsterisks {
	public int countAsterisks(String s) {
		int count = 0;
		int vertical = 0;
		for (char c : s.toCharArray()) {
			if (c == '*' && vertical % 2 == 0) {
				count++;
			}
			if (c == '|') {
				vertical++;
			}
		}
		return count;
	}
}
