package javacore.algorithm.leetcode.under0200;

/*
 * LeetCode 136. Single Number
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
