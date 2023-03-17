package javacore.algorithm.leetcode.under1500;

import java.util.Arrays;

/*
 * LeetCode 1402. Reducing Dishes
 */
public class ReducingDishes {
	public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int[] arr = new int[satisfaction.length];
        int ans = Integer.MIN_VALUE;
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = i; j < arr.length; j++) {
                arr[i] += satisfaction[j] * (j - i + 1);
                
            }
            if (ans < arr[i]) {
                ans = arr[i];
            } else {
                if (ans < 0) return 0;
                return ans;
            }
        }
        return ans;
    }
}
