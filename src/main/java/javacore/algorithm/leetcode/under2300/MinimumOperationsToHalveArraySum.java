package javacore.algorithm.leetcode.under2300;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 2208. Minimum Operations to Halve Array Sum
 */
public class MinimumOperationsToHalveArraySum {
    public int halveArray(int[] nums) {
        double sum = 0.0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) {
            sum += n;
            pq.offer((double) n);
        }
        double half = 0.0;
        int cnt = 0;
        while (sum - 2 * half > 0.0) {
            double a = pq.poll();
            half += a / 2;
            pq.offer(a / 2);
            cnt++;
        }
        return cnt;
    }
}
