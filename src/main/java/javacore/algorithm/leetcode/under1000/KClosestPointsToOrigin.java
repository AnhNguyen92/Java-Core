package javacore.algorithm.leetcode.under1000;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 973. K Closest Points to Origin
 */
public class KClosestPointsToOrigin {
	public int[][] kClosest(int[][] points, int k) {
        Map<int[], Integer> map = new HashMap<>();
        int distance;
        for (int[] arr : points) {
            distance = (int) arr[0] * arr[0] + arr[1] * arr[1];
            map.put(arr, distance);
        }
        Map<int[], Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        int[][] arr = new int[k][2];
        int idx = 0;
        for (int[] v : sortedMap.keySet()) {
            if (idx == k) {
                break;
            }
            arr[idx++] = v;
        }
        return arr;
    }
}
