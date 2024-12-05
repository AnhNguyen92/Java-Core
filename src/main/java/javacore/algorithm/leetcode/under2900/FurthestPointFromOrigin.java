package javacore.algorithm.leetcode.under2900;

/**
 * 2833. Furthest Point From Origin
 */
public class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0;
        int r = 0;
        int x = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'L') l++;
            else if (c == 'R') r++;
            else x++;
        }
        if (l >= r) {
            return x + l - r;
        }
        return x + r - l;
    }
}
