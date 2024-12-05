package javacore.algorithm.leetcode.under3000;

import java.util.ArrayList;
import java.util.List;

/**
 * 2942. Find Words Containing Character
 */
public class FindWordsContainingCharacter {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        for (String word : words) {
            if (word.indexOf(x) >= 0) {
                ans.add(i);
            }
            i++;
        }
        return ans;
    }
}
