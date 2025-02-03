package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;

/**
 * 1968. Array With Elements Not Equal to Average of Neighbors
 */
public class ArrayWithElementsNotEqualToAverageOfNeighbors {
    public int[] rearrangeArray(int[] nums) {
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
