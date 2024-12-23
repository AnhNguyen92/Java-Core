package javacore.algorithm.leetcode.under1300;

import java.util.Collections;
import java.util.TreeMap;

/**
 * 1296. Divide Array in Sets of K Consecutive Numbers
 */
public class DivideArrayInSetsOfKConsecutiveNumbers {
    public boolean isPossibleDivide(int[] nums, int k) {
        if (nums.length % k != 0)
            return false;
        int len = nums.length / k;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : nums)
            map.merge(i, 1, Integer::sum);
        if (Collections.max(map.values()) > len)
            return false;
        for (int i = 0; i < len;) {
            int a = map.firstKey();
            int freq = map.get(a);
            map.remove(a);
            for (int j = 1; j < k; j++) {
                if (map.get(a + j) == null || map.get(a+j) < freq)
                    return false;
                if (map.get(a+j) == freq)
                    map.remove(a+j);
                else
                    map.merge(a+j, -freq, Integer::sum);
            }
            i += freq;
        }
        return true;
    }
}
