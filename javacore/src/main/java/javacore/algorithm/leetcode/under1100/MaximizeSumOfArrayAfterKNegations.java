package javacore.algorithm.leetcode.under1100;

import java.util.Arrays;

/*
 * LeetCode 1005
 */
public class MaximizeSumOfArrayAfterKNegations {
	public int largestSumAfterKNegations(int[] arr, int k) {
        Arrays.sort(arr);
        int i = 0;
        while (i < arr.length && k > 0 && arr[i] < 0) {
            arr[i] = 0 - arr[i];
            k--;
            i++;
        }
        if (k > 0 && k % 2 == 1) {
            Arrays.sort(arr);
            arr[0] = 0 - arr[0];
        }
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        return sum;
    }
}
