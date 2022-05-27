package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * LeetCode 1408
 */
public class StringMatchingInAnArray {
	public List<String> stringMatching(String[] words) {
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[i].contains(words[j])) {
                    ans.add(words[j]);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
