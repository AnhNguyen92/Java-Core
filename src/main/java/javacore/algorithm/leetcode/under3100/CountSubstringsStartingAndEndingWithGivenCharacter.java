package javacore.algorithm.leetcode.under3100;

/*
 * 3084. Count Substrings Starting and Ending with Given Character
 */
public class CountSubstringsStartingAndEndingWithGivenCharacter {
    public long countSubstrings(String s, char c) {
        long m = 0L;
        for (char x : s.toCharArray()) {
            if (x == c)
                m++;
        }
        return m * (m + 1) / 2;
    }
}
