package javacore.algorithm.leetcode.under1000;

/*
 * LeetCode 922. Sort Array By Parity II
 */
public class SortArrayByParityII {
	public int[] sortArrayByParityII(int[] nums) {
		int len = nums.length;
		int[] val = new int[nums.length];
		int even = 0;
		int odd = 1;

		for (int i = 0; i < len; i++) {
			if ((nums[i] & 1) == 0) {
				val[even] = nums[i];
				even += 2;
			} else {
				val[odd] = nums[i];
				odd += 2;
			}
		}

		return val;
	}
}
