package javacore.algorithm.leetcode.under0900;

/*
 * LeetCode 812. Largest Triangle Area
 */
public class LargestTriangleArea {
	public double largestTriangleArea(int[][] points) {
		double max = 0.0;
		double x;
		double y;
		double z;
		double s;
		for (int i = 0; i < points.length - 2; i++) {
			for (int j = i + 1; j < points.length - 1; j++) {
				x = distance(points[i], points[j]);
				for (int k = j + 1; k < points.length; k++) {
					y = distance(points[i], points[k]);
					z = distance(points[j], points[k]);
					s = area(x, y, z);
					if (s > max) {
						max = s;
					}
				}
			}
		}
		return max;
	}

	private double area(double a, double b, double c) {
		double p = perimeter(a, b, c);
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	private double perimeter(double a, double b, double c) {
		return (a + b + c) / 2;
	}

	private double distance(int[] a, int[] b) {
		return Math.sqrt((a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]));
	}
}
