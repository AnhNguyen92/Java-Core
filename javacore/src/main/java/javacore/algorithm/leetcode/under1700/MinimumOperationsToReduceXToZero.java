package javacore.algorithm.leetcode.under1700;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 1658
 */
public class MinimumOperationsToReduceXToZero {

	public int minOperations(int[] nums, int x) {
		Map<Integer, Integer> left = new HashMap<>();
		int sum = 0;
		int ans = Integer.MAX_VALUE;
		int n = nums.length;
		Integer key;
		for (int i = 0; i < n && x - nums[i] >= sum; i++) {
			sum += nums[i];
			if (sum == x && ans > i + 1) {
				ans = i + 1;
				break;
			}
			left.put(sum, i + 1);

		}
		sum = 0;
		for (int i = n - 1; i >= 0 && x - nums[i] >= sum; i--) {
			sum += nums[i];
			if (sum == x && ans > n - i) {
				ans = n - i;
				break;
			}

			key = left.get(x - sum);
			if (key != null && key < i) {
				ans = Math.min(ans, n - i + key);
			}
		}

		return ans < Integer.MAX_VALUE ? ans : -1;
	}
}
