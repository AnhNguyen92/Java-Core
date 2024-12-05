package javacore.algorithm.leetcode.under3300;

import java.util.List;

/**
 * 3248. Snake in Matrix
 */
public class SnakeInMatrix {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int y = 0;
        for (String s : commands) {
            if (s.equals("RIGHT")) {
                y++;
            } else if (s.equals("LEFT")) {
                y--;
            } else if (s.equals("UP")) {
                y -= n;
            } else {
                y += n;
            }
        }
        return y;
    }
}
