package javacore.algorithm.leetcode.under3200;

import java.util.HashMap;
import java.util.Map;

/**
 * 3159. Find Occurrences of an Element in an Array
 */
public class FindOccurrencesOfAnElementInAnArray {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                map.put(count, i);
                count++;
            }
        }
        int[] arr = new int[queries.length];
        count = 0;
        for (int i : queries) {
            arr[count++] = map.getOrDefault(i, -1);
        }
        return arr;
    }

}
