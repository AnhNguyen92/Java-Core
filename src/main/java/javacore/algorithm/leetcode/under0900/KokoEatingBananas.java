package javacore.algorithm.leetcode.under0900;

import java.util.Arrays;

/**
 * 875. Koko Eating Bananas
 */
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l = 1;
        int r = piles[piles.length - 1];
        while (r - l > 1) {
            int mid = (l + r) / 2;
            int hour = timeToEat(piles, mid);
            if (hour <= h)   r = mid;
            else l = mid;
        }
        return (timeToEat(piles, l) <= h) ? l : r;
    }

    private int timeToEat(int[] arr, int k) {
        int time = 0;
        for (int i : arr) {
            time += i/k + (i % k > 0 ? 1 : 0);
        }
        return time;
    }
}
