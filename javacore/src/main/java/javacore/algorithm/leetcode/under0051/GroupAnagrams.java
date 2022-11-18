package javacore.algorithm.leetcode.under0051;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 49. Group Anagrams
 */
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String str = String.valueOf(arr);
            if (map.containsKey(str)) {
                int i = map.get(str).intValue();
                ans.get(i).add(s);
            } else {
                List<String> item = new ArrayList<>();
                item.add(s);
                ans.add(item);
                map.put(str, ans.size() - 1);
            }
        }
        return ans;
    }
}
