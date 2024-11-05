package javacore.algorithm.leetcode.under3100;

/**
 * 3005. Count Elements With Maximum Frequency
 */
public class CountElementsWithMaximumFrequency {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[101];
        for (int i : nums) {
            arr[i]++;
        }
        int sum = 0;
        int max = -1;
        for (int i : arr) {
            if (i > max) {
                max = i;
                sum = i;
            } else if (i == max) {
                sum += i;
            }
        }

        return sum;
    }
}
