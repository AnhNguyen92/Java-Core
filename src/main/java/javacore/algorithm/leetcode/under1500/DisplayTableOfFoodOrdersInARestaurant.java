package javacore.algorithm.leetcode.under1500;

import java.util.*;

/**
 * 1418. Display Table of Food Orders in a Restaurant
 */
public class DisplayTableOfFoodOrdersInARestaurant {
    public List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<Integer, Map<String, Integer>> map = new TreeMap<>();
        Set<String> selectedFood = new HashSet<>();
        for (List<String> order : orders) {
            selectedFood.add(order.get(2));
            Map<String, Integer> food = map.getOrDefault(Integer.parseInt(order.get(1)), new TreeMap<>());
            food.merge(order.get(2), 1, Integer::sum);
            map.put(Integer.parseInt(order.get(1)), food);
        }
        List<List<String>> ans = new ArrayList<>();
        List<String> foodLst = new ArrayList<>(selectedFood);
        Collections.sort(foodLst);
        foodLst.add(0, "Table");
        ans.add(foodLst);
        for (Integer k : map.keySet()) {
            List<String> row = new ArrayList<>();
            Map<String, Integer> tableOrder = map.get(k);
            row.add("" + k);
            for (int i = 1; i < foodLst.size(); i++) {
                String foodName = foodLst.get(i);
                row.add(String.valueOf(tableOrder.getOrDefault(foodName, 0)));
            }
            ans.add(row);
        }
        return ans;
    }
}
