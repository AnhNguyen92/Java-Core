package javacore.algorithm.leetcode.under0400;

import java.util.*;

/**
 * 373. Find K Pairs with Smallest Sums
 */
public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                if (a[1] != b[1]) {
                    return Integer.compare(a[1], b[1]);
                }
                return Integer.compare(a[2], b[2]);
            }
        });
        minHeap.add(new int[]{nums1[0] + nums2[0], 0, 0});
        List<List<Integer>> lst = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        int i, j, m = nums1.length, n = nums2.length;
        while (k > 0 && !minHeap.isEmpty()) {
            k--;
            int[] arr = minHeap.poll();
            i = arr[1];
            j = arr[2];
            List<Integer> item = new ArrayList<>();
            item.add(nums1[i]);
            item.add(nums2[j]);
            lst.add(item);

            if (i < m - 1 && !visited.contains((i + 1) + "," + j)) {
                visited.add((i + 1) + "," + j);
                minHeap.add(new int[]{nums1[i + 1] + nums2[j], i + 1, j});
            }
            if (j < n - 1 && !visited.contains(i + "," + (j + 1))) {
                visited.add(i + "," + (j + 1));
                minHeap.add(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
        }
        return lst;
    }
}
