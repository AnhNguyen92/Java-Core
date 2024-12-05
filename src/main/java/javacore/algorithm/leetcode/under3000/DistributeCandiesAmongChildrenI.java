package javacore.algorithm.leetcode.under3000;

/**
 * 2928. Distribute Candies Among Children I
 */
public class DistributeCandiesAmongChildrenI {
    public int distributeCandies(int n, int limit) {
        int count = 0;
        int k;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                k = n - i - j;
                if (k >= 0 && k <= limit) {
                    count++;
                }
            }
        }
        return count;
    }
}
