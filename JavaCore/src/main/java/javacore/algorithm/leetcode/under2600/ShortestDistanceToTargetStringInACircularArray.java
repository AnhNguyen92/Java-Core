package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2515. Shortest Distance to Target String in a Circular Array
 */
public class ShortestDistanceToTargetStringInACircularArray {
	public int closetTarget(String[] words, String target, int startIndex) {
        int ans = Integer.MAX_VALUE;
        int n = words.length;
        int a;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                a = Math.abs(i - startIndex);
                if (a > n / 2) {
                    a = n - a;
                }
                ans = Math.min(ans, a);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
