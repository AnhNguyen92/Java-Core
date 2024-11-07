package javacore.algorithm.leetcode.under2500;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 2406. Divide Intervals Into Minimum Number of Groups
 */
public class DivideIntervalsIntoMinimumNumberOfGroups {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int[] arr : intervals) {
            if (!queue.isEmpty()) {
                if (arr[0] > queue.peek()) {
                    queue.poll();
                }
            }
            queue.add(arr[1]);
        }
        return queue.size();
    }
}
