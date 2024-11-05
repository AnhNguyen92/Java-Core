package javacore.algorithm.leetcode.under3100;

import java.util.Arrays;

/**
 * 3014. Minimum Number of Pushes to Type Word I
 */
public class MinimumNumberOfPushesToTypeWordI {
    public int minimumPushes(String word) {
        int cost = 0;
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > 0) {
                if (arr.length - 1 - i < 8) {
                    cost += arr[i];
                } else if (arr.length - 1 - i < 16) {
                    cost += 2 * arr[i];
                } else if (arr.length - 1 - i < 24) {
                    cost += 3 * arr[i];
                } else {
                    cost += 4 * arr[i];
                }
            }
        }
        return cost;
    }
}
