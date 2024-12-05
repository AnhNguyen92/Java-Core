package javacore.algorithm.leetcode.under3100;

import java.util.ArrayList;
import java.util.List;

/**
 * 3069. Distribute Elements Into Two Arrays I
 */
public class DistributeElementsIntoTwoArraysI {
    public int[] resultArray(int[] nums) {
        int[] arr = new int[nums.length];
        int x = 1;
        arr[0] = nums[0];
        int a = nums[0];
        int b = nums[1];
        List<Integer> lst = new ArrayList<>();
        lst.add(nums[1]);
        for (int i = 2; i < nums.length; i++) {
            if (a > b) {
                arr[x++] = nums[i];
                a = nums[i];
            } else {
                b = nums[i];
                lst.add(nums[i]);
            }
        }
        for (Integer integer : lst) {
            arr[x++] = integer;
        }
        return arr;
    }
}
