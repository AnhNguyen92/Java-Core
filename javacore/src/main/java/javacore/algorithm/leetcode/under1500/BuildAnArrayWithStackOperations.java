package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1441
 */
public class BuildAnArrayWithStackOperations {
	public List<String> buildArray(int[] target, int n) {
		int i = 0;
		List<String> ans = new ArrayList<>();
		for (int j = 1; j <= target[target.length - 1]; j++) {
			if (j == target[i]) {
				ans.add("Push");
				i++;
			} else {
				for (int k = j; k < target[i]; k++) {
					ans.add("Push");
					ans.add("Pop");
				}
				j = target[i] - 1;
			}
		}
		return ans;
	}
}
