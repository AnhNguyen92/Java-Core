package javacore.algorithm.leetcode.under2400;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 2342. Max Sum of a Pair With Equal Sum of Digits
 */
public class MaxSumOfAPairWithEqualSumOfDigits {
    public int maximumSum(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int n : nums) {
            int s = 0;
            int k = n;
            while (n > 0) {
                s += n % 10;
                n /= 10;
            }
            PriorityQueue<Integer> queue = map.getOrDefault(s, new PriorityQueue<>(Comparator.reverseOrder()));
            queue.offer(k);
            map.put(s, queue);
        }
        int ans = -1;
        for (Integer key : map.keySet()) {
            PriorityQueue<Integer> queue = map.get(key);
            if (queue.size() >= 2) {
                ans = Math.max(ans, queue.poll() + queue.poll());
            }
        }
        return ans;
    }
}
