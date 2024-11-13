package javacore.algorithm.leetcode.under0900;

/**
 * 866. Prime Palindrome
 */
public class PrimePalindrome {
    public int primePalindrome(int n) {
        if (8 <= n && n <= 11) {
            return 11;
        }
        for (int x = 1; x < 100000; ++x) {
            String s = Integer.toString(x);
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();

            int y = Integer.parseInt(s + sb.substring(1));
            if (y >= n && isPrime(y))
                return y;
        }

        return -1;
    }

    private boolean isPrime(int num) {
        if (num < 2 || num % 2 == 0)
            return num == 2;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0)
                return false;
        return true;
    }
}
