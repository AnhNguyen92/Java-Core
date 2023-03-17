package javacore.algorithm.leetcode.under2100;

import java.util.HashMap;
import java.util.Map;

/*
 * LeetCode 2053. Kth Distinct String in an Array
*/
public class KthDistinctStringInAnArray {
	public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int i = 0;
        for (String str : arr) {
            if (map.get(str) == 1)
                i++;
            if (i == k) {
                return str;
            }
        }
        
        return "";
    }
}
