package javacore.algorithm.leetcode.under2500;

import java.util.*;

/**
 * 2456. Most Popular Video Creator
 */
public class MostPopularVideoCreator {
    public List<List<String>> mostPopularCreator(String[] creators, String[] ids, int[] views) {
        Map<String, Long> popularityMap = new HashMap<>();
        Map<String, String> idMap = new HashMap<>();
        Map<String, Long> viewMap = new HashMap<>();
        for (int i = 0; i < ids.length; i++) {
            popularityMap.merge(creators[i], (long) views[i], Long::sum);
            if (idMap.get(creators[i]) == null
                    || viewMap.getOrDefault(creators[i], 0L) < views[i]
                    || (viewMap.get(creators[i]) == views[i] && idMap.get(creators[i]).compareTo(ids[i]) > 0L)) {
                idMap.put(creators[i], ids[i]);
            }
            viewMap.put(creators[i], Math.max(viewMap.getOrDefault(creators[i], 0L), views[i]));
        }
        long max = Collections.max(popularityMap.values());
        List<List<String>> ans = new ArrayList<>();
        popularityMap.forEach((k, v) -> {
            if (v == max) {
                List<String> item = new ArrayList<>();
                item.add(k);
                item.add(idMap.get(k));
                ans.add(item);
            }
        });
        return ans;
    }
}
