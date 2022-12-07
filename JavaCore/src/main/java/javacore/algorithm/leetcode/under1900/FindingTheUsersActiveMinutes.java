package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * Leetcode 1817. Finding the Users Active Minutes
 */
public class FindingTheUsersActiveMinutes {

    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] ans = new int[k];
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            Set<Integer> set = map.get(log[0]);
            if (set == null) {
                set = new HashSet<>();
                map.put(log[0], set);
            }
            set.add(log[1]);
        }
        Map<Integer, Set<Integer>> map1 = new HashMap<>();
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {
            int key = entry.getValue().size();
            Set<Integer> set = map1.get(key);
            if (set == null) {
                set = new HashSet<>();
                map1.put(key, set);
            }
            set.add(entry.getKey());
        }
        for (Map.Entry<Integer, Set<Integer>> entry : map1.entrySet()) {
            ans[entry.getKey() - 1] = entry.getValue().size();
        }
        return ans;
    }

}
