package javacore.algorithm.leetcode.under0300;

/**
 * 264. Ugly Number II
 */
public class UglyNumberII {
    public int nthUglyNumber(int n) {
        int[] arr = new int[n];
        int i2 = 0, i3 = 0, i5 = 0;
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            int l2 = arr[i2] * 2;
            int l3 = arr[i3] * 3;
            int l5 = arr[i5] * 5;
            arr[i] = Math.min(l2, Math.min(l3, l5));
            if (arr[i] == l2) {
                i2++;
            }
            if (arr[i] == l3) {
                i3++;
            }
            if (arr[i] == l5) {
                i5++;
            }
        }
        return arr[n - 1];
    }
}
