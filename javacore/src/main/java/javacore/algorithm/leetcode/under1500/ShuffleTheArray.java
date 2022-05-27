package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1470
 */
public class ShuffleTheArray {
	public int[] shuffle(int[] nums, int n) {
		int[] shuffle = new int[nums.length];
		int i = 0;
		int j = n;
		for (int k = 0; k < nums.length; k++) {
			if (k % 2 == 0) {
				shuffle[k] = nums[i++];
			} else {
				shuffle[k] = nums[j++];
			}
		}
		return shuffle;
	}
}
