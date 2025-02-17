package javacore.algorithm.leetcode.under3100;

import java.util.PriorityQueue;

/**
 * 3066. Minimum Operations to Exceed Threshold Value II
 */
public class MinimumOperationsToExceedThresholdValueII {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int n : nums)
            pq.offer((long) n);
        int cnt = 0;
        while (pq.peek() < k) {
            pq.offer(pq.poll() * 2 + pq.poll());
            cnt++;
        }
        return cnt;
    }
}
