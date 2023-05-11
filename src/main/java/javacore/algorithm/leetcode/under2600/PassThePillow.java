package javacore.algorithm.leetcode.under2600;

/*
 * LeetCode 2582. Pass the Pillow
 */
public class PassThePillow {
	public int passThePillow(int n, int time) {
        int q = time / (n - 1);
        int r = time % (n - 1);
        if (q % 2 == 0)
            return 1 + r;
        return n - r;
    }
}
