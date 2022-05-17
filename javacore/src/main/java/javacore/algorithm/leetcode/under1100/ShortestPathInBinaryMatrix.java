package javacore.algorithm.leetcode.under1100;

/*
 * LeetCode 1091
 */
public class ShortestPathInBinaryMatrix {
	public static void main(String[] args) {
		int[][] grid = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		System.out.println(shortestPathBinaryMatrix(grid));
	}

	public static int shortestPathBinaryMatrix(int[][] grid) {
		return path(grid, grid, 0, 0, 0);
	}

	private static int path(int[][] grid, int[][] arr, int count, int x, int y) {
		System.out.print(x + " " + y + " " + count + ", ");
		if (arr[x][y] == 1) {
			return -1;
		}
		arr[x][y] = 1;
		count++;
		if (x == grid.length - 1 && y == grid[x].length - 1) {
			System.out.println(count);
			return count;
		}
		int val = -1;
		int temp;
		if (x + 1 < grid.length && arr[x + 1][y] == 0) {
			temp = path(grid, arr, count, x + 1, y);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x + 1][y] = 0;
		}
		if (x + 1 < grid.length && y + 1 < grid[x].length && arr[x + 1][y + 1] == 0) {
			temp = path(grid, arr, count, x + 1, y + 1);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x + 1][y + 1] = 0;
		}
		if (x + 1 < grid.length && y - 1 >= 0 && arr[x + 1][y - 1] == 0) {
			temp = path(grid, arr, count, x + 1, y - 1);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x + 1][y - 1] = 0;
		}
		if (x - 1 >= 0 && arr[x - 1][y] == 0) {
			temp = path(grid, arr, count, x - 1, y);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x - 1][y] = 0;
		}
		if (x - 1 >= 0 && y + 1 < arr[x].length && arr[x - 1][y + 1] == 0) {
			temp = path(grid, arr, count, x - 1, y + 1);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x - 1][y + 1] = 0;
		}
		if (x - 1 >= 0 && y - 1 >= 0 && arr[x - 1][y - 1] == 0) {
			temp = path(grid, arr, count, x - 1, y - 1);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x - 1][y - 1] = 0;
		}

		if (y + 1 < grid[x].length && arr[x][y + 1] == 0) {
			temp = path(grid, arr, count, x, y + 1);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(count, temp);
			}
			arr[x][y + 1] = 0;
		}
		if (y - 1 >= 0 && arr[x][y - 1] == 0) {
			temp = path(grid, arr, count, x, y - 1);
			if (temp != -1) {
				val = (val == -1) ? temp : Math.min(val, temp);
			}
			arr[x][y - 1] = 0;
		}
		return val;
	}
}
