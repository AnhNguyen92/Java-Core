package javacore.algorithm.leetcode.under2600;

/**
 * 2554. Maximum Number of Integers to Choose From a Range I
 */
public class MaximumNumberOfIntegersToChooseFromARangeI {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int count = 0;
        boolean[] arr = new boolean[10001];
        for (int i : banned)
            arr[i] = true;
        for (int i = 1; i <= n; i++) {
            if (!arr[i]) {
                if (sum + i <= maxSum) {
                    sum += i;
                    count++;
                } else
                    break;
            }
        }
        return count;
    }
}
