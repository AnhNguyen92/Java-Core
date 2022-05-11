package javacore.algorithm.leetcode.under1700;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 1630
 */
public class ArithmeticSubarrays {
	public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		List<Boolean> res = new ArrayList<>();
		for (int i = 0; i < l.length; i++) {
			int len = r[i] - l[i] + 1;
			int[] arr = new int[len];
			System.arraycopy(nums, l[i], arr, 0, len);
			Arrays.sort(arr);
			res.add(checkArithmetic(arr));
		}
		return res;
	}

	private boolean checkArithmetic(int[] arr) {
		int temp = arr[1] - arr[0];
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] - arr[i - 1] != temp)
				return false;
		}
		return true;
	}
}
