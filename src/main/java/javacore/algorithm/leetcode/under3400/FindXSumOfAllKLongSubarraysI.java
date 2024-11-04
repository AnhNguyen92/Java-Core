package javacore.algorithm.leetcode.under3400;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * LeetCode 3318. Find X-Sum of All K-Long Subarrays I
 */
public class FindXSumOfAllKLongSubarraysI {
    public int[] findXSum(int[] nums, int k, int x) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        int[] arr = new int[nums.length - k + 1];
        for (int i = 0; i < k - 1; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = k - 1; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            arr[i - k + 1] = sum(map, x);
            map.put(nums[i - k + 1], map.getOrDefault(nums[i - k + 1], 0) - 1);
        }
        return arr;
    }

    private int sum(Map<Integer, Integer> map, int x) {
        int sum = 0;
        int[] arr = new int[map.size()];
        int idx = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            arr[idx++] = e.getKey() * e.getValue();
        }
        Arrays.sort(arr);
        for (int i = 0; i < Math.min(x, map.size()); i++) {
            sum += arr[i];
        }
        return sum;
    }
}
