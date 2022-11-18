package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2149. Rearrange Array Elements by Sign
 */
public class RearrangeArrayElementsBySign {

	public int[] rearrangeArray(int[] nums) {
		int[] arr = new int[nums.length];
		int start = 0;
		int end = nums.length - 1;
		for (int i : nums) {
			if (i > 0) {
				arr[start++] = i;
			} else {
				arr[end--] = i;
			}
		}
		start = 0;
		end = nums.length - 1;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				nums[i] = arr[start++];
			} else {
				nums[i] = arr[end--];
			}
		}
		return nums;
	}

}
