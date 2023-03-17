package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 914. X of a Kind in a Deck of Cards
 */
public class XOfAKindInADeckOfCards {
	public boolean hasGroupsSizeX(int[] deck) {
		if (deck.length == 1)
			return false;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : deck) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		List<Integer> lst = new ArrayList<>();
		for (Integer i : map.values()) {
			lst.add(i);
		}
		int result = 0;
		for (Integer x : lst) {
			result = gcd(result, x.intValue());

			if (result == 1) {
				return false;
			}
		}

		return result >= 2;
	}

	int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}
}
