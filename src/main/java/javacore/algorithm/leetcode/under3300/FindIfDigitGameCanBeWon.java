package javacore.algorithm.leetcode.under3300;

/**
 * 3232. Find if Digit Game Can Be Won
 */
public class FindIfDigitGameCanBeWon {
    public boolean canAliceWin(int[] nums) {
        int s = 0;
        for (int i : nums) {
            if (i < 10) s += i;
            else s -= i;
        }
        return s != 0;
    }
}
