package javacore.algorithm.leetcode.under3200;

import java.util.HashMap;
import java.util.Map;

/**
 * 3160. Find the Number of Distinct Colors Among the Balls
 */
public class FindTheNumberOfDistinctColorsAmongTheBalls {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> counter = new HashMap<>();
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Integer x = map.get(queries[i][0]);
            if (x != null) {
                if (counter.get(x) <= 1) {
                    counter.remove(x);
                } else {
                    counter.merge(x, -1, Integer::sum);
                }
            }
            map.put(queries[i][0], queries[i][1]);
            counter.merge(queries[i][1], 1, Integer::sum);

            ans[i] = counter.keySet().size();
        }

        return ans;
    }
}
