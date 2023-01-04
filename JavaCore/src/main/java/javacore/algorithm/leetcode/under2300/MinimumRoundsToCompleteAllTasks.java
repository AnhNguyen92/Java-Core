package javacore.algorithm.leetcode.under2300;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2244. Minimum Rounds to Complete All Tasks
 */
public class MinimumRoundsToCompleteAllTasks {
	public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : tasks) {
            map.merge(i, 1, Integer::sum);
        }
        int ans = 0;
        int a;
        for (int i : map.values()) {
        	if (i % 3 == 0) {
        		ans += i / 3;
        	} else if ((a = coefficientOfThree(i)) != -1) {
        		ans += a + (i - 3 * a) / 2;
        	} else if (i % 2 == 0) {
        		ans += i / 2;
        	} else {
        		return -1;
        	}
        }
        return ans;
    }

	private int coefficientOfThree(int x) {
		for (int i = x / 3; i >= 1; i--) {
			if ((x - i * 3) % 2 == 0) {
				return i;
			}
		}
		return -1;
	}
}
