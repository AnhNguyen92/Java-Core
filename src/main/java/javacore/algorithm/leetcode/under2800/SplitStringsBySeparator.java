package javacore.algorithm.leetcode.under2800;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 2788. Split Strings by Separator
 */
public class SplitStringsBySeparator {
	public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c != separator) {
                    sb.append(c);
                    if (i == word.length() - 1 && !sb.toString().isEmpty()) {
                        ans.add(sb.toString());
                    }
                } else if (!sb.toString().isEmpty()) {
                    ans.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
        }
        return ans;
    }
}
