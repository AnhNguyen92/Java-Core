package javacore.algorithm.leetcode.under2000;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1512
*/

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int sum = 0;
        for (Integer v : map.values()) {
            int count = v * (v-1);
            sum += count/2;
        }
        return sum;
    }
    
}