package javacore.algorithm.leetcode.under1100;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1079. Letter Tile Possibilities
 */
public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            counter.merge(c, 1, Integer::sum);
        }
        Set<String> results = new HashSet<>();
        for (int i = 1; i <= tiles.length(); i++) {
            this.backtrack(new StringBuilder(), i, counter, results);
        }
        return results.size();
    }

    protected void backtrack(StringBuilder sb, int n, Map<Character, Integer> counter, Set<String> results) {
        if (sb.length() == n) {
            results.add(sb.toString());
        } else {
            for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
                Character c = entry.getKey();
                Integer count = entry.getValue();
                if (count == 0) continue;
                sb.append(c);
                counter.put(c, count - 1);

                backtrack(sb, n, counter, results);

                sb.deleteCharAt(sb.length() - 1);
                counter.put(c, count);
            }
        }
    }
}
