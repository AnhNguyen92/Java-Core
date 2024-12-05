package javacore.algorithm.leetcode.under0800;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 767. Reorganize String
 */
public class ReorganizeString {
    public String reorganizeString(String s) {
        PriorityQueue<Pair> queue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.count, p1.count));
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            queue.offer(new Pair(count, character));
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (sb.isEmpty() || sb.charAt(sb.length() - 1) != p.c) {
                sb.append(p.c);
                if (p.count > 1) {
                    p.count = p.count - 1;
                    queue.offer(p);
                }
            } else if (!queue.isEmpty() && queue.peek().c != p.c) {
                Pair peek = queue.poll();
                sb.append(peek.c);
                if (peek.count > 1) {
                    peek.count = peek.count - 1;
                    queue.offer(peek);
                }
                queue.offer(p);
            } else {
                return "";
            }
        }
        return sb.toString();
    }

    public class Pair {
        public int count;
        public char c;

        public Pair(int count, char c) {
            this.count = count;
            this.c = c;
        }
    }
}
