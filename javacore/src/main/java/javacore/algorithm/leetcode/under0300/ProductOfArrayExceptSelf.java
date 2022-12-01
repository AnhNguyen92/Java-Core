package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;

/*
 * Leet code 238. Product of Array Except Self
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);
        for (int i = 1; i < nums.length; i++) {
            arr[i] = arr[i - 1] * nums[i-1];
        }
        int l = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            l *= nums[i+1];
            arr[i] *= l;
        }
        
        return arr;
    }
}
