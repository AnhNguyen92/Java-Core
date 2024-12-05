package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 811. Subdomain Visit Count
 */
public class SubdomainVisitCount {
	public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        for (String domain : cpdomains) {
            String[] arr = domain.split(" ");
            String key = arr[1];
            String value = arr[0];
            Integer val = Integer.valueOf(value);
            map.put(key, map.getOrDefault(key, 0) + val);
            do {
                int index = key.indexOf(".");
                key = key.substring(index + 1);
                map.put(key, map.getOrDefault(key, 0) + val);
            } while (key.contains("."));
        }
        List<String> ans = new ArrayList<>();
        map.forEach((key, value) -> {
            ans.add(value + " " + key);
        });
        return ans;
    }
}
