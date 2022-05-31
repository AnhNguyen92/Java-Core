package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 599
 */
public class MinimumIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> lst = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            String s = list1[i];
            map.put(s, i);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list2.length; i++) {
            String s = list2[i];
            if (map.get(s) != null) {
                int sum = map.get(s).intValue() + i;
                if (sum < min) {
                    lst = new ArrayList<>();
                    lst.add(s);
                    min = sum;
                } else if (sum == min) {
                    lst.add(s);
                }
            }
        }
        return lst.toArray(new String[0]);
    }
}
