package vn.com.ids.javacore.algorithm.leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                continue;
            arr[j++] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.arraycopy(arr, 0, nums, 0, nums.length);
        }
        for (int i = 0; i < nums.length; i++) {
            System.arraycopy(arr, 0, nums, 0, arr.length);
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
