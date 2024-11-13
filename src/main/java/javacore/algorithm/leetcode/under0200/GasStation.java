package javacore.algorithm.leetcode.under0200;

/**
 * 134. Gas Station
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int tank = 0;
        int idx = 0;
        for (int i = 0; i < n; i++) {
            tank += gas[i] - cost[i];
            if (gas[i] < cost[i] && tank < 0)
                idx = i+1;
        }
        return tank < 0 ? -1 : idx;
    }
}
