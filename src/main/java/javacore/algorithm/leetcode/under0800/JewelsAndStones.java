package javacore.algorithm.leetcode.under0800;

import java.util.Arrays;

/*
 * LeetCode 771. Jewels and Stones
 */
public class JewelsAndStones {
	public int numJewelsInStones(String j, String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (j.indexOf(c) >= 0) {
				count++;
			}
		}
		return count;
	}
	
	public int numJewelsInStones1(String j, String s) {
        String[] split = j.split("");
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (isContains(split, c + "")) {
                count++;
            }
        }
        return count;
    }
    
    public boolean isContains(String[] arr, String targetValue) {
        return Arrays.asList(arr).contains(targetValue);
    }
}
