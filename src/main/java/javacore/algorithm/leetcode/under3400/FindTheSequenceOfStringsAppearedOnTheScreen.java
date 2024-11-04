package javacore.algorithm.leetcode.under3400;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 3324. Find the Sequence of Strings Appeared on the Screen
 */
public class FindTheSequenceOfStringsAppearedOnTheScreen {
    public List<String> stringSequence(String target) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < target.length(); i++) {
            String s = target.substring(0,i);
            for (char c = 'a'; c <= target.charAt(i); c++) {
                lst.add(s + c);
            }
        }
        return lst;
    }
}
