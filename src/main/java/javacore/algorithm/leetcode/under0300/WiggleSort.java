package javacore.algorithm.leetcode.under0300;

import java.util.Arrays;

/**
 * 280. Wiggle Sort
 * PRIME
 */
public class WiggleSort {
    public int[] wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] arr = new int[n];

        int idx = 0;
        for (int i = n-1; i >= 0 && idx < n; i--, idx += 2) {
            arr[idx] = nums[i];
        }
        idx = 1;
        for (int i = 0; i < n && idx < n; i++, idx += 2) {
            arr[idx] = nums[i];
        }
        return arr;
    }
}
