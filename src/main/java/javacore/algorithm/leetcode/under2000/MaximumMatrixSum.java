package javacore.algorithm.leetcode.under2000;

import java.util.PriorityQueue;

/**
 * 1975. Maximum Matrix Sum
 */
public class MaximumMatrixSum {
    public long maxMatrixSum(int[][] matrix) {
        long ans = 0;
        int count = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((b, a) -> Integer.compare(Math.abs(a), Math.abs(b)));
        for (int[] arr : matrix) {
            for (int i : arr) {
                if (i <= 0) {
                    count++;
                }
                minHeap.offer(i);
                if (minHeap.size() > 1)
                    ans += Math.abs(minHeap.poll());
            }
        }
        if (count % 2 == 1) {
            ans += Math.abs(minHeap.poll()) * -1;
        } else {
            ans += Math.abs(minHeap.poll());
        }
        return ans;
    }
}
