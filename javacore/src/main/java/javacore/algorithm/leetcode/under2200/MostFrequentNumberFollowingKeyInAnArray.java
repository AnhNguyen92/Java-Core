package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2190
*/
public class MostFrequentNumberFollowingKeyInAnArray {
	public int mostFrequent(int[] nums, int key) {
        int[] arr = new int[1001];
        int index = 0;
        int max = arr[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                arr[nums[i+1]]++;
                if (max < arr[nums[i+1]]) {
                    max = arr[nums[i+1]];
                    index = nums[i+1];
                } else if (max == arr[nums[i+1]]) {
                    index = nums[i+1];
                }
            }
        }
        return index;
    }
	
	public int mostFrequent1(int[] nums, int key) {
        int[] arr = new int[1001];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                arr[nums[i+1]]++;
            }
        }
        int index = 0;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            } else if (max == arr[i]) {
                index = i;
            }
        }
        return index;
    }
}
