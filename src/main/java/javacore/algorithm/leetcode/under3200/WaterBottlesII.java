package javacore.algorithm.leetcode.under3200;

/**
 * 3100. Water Bottles II
 */
public class WaterBottlesII {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunk = 0;
        int empty = 0;
        while (numBottles > 0) {
            drunk += numBottles;
            empty += numBottles;
            numBottles = 0;
            while (empty >= numExchange) {
                empty -= numExchange;
                numExchange++;
                numBottles += 1;
            }
        }
        return drunk;
    }
}
