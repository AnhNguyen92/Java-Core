package javacore.algorithm.leetcode.under3000;

import java.util.Arrays;

/**
 * 2966. Divide Array Into Arrays With Max Difference
 */
public class DivideArrayIntoArraysWithMaxDifference {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] arr = new int[nums.length / 3][3];
        for (int i = 0; i <= nums.length - 3; i += 3) {
            if (nums[i + 2] - nums[i] > k) return new int[][]{};
            arr[i / 3][0] = nums[i];
            arr[i / 3][1] = nums[i + 1];
            arr[i / 3][2] = nums[i + 2];
        }
        return arr;
    }
}
