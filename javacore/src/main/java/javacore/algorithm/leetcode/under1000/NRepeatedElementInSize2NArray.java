package javacore.algorithm.leetcode.under1000;

/*
 * Leetcode 961. N-Repeated Element in Size 2N Array
 */
public class NRepeatedElementInSize2NArray {
	public int repeatedNTimes(int[] nums) {
		int[] arr = new int[10000];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i]]++;
			if (arr[nums[i]] == 2)
				return nums[i];
		}
		return nums[0];
	}
}
