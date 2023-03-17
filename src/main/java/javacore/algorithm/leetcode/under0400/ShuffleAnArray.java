package javacore.algorithm.leetcode.under0400;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * LeetCode 384. Shuffle an Array
 */
public class ShuffleAnArray {
	private int n;
    private int[] arr;
    private List<Integer> list;

    public ShuffleAnArray(int[] nums) {
        n = nums.length;
        arr = nums;
        list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    }
    
    public int[] reset() {
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
    
    public int[] shuffle() {
        int temp;
        int j;
        for (int i = n - 1; i > 0; i--) {
            j = (int) (Math.random() * (i + 1));
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}

/**
 * Your ShuffleAnArray object will be instantiated and called as such:
 * ShuffleAnArray obj = new ShuffleAnArray(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
