package javacore.algorithm.leetcode.under0600;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 575
 */
public class DistributeCandies {
	public int distributeCandies(int[] candies) {
		if (candies == null || candies.length == 0)
			return 0;

		Set<Integer> set = new HashSet<>();
		int types = 0;

		for (int i = 0; i < candies.length && types < candies.length / 2; i++) {
			int c = candies[i];
			if (!set.contains(c))
				types++;
			set.add(c);
		}

		return types;
	}
}
