package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1446. Consecutive Characters
 */
public class ConsecutiveCharacters {
	public int maxPower(String s) {
		int count = 0;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != 0) {
				if (s.charAt(i - 1) == s.charAt(i)) {
					count++;
				} else {
					count = 1;
				}
			} else {
				count++;
			}
			if (max < count)
				max = count;
		}
		return max;
	}
}
