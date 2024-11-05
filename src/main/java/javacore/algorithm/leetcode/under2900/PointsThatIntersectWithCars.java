package javacore.algorithm.leetcode.under2900;

import java.util.List;
import java.util.Objects;

/**
 * 2848. Points That Intersect With Cars
 */
public class PointsThatIntersectWithCars {
    public int numberOfPoints(List<List<Integer>> nums) {
        nums.sort((a, b) -> {
            if (!Objects.equals(a.get(0), b.get(0))) {
                return a.get(0) - b.get(0);
            }
            return a.get(1) - b.get(1);
        });
        int count = 0;
        int prev = -1;
        for (List<Integer> lst : nums) {
            if (lst.get(0) > prev) {
                count += lst.get(1) - lst.get(0) + 1;
                prev = lst.get(1);
            } else if (lst.get(1) > prev) {
                count += lst.get(1) - prev;
                prev = lst.get(1);
            }

        }
        return count;
    }
}
