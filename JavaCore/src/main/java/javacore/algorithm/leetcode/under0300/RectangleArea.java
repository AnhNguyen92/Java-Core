package javacore.algorithm.leetcode.under0300;

/*
 * LeetCode 223. Rectangle Area
 */
public class RectangleArea {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int aArea = (ax2 - ax1) * (ay2 - ay1);
        int bArea = (bx2 - bx1) * (by2 - by1);
        return aArea + bArea - intersect(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);

    }

    private int intersect(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int left = Math.max(ax1, bx1);
        int right = Math.min(ax2, bx2);
        int top = Math.min(ay2, by2);
        int bot = Math.max(ay1, by1);
        int w = right - left;
        int h = top - bot;
        if (w <= 0 || h <= 0)
            return 0;
        return w * h;
    }

}
