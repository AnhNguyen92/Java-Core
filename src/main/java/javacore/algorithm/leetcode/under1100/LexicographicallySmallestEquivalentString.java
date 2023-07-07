package javacore.algorithm.leetcode.under1100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 1061. Lexicographically Smallest Equivalent String
 */
public class LexicographicallySmallestEquivalentString {
	public String smallestEquivalentString(String s1, String s2, String baseStr) {
		Map<Character, Integer> map = new HashMap<>();
		List<List<Character>> lst = new ArrayList<>();
		char c1, c2;
		int k, j;
		for (int i = 0; i < s1.length(); i++) {
			c1 = s1.charAt(i);
			c2 = s2.charAt(i);
			k = map.getOrDefault(c1, -1);
			j = map.getOrDefault(c2, -1);
			if (k == -1) {
				if (j == -1) {
					List<Character> item = new ArrayList<>();
					item.add(c1);
					item.add(c2);
					lst.add(item);
					map.put(c1, lst.size() - 1);
					map.put(c2, lst.size() - 1);
				} else {
					List<Character> item = lst.get(j);
					item.add(c1);
					map.put(c1, j);
				}
			} else {
				if (j == -1) {
					List<Character> item = lst.get(k);
					item.add(c2);
					map.put(c2, k);
				} else if (k != j) {
					int min = Math.min(k, j);
					int max = Math.max(k, j);
					List<Character> item = lst.get(min);
					List<Character> remove = lst.get(max);
					for (char c : remove) {
						map.put(c, min);
					}
					item.addAll(remove);
					lst.remove(max);
					for (int z = max; z < lst.size(); z++) {
						List<Character> update = lst.get(z);
						for (char c : update) {
							map.put(c, z);
						}
					}
				}
			}
		}
		for (List<Character> item : lst) {
			Collections.sort(item);
		}
		StringBuilder sb = new StringBuilder();
		for (char c : baseStr.toCharArray()) {
			k = map.getOrDefault(c, -1);
			System.out.println(k);
			if (k == -1) {
				sb.append(c);
			} else {

				List<Character> item = lst.get(k);
				sb.append(item.get(0));
			}

		}
		return sb.toString();
	}
}