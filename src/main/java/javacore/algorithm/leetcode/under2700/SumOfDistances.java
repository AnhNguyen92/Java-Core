package javacore.algorithm.leetcode.under2700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2615. Sum of Distances
 */
public class SumOfDistances {
    public long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> position = map.getOrDefault(nums[i], new ArrayList<>());
            position.add(i);
            map.put(nums[i], position);
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
