package javacore.algorithm.leetcode.under0900;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 822. Card Flipping Game
 */
public class CardFlippingGame {
    public int flipGame(int[] fronts, int[] backs) {
        Set<Integer> notGoods = new HashSet<>();
        Set<Integer> candidates = new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if (fronts[i] == backs[i]) {
                notGoods.add(fronts[i]);
            } else {
                candidates.add(fronts[i]);
                candidates.add(backs[i]);
            }
        }
        candidates.removeAll(notGoods);
        return candidates.isEmpty() ? 0 : Collections.min(candidates);
    }
}
