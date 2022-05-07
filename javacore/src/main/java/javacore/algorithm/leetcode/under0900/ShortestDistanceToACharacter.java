package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 821
 */
public class ShortestDistanceToACharacter {
	public int[] shortestToChar(String s, char c) {
        int indexC = -1;
        int[] ans = new int[s.length()];
        for (int i = 0 ; i < ans.length; i++) {
            ans[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < ans.length; i++) {
            if (s.charAt(i) == c) {
                ans[i] = 0;
                indexC = i;
            } else if (indexC != -1) {
                ans[i] = i - indexC;
            }
        }
        indexC = -1;
        for (int i = ans.length - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                indexC = i;
            } else if (indexC != -1) {
                ans[i] = Math.min(ans[i], indexC - i);
            }
        }
        return ans;
    }
}
