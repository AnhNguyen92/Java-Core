package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2125. Number of Laser Beams in a Bank
 */
public class NumberOfLaserBeamsInABank {
    public int numberOfBeams(String[] bank) {
        int[] arr = new int[bank.length];
        int ans = 0;
        int count;
        int prev = 0;
        for (int i = 0; i < bank.length; i++) {
            count = 0;
            for (char c : bank[i].toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            arr[i] = count;
            ans += arr[i] * prev;
            if (arr[i] > 0) {
                prev = arr[i];
            }
        }
        return ans;
    }
}
