package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2121. Intervals Between Identical Elements
 */
public class IntervalsBetweenIdenticalElements {
    public long[] getDistances(int[] arr) {
        long[] ans = new long[arr.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> position = map.getOrDefault(arr[i], new ArrayList<>());
            position.add(i);
            map.put(arr[i], position);
        }
        for (int k : map.keySet()) {
            List<Integer> pos = map.get(k);
            long sum = 0L;
            for (int x : pos) {
                sum += x;
            }
            long prev = 0L;
            int n = pos.size();
            for (int i = 0; i < n; i++) {
                int x = pos.get(i);
                ans[x] = sum - 2L * prev - x * (n - 2L * i);
                prev += x;
            }
        }
        return ans;
    }
}
