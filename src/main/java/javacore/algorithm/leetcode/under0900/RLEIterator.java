package javacore.algorithm.leetcode.under0900;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 900. RLE Iterator
 */
public class RLEIterator {
    Queue<int[]> queue;

    public RLEIterator(int[] encoding) {
        queue = new LinkedList<>();
        for (int i = 0; i < encoding.length; i += 2) {
            queue.add(new int[]{encoding[i], encoding[i + 1]});
        }
    }

    public int next(int n) {
        while (n > 0 && !queue.isEmpty()) {
            int[] arr = queue.peek();
            if (arr[0] < n) {
                queue.poll();
                n -= arr[0];
            } else if (arr[0] == n) {
                return queue.poll()[1];
            } else {
                arr[0] -= n;
                return arr[1];
            }
        }
        return -1;
    }
}
