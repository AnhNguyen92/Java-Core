package javacore.algorithm.leetcode.under1800;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1743. Restore the Array From Adjacent Pairs
 */
public class RestoreTheArrayFromAdjacentPairs {
    public int[] restoreArray(int[][] adjacentPairs) {
        int[] ans = new int[adjacentPairs.length + 1];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] arr : adjacentPairs) {
            List<Integer> lst1 = map.getOrDefault(arr[0], new ArrayList<>());
            lst1.add(arr[1]);
            map.put(arr[0], lst1);
            List<Integer> lst2 = map.getOrDefault(arr[1], new ArrayList<>());
            lst2.add(arr[0]);
            map.put(arr[1], lst2);
        }
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            if (entry.getValue().size() == 1) {
                ans[0] = entry.getKey();
                ans[1] = entry.getValue().get(0);
                break;
            }
        }
        for (int i = 2; i < ans.length; i++) {
            List<Integer> lst = map.get(ans[i - 1]);
            if (ans[i - 2] == lst.get(0)) {
                ans[i] = lst.get(1);
            } else {
                ans[i] = lst.get(0);
            }
        }
        return ans;
    }
}
