package javacore.algorithm.leetcode.under1300;

import java.util.Arrays;

/**
 * 1288. Remove Covered Intervals
 */
public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] arr) {
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        int count = arr.length;
        int a = arr[0][0];
        int b = arr[0][1];
        for (int i = 1; i < arr.length; i++) {
            if (b >= arr[i][1]) {
                count--;
            } else if (a == arr[i][0] && b <= arr[i][1]) {
                count--;
                b = arr[i][1];
            } else {
                a = arr[i][0];
                b = arr[i][1];
            }
        }
        return count;
    }
}
