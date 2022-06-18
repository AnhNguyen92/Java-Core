package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrefixAndSuffixSearch {
	class WordFilter {
		List<String> lst = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();

		public WordFilter(String[] words) {
			lst = new ArrayList<>();
			lst = Arrays.asList(words);
		}

		public int f(String prefix, String suffix) {
			String key = prefix + "-" + suffix;
			if (map.containsKey(key))
				return map.get(key);
			for (int i = lst.size() - 1; i >= 0; i--) {
				if (lst.get(i).startsWith(prefix) && lst.get(i).endsWith(suffix)) {
					map.put(key, i);
					return i;
				}
			}
			map.put(key, -1);
			return -1;
		}
	}

	/**
	 * Your WordFilter object will be instantiated and called as such: WordFilter
	 * obj = new WordFilter(words); int param_1 = obj.f(prefix,suffix);
	 */
}
