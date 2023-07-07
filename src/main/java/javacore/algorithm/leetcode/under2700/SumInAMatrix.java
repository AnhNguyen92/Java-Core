package javacore.algorithm.leetcode.under2700;

import java.util.Arrays;

/*
 * LeetCode 2679. Sum in a Matrix
 */
public class SumInAMatrix {
    public int matrixSum(int[][] nums) {
        int sum = 0;
        int max;
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }
        for (int j = 0; j < nums[0].length; j++) {
            max = 0;
            for (int i = 0; i < nums.length; i++) {
                max = Math.max(max, nums[i][j]);
            }
            sum += max;
        }
        return sum;
    }
}
