package javacore.algorithm.leetcode.under2000;

/*
 * LeetCode 1952
 */
public class ThreeDivisors {
	public boolean isThree(int n) {
        int count = 2;
        int k;
        for (int i = 2; i < n; i++) {
            k = n / i;
            if (k * i == n) {
                count++;
                if (k != i) {
                    count++;
                }
                if (count > 3) {
                    return false;
                }
            }
        }
        return count == 3;
    }
}
