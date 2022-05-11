package javacore.algorithm.leetcode.under1400;

/*
 * LeetCode 1314
 */
public class MatrixBlockSum {
	public int[][] matrixBlockSum(int[][] mat, int K) {
        int[][] ans = new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                for (int r = Math.max(i - K, 0); r <= Math.min(i + K, mat.length - 1); r++) {
                    for (int c = Math.max(j - K, 0); c <= Math.min(j + K, mat[i].length - 1); c++) {
                        ans[i][j] += mat[r][c];
                    }
                }
            }
        }
        return ans;
    }
	
	public int[][] matrixBlockSum2(int[][] mat, int K) {
		int m = mat.length, n = mat[0].length;
		int[][] prefix = new int[m + 1][n + 1], answer = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// add curr element and left and top sides
				// subtract overlapping portion
				prefix[i + 1][j + 1] = mat[i][j] + prefix[i + 1][j] + prefix[i][j + 1] - prefix[i][j];
			}
		}
		// opposite of prefix sum
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				int minX = Math.max(i - K - 1, 0), minY = Math.max(j - K - 1, 0);
				int maxX = Math.min(i + K, m), maxY = Math.min(j + K, n);
				// add down and right most cell and subtract the two sides
				// readd the overlapping portion
				answer[i - 1][j - 1] = prefix[maxX][maxY] - prefix[maxX][minY] - prefix[minX][maxY]
						+ prefix[minX][minY];
			}
		}
		return answer;
	}
}
