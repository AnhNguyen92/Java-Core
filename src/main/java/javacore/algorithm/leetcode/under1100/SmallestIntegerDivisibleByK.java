package javacore.algorithm.leetcode.under1100;

import java.util.HashMap;
import java.util.Map;

/**
 * 1015. Smallest Integer Divisible by K
 */
public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;
        int count = 1;
        int r = 1 % k;
        Map<Integer, Integer> map = new HashMap<>();
        while (r != 0) {
            if (map.get(r) != null)
                return -1;
            map.put(r, 1);
            count++;
            r = (r * 10 + 1) % k;
        }
        return count;
    }
}
