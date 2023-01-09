package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Leetcode 2225. Find Players With Zero or One Losses
 */
public class FindPlayersWithZeroOrOneLosses {
	public List<List<Integer>> findWinners(int[][] matches) {
		Map<Integer, Integer> lMap = new HashMap<>();
		Map<Integer, Integer> wMap = new HashMap<>();
		for (int i = 0; i < matches.length; i++) {
			wMap.put(matches[i][0], lMap.getOrDefault(matches[i][0], 0) + 1);
			lMap.put(matches[i][1], lMap.getOrDefault(matches[i][1], 0) + 1);
		}
		List<Integer> winner = new ArrayList<>();
		List<Integer> loss = lMap.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		for (Map.Entry<Integer, Integer> entry : wMap.entrySet()) {
			if (!lMap.containsKey(entry.getKey())) {
				winner.add(entry.getKey());
			}
		}

		List<List<Integer>> ans = new ArrayList<>();
		Collections.sort(winner);
		Collections.sort(loss);
		ans.add(winner);
		ans.add(loss);
		return ans;
	}
}
