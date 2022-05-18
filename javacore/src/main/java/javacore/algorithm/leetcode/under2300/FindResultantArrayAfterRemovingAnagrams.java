package javacore.algorithm.leetcode.under2300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 2273
*/
public class FindResultantArrayAfterRemovingAnagrams {
	public List<String> removeAnagrams(String[] words) {
        List<String> sorted = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        for (String word : words) {
            String s = sortString(word);
            if (sorted.size() == 0 || !sorted.get(sorted.size() - 1).equals(s)) {
                sorted.add(s);
                ans.add(word);
            }
        }
        return ans;
    }
    
    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
