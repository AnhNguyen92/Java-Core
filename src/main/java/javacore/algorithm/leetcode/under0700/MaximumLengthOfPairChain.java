package javacore.algorithm.leetcode.under0700;

import java.util.Arrays;
import java.util.Stack;

/**
 * 646. Maximum Length of Pair Chain
 */
public class MaximumLengthOfPairChain {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });
        Stack<int[]> stack = new Stack<>();
        for (int[] arr : pairs) {
            if (stack.isEmpty() || stack.peek()[1] < arr[0]) {
                stack.push(arr);
            } else if (stack.peek()[1] > arr[1]) {
                while (!stack.isEmpty() && stack.peek()[1] > arr[1]) {
                    stack.pop();
                }
                stack.push(arr);
            }
        }
        return stack.size();
    }
}
