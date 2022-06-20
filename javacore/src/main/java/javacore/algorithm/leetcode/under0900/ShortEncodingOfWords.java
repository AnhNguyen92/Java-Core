package javacore.algorithm.leetcode.under0900;

import java.util.Arrays;

/*
 * LeetCode 820
 */
public class ShortEncodingOfWords {
	public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (a, b) -> b.length() - a.length());
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (sb.indexOf(word + "#") == -1) {
                sb.append(word).append("#");
            }
        }
        return sb.length();
    }

}
