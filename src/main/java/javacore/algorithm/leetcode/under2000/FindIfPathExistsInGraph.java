package javacore.algorithm.leetcode.under2000;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 1971. Find if Path Exists in Graph
 */
public class FindIfPathExistsInGraph {
	public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n == 1)
            return true;
        Set<Integer> set = new HashSet<>();
        for (int[] arr : edges) {
            if (arr[1] == source ||arr[0] == source || set.contains(arr[0]) || set.contains(arr[1])) {
                set.add(arr[0]);
                set.add(arr[1]);
            }
        }
        if (!set.contains(source)) {
            return false;
        }
        if (set.contains(destination)) {
            return true;
        }
        int len;
        do {
            len = set.size();
            for (int[] arr : edges) {
                if (set.contains(arr[0])) {
                    set.add(arr[1]);
                } else if (set.contains(arr[1])) {
                    set.add(arr[0]);
                }
            }
        } while (set.size() > len);
        return set.contains(destination);
    }
}
