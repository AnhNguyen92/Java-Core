package javacore.algorithm.leetcode.under1900;

import java.util.Arrays;

/*
 * LeetCode 1834. Single-Threaded CPU
 */
public class SingleThreadedCPU {
	public static void main(String[] args) {
		int[][] tasks = {{ 2, 4 },  { 1, 2 }, { 3, 2 }, { 4, 1 } };
		//int[][] tasks = {{ 7, 10 },  { 7, 12 }, { 7, 5 }, { 7, 4 }, { 7, 2 } };
		Arrays.sort(tasks, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			}
			return a[0] - b[0];
		});
		for (int i = 0; i < tasks.length; i++) {
			for (int j = 0; j < tasks[0].length; j++) {
				System.out.print(tasks[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int[] getOrder(int[][] tasks) {
		Arrays.sort(tasks, (a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1];
			}
			return a[0] - b[0];
		});
		int[] arr = new int[tasks.length];
		
		return arr;
	}
}
