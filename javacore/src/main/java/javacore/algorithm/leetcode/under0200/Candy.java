package javacore.algorithm.leetcode.under0200;

import java.util.Arrays;

/*
 * LeetCode 135
 */
public class Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
		int[] arr = new int[n];
		Arrays.fill(arr, 1);
		for (int i = 1; i < n; i++) {
			if (ratings[i] > ratings[i - 1] && arr[i] <= arr[i - 1]) {
				arr[i] = arr[i - 1] + 1;
			}
		}
		int count = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1] && arr[i] <= arr[i + 1]) {
				arr[i] = arr[i + 1] + 1;
			}
			count += arr[i];
		}
        
        return count;
    }
}
