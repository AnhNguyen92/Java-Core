package javacore.algorithm.leetcode.under0800;

/*
 * LeetCode 733
 */
public class FloodFill {
	public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        floodFill(image, new boolean[image.length][image[0].length], sr, sc, newColor);
        return image;
    }
    
    private void floodFill(int[][] image, boolean[][] brr, int sr, int sc, int newColor) {
        if (!brr[sr][sc]) {
            brr[sr][sc] = true;
            if (sr > 0 && image[sr][sc] == image[sr - 1][sc]) {
                floodFill(image, brr, sr - 1, sc, newColor);
            }
            if (sr + 1 < image.length && image[sr][sc] == image[sr + 1][sc]) {
                floodFill(image, brr, sr + 1, sc, newColor);
            }
            if (sc > 0 && image[sr][sc] == image[sr][sc - 1]) {
                floodFill(image, brr, sr, sc - 1, newColor);
            }
            if (sc + 1 < image[0].length && image[sr][sc] == image[sr][sc + 1]) {
                floodFill(image, brr, sr, sc + 1, newColor);
            }
            image[sr][sc] = newColor;
        }
    }
}
