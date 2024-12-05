package javacore.algorithm.leetcode.under3300;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 3264. Final Array State After K Multiplication Operations I
 * */
public class FinalArrayStateAfterKMultiplicationOperationsI {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(nums.length, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0])
                    return -1;
                if (o1[0] == o2[0])
                    return o1[1] - o2[1];
                return 1;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            queue.add(new int[]{nums[i], i});
        }
        for (int i = 0; i < k; i++) {
            int[] arr = queue.poll();
            arr[0] *= multiplier;
            nums[arr[1]] = arr[0];
            queue.add(arr);
        }
        return nums;
    }
}
