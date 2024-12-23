package javacore.algorithm.leetcode.under0900;

import java.util.Collections;
import java.util.TreeMap;

/**
 * 846. Hand of Straights
 */
public class HandOfStraights {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        int len = hand.length / groupSize;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : hand)
            map.merge(i, 1, Integer::sum);
        if (Collections.max(map.values()) > len)
            return false;
        for (int i = 0; i < len;) {
            int a = map.firstKey();
            int freq = map.get(a);
            map.remove(a);
            for (int j = 1; j < groupSize; j++) {
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
