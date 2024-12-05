package javacore.algorithm.leetcode.under3200;

/**
 * 3184. Count Pairs That Form a Complete Day I
 */
public class CountPairsThatFormACompleteDayI {
    public int countCompleteDayPairs(int[] hours) {
        int count = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
