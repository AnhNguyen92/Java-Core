package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 717. 1-bit and 2-bit Characters
 */
public class OneBitAndTwoBitCharacters {
	public boolean isOneBitCharacter(int[] bits) {
		int i = 0;
		for (; i < bits.length; i++) {
			if (i != bits.length - 1) {
				if (bits[i] != 0)
					i++;
			} else {
				return (bits[i] == 0);
			}
		}
		return false;
	}
}
