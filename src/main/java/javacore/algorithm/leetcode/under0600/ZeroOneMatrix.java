package javacore.algorithm.leetcode.under0600;

/*
 * LeetCode 542. 01 Matrix
 */
public class ZeroOneMatrix {
	public int[][] updateMatrix(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[][] arr = new int[m][n];
		boolean[][] visited = new boolean[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 0) {
					if (i + 1 < m && mat[i + 1][j] == 1)
						traverse(mat, arr, visited, i + 1, j, i, j, m, n);
					if (j + 1 < n && mat[i][j + 1] == 1)
						traverse(mat, arr, visited, i, j + 1, i, j, m, n);
					if (i + 1 < m && j + 1 < n && mat[i + 1][j + 1] == 1)
						traverse(mat, arr, visited, i + 1, j + 1, i, j, m, n);
					if (i + 1 < m && j > 0 && mat[i + 1][j - 1] == 1)
						traverse(mat, arr, visited, i + 1, j - 1, i, j, m, n);
					if (j > 0 && mat[i][j - 1] == 1)
						traverse(mat, arr, visited, i, j - 1, i, j, m, n);
					if (i > 0 && j > 0 && mat[i - 1][j - 1] == 1)
						traverse(mat, arr, visited, i - 1, j - 1, i, j, m, n);
					if (i > 0 && mat[i - 1][j] == 1)
						traverse(mat, arr, visited, i - 1, j, i, j, m, n);
					if (i > 0 && j > 0 && mat[i - 1][j - 1] == 1)
						traverse(mat, arr, visited, i - 1, j - 1, i, j, m, n);
				}
			}
		}
		return arr;
	}

	private void traverse(int[][] mat, int[][] arr, boolean[][] visited, int i, int j, int x, int y, int m, int n) {
		if (mat[i][j] == 1) {
			int distance = Math.abs(x - i) + Math.abs(y - j);
			if (visited[i][j]) {
				if (distance < arr[i][j]) {
					arr[i][j] = distance;
				} else {
					return;
				}
			} else {
				visited[i][j] = true;
				arr[i][j] = distance;
			}
			if (i + 1 < m) {
				traverse(mat, arr, visited, i + 1, j, x, y, m, n);
				if (j + 1 < n)
					traverse(mat, arr, visited, i + 1, j + 1, x, y, m, n);
				if (j - 1 >= 0)
					traverse(mat, arr, visited, i + 1, j - 1, x, y, m, n);
			}
			if (j + 1 < n)
				traverse(mat, arr, visited, i, j + 1, x, y, m, n);

			if (i - 1 >= 0) {
				traverse(mat, arr, visited, i - 1, j, x, y, m, n);
				if (j - 1 >= 0)
					traverse(mat, arr, visited, i - 1, j - 1, x, y, m, n);
				if (j + 1 < n)
					traverse(mat, arr, visited, i - 1, j + 1, x, y, m, n);
			}
			if (j - 1 >= 0)
				traverse(mat, arr, visited, i, j - 1, x, y, m, n);
		}
	}
}
