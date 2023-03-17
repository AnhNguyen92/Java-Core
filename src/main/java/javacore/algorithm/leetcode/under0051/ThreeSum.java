package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * LeetCode 15. 3Sum
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i <= nums.length - 3; i++) {
            List<ArrayList<Integer>> twoSums = twoSum(nums, i + 1, 0 - nums[i]);
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

    public List<ArrayList<Integer>> twoSum(int[] nums,int startIndex, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        List<ArrayList<Integer>> result = new ArrayList<>();
        for (int i = startIndex; i < nums.length; i++) {
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
