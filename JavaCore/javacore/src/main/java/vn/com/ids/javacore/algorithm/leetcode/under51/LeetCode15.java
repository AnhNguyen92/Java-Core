package vn.com.ids.javacore.algorithm.leetcode.under51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = { 0, 0, 0 };
        Arrays.sort(nums);
        List<List<Integer>> result = threeSum(nums);
        for (int i = 0; i < result.size(); i++) {
            result.get(i).forEach(System.out::print);
            System.out.println();
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <= nums.length - 3; i++) {
            int[] tempArr = Arrays.copyOfRange(nums, i + 1, nums.length);
            List<ArrayList<Integer>> twoSums = twoSum(tempArr, 0 - nums[i]);
            if (!twoSums.isEmpty()) {
                for (ArrayList<Integer> item : twoSums) {
                    item.add(nums[i]);
                    Collections.sort(item);
                    set.add(item);
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static List<ArrayList<Integer>> twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                ArrayList<Integer> item = new ArrayList<>();
                item.add(numMap.get(complement));
                item.add(nums[i]);
                result.add(item);
            } else {
                numMap.put(nums[i], nums[i]);
            }
        }
        return result;
    }
}
