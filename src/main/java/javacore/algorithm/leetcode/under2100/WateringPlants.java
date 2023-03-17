package javacore.algorithm.leetcode.under2100;

/*
 * LeetCode 2079. Watering Plants
 */
public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int amount = 0;
        int units = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (units >= plants[i]) {
                amount++;
                units -= plants[i];
            } else {
                amount += 2 * i + 1;
                units = capacity - plants[i];
            }
        }

        return amount;
    }
}
