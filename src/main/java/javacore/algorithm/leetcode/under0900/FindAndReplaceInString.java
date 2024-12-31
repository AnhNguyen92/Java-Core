package javacore.algorithm.leetcode.under0900;

import java.util.*;

/**
 * 833. Find And Replace in String
 */
public class FindAndReplaceInString {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        List<Tripple> lst = new ArrayList<>();
        for (int i = 0; i < indices.length; i++) {
            Tripple t = new Tripple(indices[i], sources[i], targets[i]);
            lst.add(t);
        }
        lst.sort(Comparator.comparingInt(a -> a.j));
        Map<Integer, Boolean> blackLst = new HashMap<>();
        int cur = 0;
        for (Tripple t : lst) {
            if (!blackLst.containsKey(t.j) && s.startsWith(t.s, cur + t.j)) {
                blackLst.put(t.j, true);
                s = s.substring(0, cur + t.j) + t.t + s.substring(cur + t.j + t.s.length());
                cur += t.t.length() - t.s.length();
            }
        }
        return s;
    }

    public class Tripple {
        public int j;
        public String s;
        public String t;

        public Tripple(int j, String s, String t) {
            this.j = j;
            this.s = s;
            this.t = t;
        }
    }
}
