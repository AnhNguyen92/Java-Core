package javacore.algorithm.leetcode.under1800;

import java.util.HashMap;
import java.util.Map;

/**
 * 1726. Tuple with Same Product
 */
public class TupleWithSameProduct {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                counter.merge(nums[i] * nums[j], 1, Integer::sum);
            }
        }
        for (int i : counter.values()) {
            ans += i * (i - 1);
        }
        return ans * 4;
    }
}
