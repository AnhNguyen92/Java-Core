package javacore.algorithm.leetcode.under2200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2115. Find All Possible Recipes from Given Supplies
 */
public class FindAllPossibleRecipesFromGivenSupplies {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        List<String> ans = new ArrayList<>();
        Map<String, Boolean> map = new HashMap<>();
        boolean[] marked = new boolean[recipes.length];
        for (String s : supplies) {
            map.put(s, true);
        }
        boolean addMore = true;
        while (addMore) {
            addMore = false;
            for (int i = 0; i < recipes.length; i++) {
                if (marked[i])
                    continue;
                boolean enable = true;
                for (String ingredient : ingredients.get(i)) {
                    if (map.get(ingredient) == null) {
                        enable = false;
                        break;
                    }
                }
                if (enable) {
                    addMore = true;
                    marked[i] = true;
                    map.put(recipes[i], true);
                    ans.add(recipes[i]);
                }
            }
        }
        return ans;
    }
}
