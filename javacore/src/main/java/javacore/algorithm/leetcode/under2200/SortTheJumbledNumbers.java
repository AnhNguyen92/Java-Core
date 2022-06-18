package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

public class SortTheJumbledNumbers {
	public int[] sortJumbled(int[] mapping, int[] nums) {
		int[][] arr = new int[nums.length][2];
		for (int i = 0; i < arr.length; i++) {
			arr[i][0] = build(mapping, nums[i]);
			arr[i][1] = nums[i];
		}
		Arrays.sort(arr, (a, b) -> {
			if (a[0] != b[0])
				return a[0] - b[0];
			return 1;
		});
		for (int i = 0; i < arr.length; i++) {
			nums[i] = arr[i][1];
		}
		return nums;
    }
    
    private int build(int[] mapping, int i) {
		char[] arr = String.valueOf(i).toCharArray();
		int ans = 0;
		for (char c : arr) {
			ans = ans * 10 + mapping[c - '0'];
		}
		return ans;
	}
}
