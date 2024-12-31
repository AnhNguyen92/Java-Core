package javacore.algorithm.leetcode.under1800;

/**
 * 1701. Average Waiting Time
 */
public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        long total = 0;
        int available = 0;
        for (int[] arr : customers) {
            if (available > arr[0]) {
                total += available - arr[0];
            } else {
                available = arr[0];
            }
            available += arr[1];
            total += arr[1];
        }
        return (double) total / customers.length;
    }
}
