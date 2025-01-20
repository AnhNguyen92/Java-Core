package javacore.algorithm.leetcode.under2700;

/**
 * 2683. Neighboring Bitwise XOR
 */
public class NeighboringBitwiseXOR {
    public boolean doesValidArrayExist(int[] derived) {
        int s = 0;
        for (int i : derived)
            s ^= i;
        return s == 0;
    }
}
