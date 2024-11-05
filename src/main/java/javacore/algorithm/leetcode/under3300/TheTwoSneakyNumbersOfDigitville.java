package javacore.algorithm.leetcode.under3300;

import java.util.Arrays;

/*
 * 3289. The Two Sneaky Numbers of Digitville
 */
public class TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[2];
        int x = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                arr[x] = nums[i];
                i++;
                if (x == 1) break;
                x++;
            }
        }
        return arr;
    }
}
