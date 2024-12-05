package javacore.algorithm.leetcode.under2900;

import java.util.HashMap;
import java.util.Map;

/**
 * 2870. Minimum Number of Operations to Make Array Empty
 */
public class MinimumNumberOfOperationsToMakeArrayEmpty {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int ans = 0;
        for (int i : map.values()) {
            if (i == 1) {
                return -1;
            }
            ans += i / 3;
            if (i % 3 != 0) ans++;
        }
        return ans;
    }
}
