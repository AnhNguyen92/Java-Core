package javacore.algorithm.leetcode.under2200;

import java.util.Arrays;

/*
 * LeetCode 2164. Sort Even and Odd Indices Independently
 */
public class SortEvenAndOddIndicesIndependently {
	public int[] sortEvenOdd(int[] nums) {
		int[] even = new int[(nums.length+1)/2];
        int[] odd = new int[nums.length/2];
        for (int i = 0; i < nums.length; i += 2) {
            even[i/2] = nums[i];
        }
        for (int i = 1; i < nums.length; i += 2) {
            odd[i/2] = nums[i];
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        for (int i = 0; i < nums.length; i += 2) {
            nums[i] = even[i/2];
        }
        for (int i = 1; i < nums.length; i += 2) {
            nums[i] = odd[odd.length - 1 - i/2];
        }
        return nums;
	}
}
