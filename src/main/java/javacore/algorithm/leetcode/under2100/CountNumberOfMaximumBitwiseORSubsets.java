package javacore.algorithm.leetcode.under2100;

import java.util.ArrayList;
import java.util.List;

/**
 * 2044. Count Number of Maximum Bitwise-OR Subsets
 */
public class CountNumberOfMaximumBitwiseORSubsets {
    int count = 0;
    int max = 0;
    public int countMaxOrSubsets(int[] nums) {
        List<List<Integer>> result = getAllSubsets(nums);
        for (List<Integer> item : result) {
            int res = calculateOR(item);
            if (max == res) {
                count++;
            } else if (max < res) {
                count = 1;
                max = res;
            }
        }
        return count;
    }

    public List<List<Integer>> getAllSubsets(int[] array) {
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(subsets, new ArrayList<>(), array, 0);
        return subsets;
    }

    private int calculateOR(List<Integer> result) {
        int res = 0;
        for (int i : result) {
            res |= i;
        }
        return res;
    }

    private void generateSubsets(List<List<Integer>> subsets, List<Integer> current, int[] array, int index) {
        if (!current.isEmpty()) {
            subsets.add(new ArrayList<>(current));
        }

        for (int i = index; i < array.length; i++) {
            current.add(array[i]);
            generateSubsets(subsets, current, array, i + 1);
            current.remove(current.size() - 1);
        }
    }
}
