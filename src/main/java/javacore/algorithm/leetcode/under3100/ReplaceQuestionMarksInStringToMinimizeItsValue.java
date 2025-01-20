package javacore.algorithm.leetcode.under3100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 3081. Replace Question Marks in String to Minimize Its Value
 */
public class ReplaceQuestionMarksInStringToMinimizeItsValue {
    public String minimizeStringValue(String s) {
        int[] arr = new int[26];
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '?') {
                lst.add(i);
            } else {
                arr[c - 'a']++;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.t != b.t)
                return Integer.compare(a.t, b.t);
            return Character.compare(a.c, b.c);
        });
        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            pq.offer(new Pair(c, arr[i]));
        }
        List<Character> replaces = new ArrayList<>();
        for (int i : lst) {
            Pair p = pq.poll();
            replaces.add(p.c);
            p.t = p.t + 1;
            pq.offer(p);
        }
        Collections.sort(replaces);
        char[] srr = s.toCharArray();
        for (int i = 0; i < lst.size(); i++) {
            srr[lst.get(i)] = replaces.get(i);
        }
        return new String(srr);
    }

    public class Pair {
        public char c;
        public int t;

        public Pair(char c, int t) {
            this.c = c;
            this.t = t;
        }
    }
}
