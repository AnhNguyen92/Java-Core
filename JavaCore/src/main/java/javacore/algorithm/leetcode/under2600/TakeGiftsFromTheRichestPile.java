package javacore.algorithm.leetcode.under2600;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * LeetCode 2558. Take Gifts From the Richest Pile
 */
public class TakeGiftsFromTheRichestPile {
	public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        long sum = 0;
        for (int i = 0; i < gifts.length; i++) {
            queue.add(gifts[i]);
        }
        for (int i = 0; i < k; i++) {
            int x = queue.poll();
            int y = (int) Math.sqrt(x);
            queue.add(y);
        }
        while (!queue.isEmpty()) {
            sum += queue.poll();
        }
        
        return sum;
    }
}
