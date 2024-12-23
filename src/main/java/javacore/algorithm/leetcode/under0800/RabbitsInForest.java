package javacore.algorithm.leetcode.under0800;

import java.util.HashMap;
import java.util.Map;

/**
 * 781. Rabbits in Forest
 */
public class RabbitsInForest {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : answers) {
            map.merge(i+1, 1, Integer::sum);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int idx = entry.getKey();
            int count = entry.getValue();
            if (count <= idx) {
                ans += idx;
            } else {
                ans += count / idx * idx;
                if (count % idx > 0) ans += idx;
            }
        }
        return ans;
    }
}
