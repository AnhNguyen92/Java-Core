package javacore.algorithm.leetcode.under0700;

import java.util.HashMap;
import java.util.Map;

/**
 * 677. Map Sum Pairs
 */
public class MapSumPairs {
    class MapSum {
        Map<String, Integer> map;
        public MapSum() {
            map = new HashMap<>();
        }

        public void insert(String key, int val) {
            map.put(key, val);
        }

        public int sum(String prefix) {
            int sum = 0;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getKey().startsWith(prefix)) {
                    sum += entry.getValue();
                }
            }
            return sum;
        }
    }

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
}
