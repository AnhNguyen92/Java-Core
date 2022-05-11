package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;

/*
 * LeetCode 260
 */
public class SingleNumberIII {
	public int[] singleNumber(int[] nums) {
		Arrays.sort(nums);
		int[] ans = new int[2];
		int index = 0;
		if (nums[0] != nums[1]) {
			ans[index++] = nums[0];
		}
		if (nums[nums.length - 1] != nums[nums.length - 2]) {
			ans[index++] = nums[nums.length - 1];
		}
		for (int i = 1; i < nums.length - 1; i++) {
			if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
				ans[index++] = nums[i];
			}
		}
		return ans;
	}

	public int[] singleNumber2(int[] nums) {
		int bitwise = 0;

		for (int num : nums) {
			bitwise ^= num;
		}

		int diff = 0;
		for (int i = 0; i < 32; i++) {
			if (((bitwise >> i) & 1) == 1) {
				diff = (1 << i);
				break;
			}
		}

		int[] result = new int[2];
		for (int num : nums) {
			if ((diff & num) != 0) {
				result[0] ^= num;
			} else
				result[1] ^= num;
		}
		return result;
	}
}
