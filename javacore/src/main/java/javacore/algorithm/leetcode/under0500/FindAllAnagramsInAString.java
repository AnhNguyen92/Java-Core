package javacore.algorithm.leetcode.under0500;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode 438. Find All Anagrams in a String
 */
public class FindAllAnagramsInAString {
	public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst = new ArrayList<>();
        int len1 = p.length();
		int len2 = s.length();
        if (len2 >= len1) {
            int[] arr1 = frequentArr(p);
            int[] arr2 = frequentArr(s.substring(0, len1));
            if (isInClude(arr1, arr2)) {
                lst.add(0);
            }
            for (int i = 1; i <= len2 - len1; i++) {
                arr2[s.charAt(i - 1) - 'a']--;
                arr2[s.charAt(i + len1 - 1) - 'a']++;
                if (isInClude(arr1, arr2)) {
                    lst.add(i);
                }
            }
        }
        return lst;
    }
    
    private boolean isInClude(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] !=  arr2[i]) {
				return false;
			}
		}
		return true;
	}

	private int[] frequentArr(String s) {
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}
		return arr;
	}
}
