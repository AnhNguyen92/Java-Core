package javacore.algorithm.leetcode.under0400;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 347. Top K Frequent Elements
*/
public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Long> map = Arrays.stream(nums).boxed()
				.collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		map = map.entrySet().stream().sorted((e1, e2) -> {
			return (int) (e2.getValue() - e1.getValue());
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		int[] ans = new int[k];
		int i = 0;
		for (Map.Entry<Integer, Long> entry : map.entrySet()) {
			ans[i++] = entry.getKey();
			if (i == k)
				break;
		}
		return ans;
	}
}
