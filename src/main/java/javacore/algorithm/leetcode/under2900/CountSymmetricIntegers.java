package javacore.algorithm.leetcode.under2900;

/**
 * 2843. Count Symmetric Integers
 */
public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low; i <= high; i++) {
            if (symmetric(i)) {
                count++;
            }
        }
        return count;
    }

    private boolean symmetric(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        int sum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum += (int) s.charAt(i) - (int) s.charAt(i + n / 2);
        }
        return sum == 0;
    }
}
