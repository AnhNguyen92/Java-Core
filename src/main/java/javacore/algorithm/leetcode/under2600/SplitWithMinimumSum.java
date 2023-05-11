package javacore.algorithm.leetcode.under2600;

import java.util.PriorityQueue;

/*
 * LeetCode 2578. Split With Minimum Sum
 */
public class SplitWithMinimumSum {
	public int splitNum(int num) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (num > 0) {
            queue.add(num % 10);
            num /= 10;
        }
        int a = 0;
        int b = 0;
        boolean dir = true;
        while (!queue.isEmpty()) {
            if (dir) {
                a = a * 10 + queue.peek();
                dir = false;
            } else {
                b = b * 10 + queue.peek();
                dir = true;
            }
            queue.poll();
        }
        return a + b;
    }
}
