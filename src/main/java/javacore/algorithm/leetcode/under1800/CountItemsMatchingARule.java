package javacore.algorithm.leetcode.under1800;

import java.util.List;

/*
 * LeetCode 1773. Count Items Matching a Rule
 */
public class CountItemsMatchingARule {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = ruleKey.equals("type") ? 0 : (ruleKey.equals("color") ? 1 : 2);
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue))
                count++;
        }
        return count;
    }
}
