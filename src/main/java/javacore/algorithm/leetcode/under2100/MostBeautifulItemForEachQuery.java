package javacore.algorithm.leetcode.under2100;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 2070. Most Beautiful Item for Each Query
 */
public class MostBeautifulItemForEachQuery {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < queries.length; i++) {
            pq.add(new int[]{i, queries[i]});
        }
        int[] ans = new int[queries.length];
        int max = 0;
        int start = 0;
        while (!pq.isEmpty()) {
            int[] element = pq.poll();
            int[] search = findMax(items, start, element[1], max);
            start = search[0];
            max = search[1];
            ans[element[0]] = max;
        }

        return ans;
    }

    private int[] findMax(int[][] items, int start, int end, int max) {
        int[] ans = new int[] {start, max};
        for (int i = start; i < items.length && items[i][0] <= end; i++) {
            ans[0]++;
            if (ans[1] < items[i][1]) {
                ans[1] = items[i][1];
            }
        }
        return ans;
    }
}
