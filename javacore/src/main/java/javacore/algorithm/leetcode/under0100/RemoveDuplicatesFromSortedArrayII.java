package javacore.algorithm.leetcode.under0100;

/*
 * LeetCode 80
 */
public class RemoveDuplicatesFromSortedArrayII {
	public int removeDuplicates(int[] nums) {
		int k = nums.length;
		for (int i = 0; i < nums.length - 2 && i < k;i++) {
			while (nums[i] == nums[i + 2]) {
				for (int j = i + 2; j < nums.length - 1; j++) {
					nums[j] = nums[j + 1];
				}
				nums[k - 1] = 10001 + k;
				k--;
			}
		}
		return k;
	}
}
