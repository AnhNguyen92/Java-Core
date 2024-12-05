package javacore.algorithm.leetcode.under1100;

/**
 * 1094. Car Pooling
 */
public class CarPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr = new int[1001];
        for (int[] trip : trips) {
            if (trip[0] > capacity) {
                return false;
            }
            arr[trip[1]] += trip[0];
            arr[trip[2]] -= trip[0];
        }
        if (arr[0] > capacity) {
            return false;
        }
        for (int i = 1; i < 1001; i++) {
            arr[i] += arr[i-1];
            if (arr[i] > capacity)
                return false;
        }
        return true;
    }
}
