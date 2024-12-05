package javacore.algorithm.leetcode.under0400;

/**
 * 365. Water and Jug Problem
 */
public class WaterAndJugProblem {
    public boolean canMeasureWater(int x, int y, int target) {
        if (x + y < target) return false;
        int gcd = gcd(x, y);
        return target % gcd == 0;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
