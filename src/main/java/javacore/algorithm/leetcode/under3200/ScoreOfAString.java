package javacore.algorithm.leetcode.under3200;

/**
 * 3110. Score of a String
 */
public class ScoreOfAString {
    public int scoreOfString(String s) {
        int sum = 0;
        int val = (int) s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            int temp = (int) s.charAt(i);
            sum += Math.abs(val - temp);
            val = temp;
        }
        return sum;
    }

}
