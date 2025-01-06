package javacore.algorithm.leetcode.under3200;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 3170. Lexicographically Minimum String After Removing Stars
 */
public class LexicographicallyMinimumStringAfterRemovingStars {
    public String clearStars(String s) {
        PriorityQueue<Tuple> pq = new PriorityQueue<>( (a, b) -> {
            if (a.c == b.c) return Integer.compare(b.idx, a.idx);
            return Character.compare(a.c, b.c);
        });
        int idx = 0;
        int x = 0;
        char prev = ' ';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' || c != prev) {
                if (prev != '*' && x > 0)
                    pq.offer(new Tuple(prev, x, idx++));
                prev = c;
                x = 1;
                if (c == '*' && !pq.isEmpty()) {
                    Tuple tp = pq.poll();
                    if (tp.t > 1) {
                        tp.t = tp.t - 1;
                        pq.offer(tp);
                    }
                }
            } else {
                x++;
            }
            if (i == s.length() - 1 && c != '*')
                pq.offer(new Tuple(c, x, idx++));
        }
        PriorityQueue<Tuple> ordered = new PriorityQueue<>(Comparator.comparingInt(t -> t.idx));
        ordered.addAll(pq);

        StringBuilder sb = new StringBuilder();
        while (!ordered.isEmpty()) {
            Tuple tp = ordered.poll();
            sb.append(String.valueOf(tp.c).repeat(Math.max(0, tp.t)));
        }
        return sb.toString();
    }

    class Tuple {
        public int idx;
        public int t;
        public char c;

        public Tuple(char c, int t, int idx) {
            this.idx = idx;
            this.t = t;
            this.c = c;
        }
    }
}
