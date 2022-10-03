package javacore.algorithm.leetcode.under2400;

public class CheckDistancesBetweenSameLetters {
    public boolean checkDistances(String s, int[] distance) {
        int len = s.length();
        boolean[] arr = new boolean[len];
        int next;
        for (int i = 0; i < len; i++) {
            if (!arr[i]) {
                next = i + distance[s.charAt(i) - 'a'] + 1;
                if (!arr[i] && next < len && s.charAt(i) == s.charAt(next)) {
                    arr[i] = true;
                    arr[next] = true;
                }
            }
        }
        for (boolean b : arr) {
            if (!b) {
                return false;
            }
        }
        return true;
    }
}
