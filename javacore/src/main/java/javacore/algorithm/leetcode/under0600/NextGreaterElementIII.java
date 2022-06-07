package javacore.algorithm.leetcode.under0600;

import java.util.Arrays;

/*
 * LeetCode 556
 */
public class NextGreaterElementIII {
	public int nextGreaterElement(int n) {
		int[] arr = getNumsArr(n);
		boolean isValid = nextPermutation(arr);
		if (isValid) {
			long ans = 0;
			for (int i : arr) {
				ans = ans * 10 + i;
			}
			if (ans <= 2147483647l)
				return (int) ans;
		}

		return -1;
	}

	private int[] getNumsArr(int n) {
		String num = String.valueOf(n);
		int len = num.length();
		int[] nums = new int[len];
		int index = 0;
		for (char ch : num.toCharArray()) {
			nums[index++] = ch - '0';
		}
		return nums;
	}

	public boolean nextPermutation(int[] nums) {
		boolean found = false;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (!found) {
				int min = 101;
				int idx = i;
				for (int j = i + 1; j <= nums.length - 1; j++) {
					if (nums[j] > nums[i] && nums[j] < min) {
						min = nums[j];
						idx = j;
						found = true;
					}
				}
				if (found) {
					int temp = nums[i];
					nums[i] = nums[idx];
					nums[idx] = temp;
					Arrays.sort(nums, i + 1, nums.length);
				}
			}
		}
		return found;
	}
}
