package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 258. Add Digits
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + ((num - 1) % 9);
    }
}
