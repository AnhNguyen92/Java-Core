package javacore.algorithm.leetcode.under1500;

import java.util.ArrayList;
import java.util.List;

/*
 * LeetCode 1496. Path Crossing
 */
public class PathCrossing {
	public boolean isPathCrossing(String path) {
        int x = 0;
        int y = 0;
        List<String> lst = new ArrayList<>();
        lst.add("0-0");
        for (char c : path.toCharArray()) {
            if (c == 'N') {
                x++;
            } else if (c == 'E') {
                y++;
            } else if (c == 'S') {
                x--;
            } else if (c == 'W') {
                y--;
            }
            if (lst.contains(x + "-" + y)) {
                return true;
            }
            lst.add(x + "-" + y);
        }
        return false;
    }
}
