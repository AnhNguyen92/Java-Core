package javacore.algorithm.leetcode.under2900;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2869. Minimum Operations to Collect Elements
 */
public class MinimumOperationsToCollectElements {
    public int minOperations(List<Integer> nums, int k) {
        int x;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = nums.size() - 1; i >= 0; i--) {
            x = nums.get(i);
            if (x <= k) {
                map.put(x, 1);
            }
            if (map.size() == k) {
                return nums.size() - i;
            }
        }
        return k;
    }
}
