package javacore.algorithm.leetcode.under1500;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 1481. Least Number of Unique Integers after K Removals
 */
public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr)
            map.merge(i, 1, Integer::sum);

        PriorityQueue<Integer> pq = new PriorityQueue<>(map.values());
        while (!map.isEmpty() && k > 0) {
            int a = pq.poll();
            if (k > a)
                k -= a;
            else {
                if (a > k)
                    pq.offer(k - a);
                k = 0;
            }
        }
        return pq.size();
    }
}
