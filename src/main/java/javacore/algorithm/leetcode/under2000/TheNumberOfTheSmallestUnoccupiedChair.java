package javacore.algorithm.leetcode.under2000;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 1942. The Number of the Smallest Unoccupied Chair
 */
public class TheNumberOfTheSmallestUnoccupiedChair {
    public int smallestChair(int[][] times, int targetFriend) {
        int[][] arr = new int[times.length][3];
        PriorityQueue<Integer> available = new PriorityQueue<>();
        for (int i = 0; i < times.length; i++) {
            available.add(i);
            arr[i][0] = times[i][0];
            arr[i][1] = times[i][1];
            arr[i][2] = i;
        }
        Comparator<? super int[]> comparator = (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        };
        Arrays.sort(arr, comparator);
        PriorityQueue<int[]> parties = new PriorityQueue<>(comparator);

        for (int i = 0; i < arr.length; i++) {
            while (!parties.isEmpty() && parties.peek()[0] <= arr[i][0]) {
                int[] ar = parties.poll();
                available.add(ar[1]);
            }
            if (arr[i][2] == targetFriend) {
                return available.peek();
            }
            parties.add(new int[] { arr[i][1], available.poll() });

        }
        return available.peek();
    }
}
