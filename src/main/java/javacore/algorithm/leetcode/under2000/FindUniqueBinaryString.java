package javacore.algorithm.leetcode.under2000;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 1980. Find Unique Binary String
 */
public class FindUniqueBinaryString {
	public String findDifferentBinaryString(String[] nums) {
        int n = nums.length;
        String s = "1".repeat(n);
        long max = Long.parseLong(s);
        Set<Long> lst = new HashSet<>();
        for (String noStr : nums) {
            long i = Long.parseLong(noStr, 2);
            lst.add(i);
        }
        for (long i = 0; i < max; i++) {
            if (!lst.contains(i)) {
                String ans = Long.toBinaryString(i);
                return "0".repeat(n - ans.length()) + ans;
            }
        }
        return s;
    }
}
