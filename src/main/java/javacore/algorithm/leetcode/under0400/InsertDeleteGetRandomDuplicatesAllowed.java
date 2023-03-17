package javacore.algorithm.leetcode.under0400;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/*
 * LeetCode 381. Insert Delete GetRandom O(1) - Duplicates allowed
 */
public class InsertDeleteGetRandomDuplicatesAllowed {
	class RandomizedCollection {
		List<Integer> lst;
		int size;
		Map<Integer, Integer> map;

		public RandomizedCollection() {
			map = new HashMap<>();
			lst = new ArrayList<>();
			size = 0;
		}

		public boolean insert(int val) {
			int count = map.getOrDefault(val, 0);
			map.put(val, count + 1);
			lst.add(val);
			size++;
			return count == 0;
		}

		public boolean remove(int val) {
			int count = map.getOrDefault(val, -1);
			if (count == -1) {

				return false;
			}
			map.put(val, count - 1);
			map.remove(val, 0);
			for (Iterator<Integer> it = lst.iterator(); it.hasNext();) {
				if (val == it.next()) {
					it.remove();
					size--;
					break;
				}
			}

			return true;
		}

		public int getRandom() {
			int idx = ThreadLocalRandom.current().nextInt(0, size);
			return lst.get(idx);
		}
	}
}
