package javacore.algorithm.leetcode.under0900;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * LeetCode 893
 */
public class GroupsOfSpecialEquivalentStrings {
	public int numSpecialEquivGroups(String[] a) {
        Set<String> set = new HashSet<>();
        for (String s : a) {
            int evenLen = s.length() / 2;
            char[] even = new char[evenLen];
            char[] odd = new char[s.length() - evenLen];
            for (int i = 0; i < evenLen; i++) {
                even[i] = s.charAt(i*2);
                odd[i] = s.charAt(i * 2 + 1);
            }
            if (s.length() % 2 == 1) {
                odd[odd.length - 1] = s.charAt(s.length() - 1);
            }
            Arrays.sort(even); 
            Arrays.sort(odd);
            String temp = new String(even) + new String(odd);
            set.add(temp);
        }
        return set.size();
    }
}
