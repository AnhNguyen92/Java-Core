package javacore.algorithm.leetcode.under0100;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 96. Unique Binary Search Trees
 */
public class UniqueBinarySearchTrees {
    Map<Integer, Integer> map = new HashMap<>();

    public int numTrees(int n) {
        map.put(0,1);
        map.put(1,1);
        map.put(2, 2);
        return calculate(n);
    }

    private int calculate(int n) {
        if (map.get(n) == null) {
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                ans += calculate(i-1) * calculate(n-i);
            }
            map.put(n, ans);
        }
        return map.get(n);
    }
}
