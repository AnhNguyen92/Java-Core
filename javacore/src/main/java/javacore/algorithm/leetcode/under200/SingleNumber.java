package javacore.algorithm.leetcode.under200;

/*
 * LeetCode 136
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
		int single = 0;
		for (int num : nums) {
			single ^= num;
		}
		return single;
	}
}
