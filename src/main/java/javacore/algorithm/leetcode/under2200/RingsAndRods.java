package javacore.algorithm.leetcode.under2200;

import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 2103. Rings and Rods
 */
public class RingsAndRods {
	public int countPoints(String rings) {
		Set<String> strSet = new HashSet<>();
		Set<String> noSet = new HashSet<>();

		for (int i = 0; i < rings.length(); i += 2) {
			strSet.add(rings.substring(i, i + 2));
			noSet.add(rings.substring(i + 1, i + 2));
		}
		int count = 0;
		for (String str : noSet) {
			if (strSet.contains("R" + str) && strSet.contains("B" + str) && strSet.contains("G" + str))
				count++;
		}
		return count;
	}
}
