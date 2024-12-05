package javacore.algorithm.leetcode.under2500;

import javacore.algorithm.leetcode.model.TreeNode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 2471. Minimum Number of Operations to Sort a Binary Tree by Level
 */
public class MinimumNumberOfOperationsToSortABinaryTreeByLevel {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int n = queue.size();
            Pair[] values = new Pair[n];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                TreeNode curr = queue.poll();
                values[i] = new Pair(curr.val, i);
                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            Arrays.sort(values, Comparator.comparingInt(p -> p.value));
            boolean[] visited = new boolean[n];
            int swaps = 0;

            for (int i = 0; i < n; i++) {
                if (visited[i] || values[i].index == i) {
                    continue;
                }
                int cycleSize = 0;
                int j = i;
                while (!visited[j]) {
                    visited[j] = true;
                    j = values[j].index;
                    cycleSize++;
                }
                if (cycleSize > 0) {
                    swaps += (cycleSize - 1);
                }
            }
            ans += swaps;
        }
        return ans;
    }
}

class Pair {
    int value;
    int index;

    Pair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}
