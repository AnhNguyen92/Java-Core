package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * LeetCode 1331. Rank Transform of an Array
 */
public class RankTransformOfAnArray {
	public int[] arrayRankTransform(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		List<Integer> lst = new ArrayList<>(set);
		Collections.sort(lst);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < lst.size(); i++) {
			map.put(lst.get(i), i + 1);
		}
		int[] ans = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			ans[i] = map.get(arr[i]);
		}
		return ans;
	}
}
