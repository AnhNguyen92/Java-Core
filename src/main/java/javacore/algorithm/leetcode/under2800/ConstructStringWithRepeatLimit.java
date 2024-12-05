package javacore.algorithm.leetcode.under2800;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 2182. Construct String With Repeat Limit
 */
public class ConstructStringWithRepeatLimit {
    public String repeatLimitedString(String s, int repeatLimit) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        StringBuilder ans = new StringBuilder();
        PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> y.character - x.character);
        map.forEach((k,v) -> pq.offer(new Pair(v, k)));
        int len = 0;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            int count = p.count;
            char character = p.character;
            boolean enable = len < repeatLimit;
            if (!enable) {
                for (int i = len - 1; i >= len - repeatLimit; i--) {
                    if (ans.charAt(i) != character) {
                        enable = true;
                        break;
                    }
                }
            }

            if (enable) {
                int n = Math.min(count, repeatLimit);
                count -= n;
                len += n;
                ans.append(String.valueOf(character).repeat(n));
            } else {
                if (pq.isEmpty()) break;
                Pair temp = pq.poll();
                ans.append(temp.character);
                len++;
                if (temp.count - 1 > 0) {
                    pq.add(new Pair(temp.count - 1, temp.character));
                }
            }

            if (count > 0) {
                pq.add(new Pair(count, character));
            }
        }
        return ans.toString();
    }

    class Pair {
        int count;
        char character;

        Pair(int count, char character) {
            this.count = count;
            this.character = character;
        }
    }
}
