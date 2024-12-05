package javacore.algorithm.leetcode.under2600;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 2583. Kth Largest Sum in a Binary Tree
 */
public class KthLargestSumInABinaryTree {

    public long kthLargestLevelSum(TreeNode root, int k) {
        Map<Integer, Long> map = new HashMap<>();
        travel(map, root, 0);
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (Long value : map.values()) {
            maxHeap.offer(value);
        }
        if (k > maxHeap.size()) {
            return -1;
        }
        for (int i = 1; i < k; i++) {
            maxHeap.poll();
        }
        return maxHeap.poll();
    }

    private void travel(Map<Integer, Long> map, TreeNode root, int level) {
        if (root != null) {
            map.put(level, map.getOrDefault(level, 0L) + root.val);
            travel(map, root.left, level + 1);
            travel(map, root.right, level + 1);
        }
    }
}
