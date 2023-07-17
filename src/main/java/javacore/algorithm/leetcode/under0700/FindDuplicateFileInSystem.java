package javacore.algorithm.leetcode.under0700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * LeetCode 609. Find Duplicate File in System
 */
public class FindDuplicateFileInSystem {
	public List<List<String>> findDuplicate(String[] paths) {
		Map<String, List<String>> map = new HashMap<>();
		for (String path : paths) {
			String[] arr = path.split("\\ ");
			for (int i = 1; i < arr.length; i++) {
				String s = arr[i];
				int x = s.lastIndexOf("(");
				String content = s.substring(x, s.length() - 1);
				if (map.get(content) == null) {
					map.put(content, new ArrayList<>());
				}
				List<String> dirs = map.get(content);
				dirs.add(new StringBuilder().append(arr[0]).append("/").append(s.substring(0, x)).toString());
			}
		}
		return map.values().stream().filter(v -> v.size() > 1).collect(Collectors.toList());
	}
}
