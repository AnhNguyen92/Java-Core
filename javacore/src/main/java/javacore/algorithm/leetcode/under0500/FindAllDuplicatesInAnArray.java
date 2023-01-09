package javacore.algorithm.leetcode.under0500;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
 * Leetcode 442. Find All Duplicates in an Array
 */
public class FindAllDuplicatesInAnArray {
	public List<Integer> findDuplicates(int[] nums) {
		Map<Integer, Long> map = IntStream.of(nums).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		return map.keySet().stream().filter(k -> map.get(k) > 1).collect(Collectors.toList());
	}
}
