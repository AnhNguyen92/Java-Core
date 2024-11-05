package javacore.algorithm.leetcode.under1000;

import java.util.Arrays;

/*
 * 963. Minimum Area Rectangle II
 */
public class MinimumAreaRectangleII {
    public double minAreaFreeRect(int[][] points) {
        double min = 1.0 * Integer.MAX_VALUE;
        boolean found = false;
        for (int i = 0; i < points.length-3; i++) {
            for (int j = i+1; j < points.length-2; j++) {
                for (int k = j+1; k < points.length-1; k++) {
                    for (int l = k+1; l < points.length; l++) {
                        double area = canFormRectangle(points[i], points[j], points[k], points[l]);
                        if (area > 0) {
                            found = true;
                            min = Math.min(min, area);
                        }
                    }
                }
            }
        }
        return found ? min : 0;
    }

    public double canFormRectangle(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = {p1, p2, p3, p4};
        Arrays.sort(points, (a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        double[] d = new double[6];
        d[0] = distanceSquared(points[0], points[1]);
        d[1] = distanceSquared(points[0], points[2]);
        d[2] = distanceSquared(points[0], points[3]);
        d[3] = distanceSquared(points[1], points[2]);
        d[4] = distanceSquared(points[1], points[3]);
        d[5] = distanceSquared(points[2], points[3]);

        if (d[0] == d[5] && d[1] == d[4] && d[0] + d[1] == d[3] && d[0] + d[4] == d[2] ) {
            return Math.sqrt(d[0] * d[1]);
        }
        if (d[1] == d[4] && d[2] == d[3] && d[1] + d[2] == d[5] && d[1] + d[3] == d[0] ) {
            return Math.sqrt(d[1] * d[2]);
        }
        if ( d[0] == d[5] && d[2] == d[3] && d[1] + d[2] == d[5] && d[1] + d[3] == d[0] ) {
            return Math.sqrt(d[0] * d[2]);
        }

        return -1;
    }

    private double distanceSquared(int[] p1, int[] p2) {
        return Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2);
    }
}
