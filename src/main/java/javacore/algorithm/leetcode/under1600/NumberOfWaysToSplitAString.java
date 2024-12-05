package javacore.algorithm.leetcode.under1600;

import java.util.HashMap;
import java.util.Map;

/*
 * 1573. Number of Ways to Split a String
 */
public class NumberOfWaysToSplitAString {
    public int numWays(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                sum++;
                map.put(sum, i);
            }
        }
        if (sum == 0) {
            return (int) (countWaysToSplit(s.length()) % 1000000007L);
        }
        if (sum % 3 != 0) {
            return 0;
        }
        int start1 = map.get(sum/3);
        int end1 = map.get(sum/3 + 1);
        int start2 = map.get(2 * sum/3);
        int end2 = map.get(2 * sum/3 + 1);
        return (int) ((long) (end1 - start1) * (end2 - start2) % 1000000007L);
    }

    public long binomialCoefficient(int n, int k) {
        if (k > n) return 0L;
        if (k == 0 || k == n) return 1L;
        long result = 1L;
        for (int i = 0; i < k; i++) {
            result = result * (n - i) / (i + 1);
        }
        return result;
    }

    public long countWaysToSplit(int n) {
        if (n < 3) return 0;
        return binomialCoefficient(n - 1, 2);
    }
}
