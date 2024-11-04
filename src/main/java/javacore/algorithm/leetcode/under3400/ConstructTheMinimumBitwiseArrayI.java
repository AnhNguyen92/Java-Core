package javacore.algorithm.leetcode.under3400;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 3314. Construct the Minimum Bitwise Array I
 */
public class ConstructTheMinimumBitwiseArrayI {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] arr = new int[nums.size()];
        int a = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : nums) {
            a = Math.max(num, a);
            map.put(num, -1);
        }
        for (int x = a - 1; x >= 0; x--) {
            map.put((x | (x + 1)), x);
        }
        for (int i = 0; i < nums.size(); i++) {
            arr[i] = map.get(nums.get(i));
        }
        return arr;
    }
}
