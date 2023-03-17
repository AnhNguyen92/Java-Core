package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * LeetCode 18. 4Sum
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 4; i++) {
            for (int j = i + 1; j <= nums.length - 3; j++) {
                Map<Integer, Integer> numMap = twoSum(nums, j + 1, target - nums[i] - nums[j]);
                if (numMap.size() > 0) {
                    List<List<Integer>> lists = new ArrayList<>();
                    numMap.forEach((key, value) -> {
                        List<Integer> item = new ArrayList<>();
                        item.add(key);
                        item.add(value);
                        lists.add(item);
                    });
                    for (List<Integer> item : lists) {
                        item.add(nums[i]);
                        item.add(nums[j]);
                    }
                    result.addAll(lists);
                }
            }
        }

        return result.stream().collect(Collectors.toList());
    }

    public Map<Integer, Integer> twoSum(int[] nums, int firstIndex, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        Map<Integer, Integer> result = new HashMap<>();
        for (int i = firstIndex; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                result.put(complement, nums[i]);
            } else {
                numMap.put(nums[i], nums[i]);
            }
        }
        return result;
    }
}
