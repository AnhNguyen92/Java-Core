package javacore.algorithm.leetcode.under2900;

import java.util.*;

/**
 * 2815. Max Pair Sum in an Array
 */
public class MaxPairSumInANArray {
    public int maxSum(int[] nums) {
        int max = -1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int maxDigit = maxDigit(num);
            List<Integer> lst = map.getOrDefault(maxDigit, new ArrayList<>());
            lst.add(num);
            map.put(maxDigit, lst);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> lst = entry.getValue();
            if (lst.size() > 1) {
                lst.sort(Collections.reverseOrder());
                max = Math.max(lst.get(0) + lst.get(1), max);
            }
        }
        return max;
    }

    public int maxDigit(int a) {
        int max = 0;
        while (a > 0) {
            max = Math.max(a % 10, max);
            a/= 10;
        }
        return max;
    }
}
