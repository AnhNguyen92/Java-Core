package javacore.algorithm.leetcode.under2400;

import java.util.*;

/**
 * 2353. Design a Food Rating System
 */
public class DesignAFoodRatingSystem {
    class FoodRatings {
        Map<String, Object[]> foodMap = new HashMap<>();
        Map<String, TreeMap<Integer, Queue<String>>> cusineMap = new HashMap<>();

        public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
            for (int i = 0; i < foods.length; i++) {
                foodMap.put(foods[i], new Object[] { ratings[i], cuisines[i] });
                TreeMap<Integer, Queue<String>> rateMap = cusineMap.getOrDefault(cuisines[i], new TreeMap<>(Collections.reverseOrder()));
                Queue<String> foodLst = rateMap.getOrDefault(ratings[i], new PriorityQueue<>());
                foodLst.offer(foods[i]);
                rateMap.put(ratings[i], foodLst);
                cusineMap.put(cuisines[i], rateMap);
            }
        }

        public void changeRating(String food, int newRating) {
            int rate = (int) foodMap.get(food)[0];
            String cuisine = (String) foodMap.get(food)[1];
            foodMap.put(food, new Object[] { newRating, cuisine });
            cusineMap.get(cuisine).get(rate).remove(food);
            if (cusineMap.get(cuisine).get(rate).isEmpty()) {
                cusineMap.get(cuisine).remove(rate);
            }
            TreeMap<Integer, Queue<String>> rateMap = cusineMap.getOrDefault(cuisine, new TreeMap<>(Collections.reverseOrder()));
            Queue<String> foodLst = rateMap.getOrDefault(newRating, new PriorityQueue<>());
            foodLst.offer(food);
            rateMap.put(newRating, foodLst);
            cusineMap.put(cuisine, rateMap);
        }

        public String highestRated(String cuisine) {
            TreeMap<Integer, Queue<String>> rateMap = cusineMap.get(cuisine);
            Integer highestRate = rateMap.firstKey();
            return rateMap.get(highestRate).peek();
        }

    }

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
}
