package javacore.algorithm.leetcode.under3200;

/*
 * LeetCode 3163. String Compression III
 */
public class StringCompressionIII {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char prev = word.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (prev != c) {
                sb.append(count).append(prev);
                count = 1;
                prev = c;
            } else {
                count++;
                if (count == 10) {
                    sb.append(count-1).append(prev);
                    count = 1;
                }
            }
            if (i == word.length() - 1) {
                sb.append(count).append(c);
            }
        }
        return sb.toString();
    }
}
