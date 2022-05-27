package javacore.algorithm.leetcode.under0200;

import java.util.Arrays;

/*
 * LeetCode 179
 */
public class LargestNumber {
	public String largestNumber(int[] nums) {
		int[] arr = Arrays.stream(nums).boxed().sorted((a, b) -> ("" + b + a).compareTo("" + a + b)).mapToInt(i -> i)
				.toArray();
        if (arr[0] == 0)
            return "0";
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }
        return sb.toString();
    }
}
