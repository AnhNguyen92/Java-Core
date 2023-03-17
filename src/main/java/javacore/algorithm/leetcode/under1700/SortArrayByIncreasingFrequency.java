package javacore.algorithm.leetcode.under1700;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * LeetCode 1636. Sort Array by Increasing Frequency
 */
public class SortArrayByIncreasingFrequency {
	public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1 );
        }
        Map<Integer, Integer> sortedMap = sortByValue(map); 
        int[] arr = new int[nums.length];
        int j = nums.length - 1;
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            for (int i = 0; i < entry.getValue().intValue(); i++) {
                arr[j--] = entry.getKey().intValue();
            }
    }
        return arr;
    }
    
    public static Map<Integer, Integer> sortByValue(Map<Integer, Integer> hm) {
        List<Map.Entry<Integer, Integer> > list = new LinkedList<>(hm.entrySet()); 
  
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() { 
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (!o1.getValue().equals(o2.getValue()))
                    return (o2.getValue()).compareTo(o1.getValue());
                return (o1.getKey() - o2.getKey());
            }
        });
          
        HashMap<Integer, Integer> temp = new LinkedHashMap<>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        return temp; 
    }
}
