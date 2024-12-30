package javacore.algorithm.leetcode.under0600;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 593. Valid Square
 */
public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[][] points = new int[4][2];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
        Arrays.sort(points, (a, b) -> {
            if (a[0] < b[0]) {
                return 1;
            } else if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return 0;
        });
        return isSquare(points);
    }

    private int distanceSquared(int[] p1, int[] p2) {
        return (p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]);
    }

    public boolean isSquare(int[][] points) {
        if (points == null || points.length != 4) {
            return false;
        }

        List<Integer> distances = new ArrayList<>();

        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                distances.add(distanceSquared(points[i], points[j]));
            }
        }

        Collections.sort(distances);

        return distances.get(0).equals(distances.get(1)) &&
                distances.get(1).equals(distances.get(2)) &&
                distances.get(2).equals(distances.get(3)) &&  // Four sides
                distances.get(4).equals(distances.get(5)) &&  // Two diagonals
                distances.get(4) > distances.get(0);          // Diagonal is greater than side
    }
}
