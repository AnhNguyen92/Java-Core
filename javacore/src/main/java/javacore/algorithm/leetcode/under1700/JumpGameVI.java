package javacore.algorithm.leetcode.under1700;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * LeetCode 1696
 */
public class JumpGameVI {
	public int maxResult(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(1, Comparator.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length - 1;
        queue.add(nums[n]);
        map.put(nums[n], n);
        for (int i = n - 1; i >= 0; i--) {
            while (map.get(queue.peek()) != null && map.get(queue.peek()) > Math.min(n, i + k))
                queue.poll();            
            nums[i] = nums[i] + queue.peek();
            map.put(nums[i], i);
            queue.add(nums[i]);
        }
        return nums[0];
    }
}
