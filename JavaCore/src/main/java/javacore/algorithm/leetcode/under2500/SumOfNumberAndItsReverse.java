package javacore.algorithm.leetcode.under2500;

/*
 * LeetCode 2443. Sum of Number and Its Reverse
 */
public class SumOfNumberAndItsReverse {
    public boolean sumOfNumberAndReverse(int num) {
        if (num == 0) {
            return true;
        }
        int n;
        String s;
        for (int i = 1; i < num; i++) {
            s = new StringBuilder("" + i).reverse().toString();
            n = Integer.parseInt(s);
            if (n == num - i) {
                return true;
            }
        }
        return false;
    }
}
