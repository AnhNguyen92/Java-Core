package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1395. Count Number of Teams
 */
public class CountNumberOfTeams {
	public int numTeams(int[] rating) {
        int[][] increase = new int[rating.length][2];
        int[][] decrease = new int[rating.length][2];
        for (int i = 0; i < rating.length - 1; i++) {
            for (int j = i + 1; j < rating.length; j++) {
                if (rating[i] < rating[j]) {
                    increase[i][0]++;
                    increase[j][1]++;
                } else if (rating[i] > rating[j]) {
                    decrease[i][0]++;
                    decrease[j][1]++;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < rating.length; i++) {
            count += increase[i][0] * increase[i][1];
            count += decrease[i][0] * decrease[i][1];
        }
        
        return count;
    }
}
