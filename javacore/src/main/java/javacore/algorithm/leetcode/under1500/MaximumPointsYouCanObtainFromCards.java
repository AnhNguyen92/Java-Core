package javacore.algorithm.leetcode.under1500;

/*
 * LeetCode 1423. Maximum Points You Can Obtain from Cards
 */
public class MaximumPointsYouCanObtainFromCards {
	public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
		int currSum = 0;
		int n = cardPoints.length;
		int diff = n - k;
		for (int i = 0; i < n; i++) {
			sum += cardPoints[i];
			if (i == diff - 1) {
				currSum = sum;
			}
		}
        if (k == n)
            return sum;
		int max = sum - currSum;
		for (int i = 1; i <= k; i++) {
			currSum += cardPoints[i + diff - 1] - cardPoints[i - 1];
			max = Math.max(max, sum - currSum);
		}

		return max;
    }
}
