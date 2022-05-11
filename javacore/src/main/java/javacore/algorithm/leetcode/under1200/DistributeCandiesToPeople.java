package javacore.algorithm.leetcode.under1200;

/*
 * LeetCode 1103
 */
public class DistributeCandiesToPeople {
	public int[] distributeCandies(int candies, int numPeople) {
        int[] ans = new int[numPeople];
        int turn = 1;
        while (candies > 0) {
            for (int i = 0; i < ans.length; i++) {
                int more = turn < candies ? turn : candies;
                ans[i] += more;
                candies -= more;
                turn++;
                if (candies == 0) {
                    break;
                }
            }
        }
        
        return ans;
    }
}
