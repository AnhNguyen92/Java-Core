package javacore.algorithm.leetcode.under1000;

import java.util.ArrayList;
import java.util.List;

/**
 * 916. Word Subsets
 */
public class WordSubsets {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] max = new int[26];
        for (String w : words2) {
            int[] arr = new int[26];
            for (char c : w.toCharArray())
                arr[c - 'a']++;
            for (int i = 0; i < 26; i++)
                max[i] = Math.max(max[i], arr[i]);
        }
        List<String> ans = new ArrayList<>();
        for (String w : words1) {
            int[] arr = new int[26];
            for (char c : w.toCharArray())
                arr[c - 'a']++;

            boolean valid = true;
            for (int i = 0; i < 26; i++) {
                if (max[i] > arr[i]) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                ans.add(w);
        }
        return ans;
    }
}
