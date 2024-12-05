package javacore.algorithm.leetcode.under3100;

import java.util.Arrays;

/**
 * 3016. Minimum Number of Pushes to Type Word II
 */
public class MinimumNumberOfPushesToTypeWordII {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        int ans = 0;
        int count = 1;
        int mul = 1;
        for (int i = 25; i >= 0; i--) {
            if (arr[i] > 0) {
                ans += arr[i] * mul;
                count++;
                if (count > 8) {
                    mul++;
                    count = 1;
                }
            } else {
                break;
            }
        }
        return ans;
    }
}
