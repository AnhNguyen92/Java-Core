package javacore.java8.map;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapExample {
	private static final Logger log = LoggerFactory.getLogger(MapExample.class);

	public static void main(String[] args) {
		MapExample example = new MapExample();
		example.updateUsingMerge();
		example.updateUsingGetOrDefault();
		example.updateUsingCompute();
	}

	public void updateUsingMerge() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 1);
		map.merge(2, 1, Integer::sum);
		map.merge(1, 1, Integer::sum);
		log.info("{} - {}", 1, map.get(1));
		log.info("{} - {}", 2, map.get(2));
	}

	public void updateUsingGetOrDefault() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 1);
		map.put(2, map.getOrDefault(2, 0) + 1);
		log.info("{} - {}", 2, map.get(2));
	}

	public void updateUsingCompute() {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 1);
		map.compute(2, (k, v) -> (v == null) ? 1 : v + 1);
		log.info("{} - {}", 2, map.get(2));
	}

	/*
	 * using merge method to increase value of specific key may not exist in map.
	 * usage: @LeetCode no. 2244
	 * @Link  https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/
	 */
	public void mergeValuExample() {
		Map<Integer, Integer> map = new HashMap<>();
		int[] tasks = new int[] { 2, 2, 3, 3, 2, 4, 4, 4, 4, 4 };
		for (int i : tasks) {
			map.merge(i, 1, Integer::sum);
		}
		for (int i : map.values()) {
			log.info("{} ", i);
		}
	}
}
