package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * LeetCode 1268. Search Suggestions System
 */
public class SearchSuggestionsSystem {
	public List<List<String>> suggestedProducts(String[] products, String searchWord) {
		List<List<String>> ans = new ArrayList<>();
		List<String> item = new ArrayList<>();
		Collections.addAll(item, products);
		for (int i = 0; i < searchWord.length(); i++) {
			for (int j = item.size() - 1; j >= 0; j--) {
				if (!item.get(j).startsWith(searchWord.substring(0, i + 1))) {
					item.remove(j);
				}
			}
			Collections.sort(item);
			ans.add(new ArrayList<>(item.subList(0, Math.min(3, item.size()))));
		}
		return ans;
	}

}
