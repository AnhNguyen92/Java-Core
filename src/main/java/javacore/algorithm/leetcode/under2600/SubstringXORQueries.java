package javacore.algorithm.leetcode.under2600;

import java.util.HashMap;
import java.util.Map;

/**
 * 2564. Substring XOR Queries
 */
public class SubstringXORQueries {
    public int[][] substringXorQueries(String s, int[][] queries) {
        int[][] ans = new int[queries.length][2];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= Math.min(i + 31, s.length()); j++) {
                String sub = s.substring(i, j);
                if (!map.containsKey(sub)) {
                    map.put(sub, i);
                }
            }
        }
        for (int i = 0; i < queries.length; i++) {
            ans[i] = new int[] {-1,-1};
            int val = queries[i][1] ^ queries[i][0];
            String binary = Integer.toBinaryString(val);
            int idx = map.getOrDefault(binary, -1);
            if (idx >= 0) {
                ans[i][0] = idx;
                ans[i][1] = idx + binary.length() - 1;
            }
        }
        return ans;
    }
}
