package javacore.algorithm.leetcode.under0800;

import java.util.PriorityQueue;

/**
 * 786. K-th Smallest Prime Fraction
 */
public class KthSmallestPrimeFraction {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> (a[0] * b[1] - a[1] * b[0]));
        int n = arr.length;
        minHeap.offer(new int[]{0, n - 1});
        for (int j : arr) {
            for (int value : arr) {
                minHeap.offer(new int[]{j, value});
            }
        }
        while (k-- > 0) {
            minHeap.poll();
        }
        return minHeap.poll();
    }
}
