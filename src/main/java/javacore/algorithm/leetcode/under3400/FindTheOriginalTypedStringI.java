package javacore.algorithm.leetcode.under3400;

/*
 * LeetCode 3330. Find the Original Typed String I
 */
public class FindTheOriginalTypedStringI {
    public int possibleStringCount(String word) {
        int count = 0;
        int ans = 0;
        int time = 0;
        for (int i = 0; i < word.length(); i++) {
            if (i > 0 && word.charAt(i) == word.charAt(i-1)) {
                count++;
                if (i == word.length() - 1 && count > 1) {
                    ans += count;
                    time++;
                }
            } else {
                if (count > 1) {
                    ans += count;
                    time++;
                }
                count = 1;
            }
        }
        return ans - (time - 1);
    }
}
