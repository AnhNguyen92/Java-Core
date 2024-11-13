package javacore.algorithm.leetcode.under0700;

import java.util.List;

/**
 * 624. Maximum Distance in Arrays
 */
public class MaximumDistanceInArrays {
    public int maxDistance(List<List<Integer>> arrays) {
        List<Integer> first = arrays.get(0);
        int min = first.get(0);
        int max = first.get(first.size() - 1);
        int firstElm, lastElm, maxDistance = 0;
        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> item = arrays.get(i);
            firstElm = item.get(0);
            lastElm = item.get(item.size() - 1);

            maxDistance = Math.max(maxDistance, Math.max(Math.abs(max - firstElm), Math.abs(lastElm - min)));
            min = Math.min(min, firstElm);
            max = Math.max(max, lastElm);
        }
        return maxDistance;
    }
}
