package javacore.algorithm.leetcode.under1700;

/*
 * LeetCode 1629. Slowest Key
 */
public class SlowestKey {
	public char slowestKey(int[] releaseTimes, String keysPressed) {
        int max = releaseTimes[0];
        char ans =  keysPressed.charAt(0);
        char c;
        for (int i = 1; i < releaseTimes.length; i++) {
            c = keysPressed.charAt(i);
			int diff = releaseTimes[i] - releaseTimes[i-1];
			if (diff > max) {
                max = diff;
                ans = c;
            } else if (diff == max && c - ans > 0) {
            	ans = c;
            }
        }
        
        return ans;
    }
}
