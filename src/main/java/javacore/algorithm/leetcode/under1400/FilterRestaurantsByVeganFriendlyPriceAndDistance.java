package javacore.algorithm.leetcode.under1400;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 1333. Filter Restaurants by Vegan-Friendly, Price and Distance
 */
public class FilterRestaurantsByVeganFriendlyPriceAndDistance {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        Arrays.sort(restaurants, new Comparator<int[]>() {
            @Override
            public int compare(int[] r1, int[] r2) {
                if (r1[1] != r2[1]) {
                    return Integer.compare(r2[1], r1[1]);
                }
                return Integer.compare(r2[0], r1[0]);
            }
        });
        List<Integer> lst = new ArrayList<>();
        for (int[] restaurant : restaurants) {
            if ((veganFriendly == 0 || (veganFriendly == restaurant[2])) &&
                    restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                lst.add(restaurant[0]);
            }
        }
        return lst;
    }
}
