package javacore.algorithm.leetcode.under0300;

/*
 * Leet code #258
 */
public class AddDigits {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        return 1 + ((num - 1) % 9);
    }
}
