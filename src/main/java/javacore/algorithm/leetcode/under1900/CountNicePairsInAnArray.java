package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.Map;

/**
 * 1814. Count Nice Pairs in an Array
 */
public class CountNicePairsInAnArray {
    public int countNicePairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;
        for (int num : nums) {
            int rev = reverse(num);
            int prev = map.getOrDefault(num - rev, 0);
            count += prev;
            map.put(num - rev, prev + 1);
        }
        return (int) (count % 1000000007);
    }

    private int reverse(int n) {
        int x = 0;
        while (n > 0) {
            x = x * 10 + n % 10;
            n /= 10;
        }
        return x;
    }
}
