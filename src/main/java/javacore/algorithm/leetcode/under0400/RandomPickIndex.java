package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * 398. Random Pick Index
 */
public class RandomPickIndex {
	Map<Integer, List<Integer>> map = new HashMap<>();
	Random rd = new Random();

	public RandomPickIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            List<Integer> lst = map.get(nums[i]);
            if (lst == null) {
                lst = new ArrayList<>();
                map.put(nums[i], lst);
            }
            lst.add(i);
        }
    }

	public int pick(int target) {
		List<Integer> lst = map.get(target);
		int n = rd.nextInt(lst.size());
		return lst.get(n);
	}
}

/**
 * Your RandomPickIndex object will be instantiated and called as such:
 * RandomPickIndex obj = new RandomPickIndex(nums);
 * int param_1 = obj.pick(target);
 */