package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1689
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
}
