package javacore.algorithm.leetcode.under0051;

/*
 * LeetCode 45. Jump Game II
 */
public class JumpGameII {
	public int jump(int[] nums) {
		if (nums.length == 1)
			return 0;
		int[] arr = new int[nums.length];
		int max = Integer.MAX_VALUE;
		int lastIndex = nums.length - 1;
		int i = nums.length - 1;
		while (i >= 0) {
			if (nums[i] == 0) {
				arr[i] = max;
			} else if (i + nums[i] >= lastIndex) {
				arr[i] = 1;
			} else {
				int min = max;
				for (int j = i + nums[i]; j > i; j--) {
					min = Math.min(min, arr[j]);
				}
				if (min < max) {
					arr[i] = min + 1;
				} else {
					arr[i] = max;
				}

			}
			i--;
		}
		return arr[0];
	}
}
