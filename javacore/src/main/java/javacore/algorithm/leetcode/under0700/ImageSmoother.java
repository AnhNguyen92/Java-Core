package javacore.algorithm.leetcode.under0700;

/*
 * LeetCode 661. Image Smoother
 */
public class ImageSmoother {
	public int[][] imageSmoother(int[][] img) {
		int[][] ans = new int[img.length][img[0].length];
		for (int i = 0; i < img.length; i++) {
			for (int j = 0; j < img[0].length; j++) {
				ans[i][j] = floor(img, i, j);
			}
		}
		return ans;
	}

	private int floor(int[][] img, int i, int j) {
		int count = 1;
		int sum = img[i][j];
		if (i > 0) {
			count++;
			sum += img[i - 1][j];
			if (j > 0) {
				count++;
				sum += img[i - 1][j - 1];
			}
			if (j < img[0].length - 1) {
				count++;
				sum += img[i - 1][j + 1];
			}
		}
		if (i < img.length - 1) {
			count++;
			sum += img[i + 1][j];
			if (j > 0) {
				count++;
				sum += img[i + 1][j - 1];
			}
			if (j < img[0].length - 1) {
				count++;
				sum += img[i + 1][j + 1];
			}
		}
		if (j > 0) {
			count++;
			sum += img[i][j - 1];
		}
		if (j < img[0].length - 1) {
			count++;
			sum += img[i][j + 1];
		}
		return sum / count;
	}
}
