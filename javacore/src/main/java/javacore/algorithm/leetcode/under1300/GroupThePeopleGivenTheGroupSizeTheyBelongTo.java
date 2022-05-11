package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 1282
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (map.containsKey(groupSizes[i])) {
                List<Integer> lst = map.get(groupSizes[i]);
                lst.add(i);
            } else {
                List<Integer> lst = new ArrayList<>();
                lst.add(i);
                map.put(groupSizes[i], lst);
            }
            if (map.get(groupSizes[i]).size() == groupSizes[i]) {
                ans.add(map.get(groupSizes[i]));
                map.remove(groupSizes[i]);
            }
        }
                
        return ans;
    }
}
