package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1688
 */
public class CountOfMatchesInTournament {
	public int numberOfMatches(int n) {
        int ans = 0;
        int team = n;
        while (team != 1) {
            ans += team /2;
            team = team - team/2;
        }
        return ans;
    }
}
