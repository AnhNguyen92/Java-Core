package javacore.algorithm.leetcode.under1900;

import java.util.HashMap;
import java.util.Map;

/*
 * Leetcode 1897. Redistribute Characters to Make All Strings Equal
 */
public class RedistributeCharactersToMakeAllStringsEqual {

    public boolean makeEqual(String[] words) {
        int[] arr = new int[26];
        for (String word : words) {
            for (char c : word.toCharArray()) {
                arr[c - 'a']++;
            }
        }
        int len = words.length;
        for (int i : arr) {
            if (i % len != 0)
                return false;

        }
        return true;
    }

    public boolean makeEqual1(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        int len = words.length;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % len != 0)
                return false;

        }
        return true;
    }

}
