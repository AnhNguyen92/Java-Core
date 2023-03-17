package javacore.algorithm.leetcode.under1100;

import java.util.Arrays;

/*
 * LeetCode 1029. Two City Scheduling
 */
public class TwoCityScheduling {

    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        int[] refund = new int[n];
        int cost = 0;
        for (int i = 0; i < n; i++) {
            cost += costs[i][0];
            refund[i] = costs[i][0] - costs[i][1];
        }
        Arrays.sort(refund);
        for (int i = 0; i < n / 2; i++) {
            cost -= refund[n - i - 1];
        }
        return cost;
    }
}
