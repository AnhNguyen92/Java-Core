package javacore.algorithm.leetcode.under2600;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 2530. Maximal Score After Applying K Operations
 */
public class MaximalScoreAfterApplyingKOperations {
    public long maxKelements(int[] nums, int k) {
        Arrays.sort(nums);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        int j = nums.length - 1;
        for (int i = 1; i <= k; i++) {
            int a;
            if (maxHeap.isEmpty() || j >= 0 && nums[j] >= maxHeap.peek()) {
                a = nums[j--];
            } else {
                a = maxHeap.poll();
            }
            maxHeap.add((int) Math.ceil(a / 3.0));
            sum += a;
        }
        return sum;
    }
}
