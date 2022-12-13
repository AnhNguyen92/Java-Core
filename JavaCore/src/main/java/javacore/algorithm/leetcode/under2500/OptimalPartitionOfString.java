package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2405. Optimal Partition of String
 */
public class OptimalPartitionOfString {
	public int partitionString(String s) {
		boolean present[] = new boolean[26];
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!present[ch - 'a']) {
				// set the value as true for characters which is present in current substring
				present[ch - 'a'] = true;
			} else {
				// if not present start a new substring
				present = new boolean[26];
				present[ch - 'a'] = true;
				count++;
			}
		}
		return count;
	}
}
