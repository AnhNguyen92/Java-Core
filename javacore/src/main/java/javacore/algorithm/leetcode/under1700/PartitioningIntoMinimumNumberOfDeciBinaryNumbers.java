package javacore.algorithm.leetcode.under1700;

import java.util.Arrays;

/*
 * LeetCode 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
	public int minPartitions(String n) {
		char[] carr = n.toCharArray();
		char maxdigit = '0';
		for (char c : carr)
			if (c > maxdigit)
				maxdigit = c;
		return maxdigit - '0';
	}

	public int minPartitions1(String n) {
		return n.chars().max().getAsInt() - '0';
	}

	public int minPartitions2(String n) {
		char[] crr = n.toCharArray();
		Arrays.sort(crr);
		return crr[crr.length - 1] - '0';
	}

	public int minPartitions3(String n) {
		for (int i = 9; i >= 1; i--) {
			if (n.indexOf((char) (i + '0')) >= 0) {
				return i;
			}
		}
		return 0;
	}
}
