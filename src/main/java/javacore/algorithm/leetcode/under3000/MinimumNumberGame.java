package javacore.algorithm.leetcode.under3000;

import java.util.Arrays;

/**
 * 2974. Minimum Number Game
 */
public class MinimumNumberGame {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int a;
        for (int i = 0; i < nums.length - 1; i += 2) {
            a = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = a;
        }
        return nums;
    }
}
