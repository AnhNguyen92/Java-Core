package javacore.algorithm.leetcode.under0500;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. Number of Boomerangs
 */
public class NumberOfBoomerangs {
    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        if (n < 3) return 0;
        int ans = 0;
        Map<int[], Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int[] a = points[i];
            if (i > 0)
                map.remove(points[i - 1]);
            for (int j = i + 1; j < n; j++) {
                int[] b = points[j];
                int distance = (int) Math.pow(a[0] - b[0], 2) + (int) Math.pow(a[1] - b[1], 2);
                Map<Integer, Integer> distanceMap = map.getOrDefault(a, new HashMap<>());
                int count = distanceMap.getOrDefault(distance, 0);
                distanceMap.put(distance, count + 1);
                map.put(a, distanceMap);

                distanceMap = map.getOrDefault(b, new HashMap<>());
                count = distanceMap.getOrDefault(distance, 0);
                distanceMap.put(distance, count + 1);
                map.put(b, distanceMap);
            }
            Map<Integer, Integer> m = map.get(a);
            if (m != null)
                for (Integer d : m.values()) {
                    if (d >= 2) {
                        ans += d * (d - 1);
                    }
                }
        }
        return ans;
    }
}
