package javacore.algorithm.leetcode.under3300;

/*
 * LeetCode 3206. Alternating Groups I
 * */
public class AlternatingGroupsI {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        if (colors[0] != colors[1] && colors[1] == colors[n-1])
            count++;
        if (colors[0] == colors[n-2] && colors[n-2] != colors[n-1])
            count++;

        for (int i = 1; i < n-1; i++) {
            if ( colors[i] != colors[i+1]
                    && colors[i+1] == colors[i-1]) {
                count++;
            }
        }
        return count;
    }
}
