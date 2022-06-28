package javacore.algorithm.leetcode.under0300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Leet code 229
 */
public class MajorityElementII {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);
        int curr = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[curr]) {
                count++;
            } else {
                if (count > nums.length / 3)
                    lst.add(nums[i-1]);
                curr = i;
                count = 1;
            }
        }
        if (count > nums.length / 3)
            lst.add(nums[nums.length - 1]);
        return lst;
	}
}
