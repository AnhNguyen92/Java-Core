package javacore.algorithm.leetcode.under2600;

import java.util.PriorityQueue;

/**
 * 2593. Find Score of an Array After Marking All Elements
 */
public class FindScoreOfAnArrayAfterMarkingAllElements {
    public long findScore(int[] nums) {
        boolean[] marked = new boolean[nums.length];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(new int[]{nums[i], i});
        }
        long score = 0;
        while (!minHeap.isEmpty()) {
            int[] arr = minHeap.poll();
            if (!marked[arr[1]]) {
                marked[arr[1]] = true;
                score += arr[0];
                if (arr[1] > 0) {
                    marked[arr[1] - 1] = true;
                }
                if (arr[1] < nums.length - 1) {
                    marked[arr[1] + 1] = true;
                }
            }
        }
        return score;
    }
}
