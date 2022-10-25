package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 34
 */
public class FindFirstAndLastPositionOfElementInSortedArray {
	public int[] searchRange(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int[] ans = new int[] { -1, -1 };
		int count = 0;
		for (int i = start; i <= end; i++) {
			if (nums[i] == target) {
				if (count == 0) {
					count = 1;
					ans[0] = i;
					ans[1] = i;
				} else {
					ans[1] = i;
				}
			}
		}
		return ans;
	}
}
