package javacore.algorithm.leetcode.under2000;

/**
 * 1927. Sum Game
 */
public class SumGame {
    public boolean sumGame(String num) {
        int mid = num.length() / 2;
        int s = 0;
        int q = 0;
        for (int i = 0; i < mid; i++) {
            if (num.charAt(i) == '?')
                q--;
            else
                s += num.charAt(i) - '0';
        }
        for (int i = mid; i < num.length(); i++) {
            if (num.charAt(i) == '?')
                q++;
            else
                s -= num.charAt(i) - '0';
        }
        if (q % 2 == 1)
            return true;
        return s != 9 * q / 2;
    }
}
