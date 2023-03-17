package javacore.algorithm.leetcode.under2200;

/*
 * LeetCode 2120. Execution of All Suffix Instructions Staying in a Grid
 */
public class ExecutionOfAllSuffixInstructionsStayingInAGrid {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        char c;
        int len = s.length();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            int ans = 0;
            int[] start = new int[]{startPos[0], startPos[1]};
            for (int j = i; j < len; j++) {
                c = s.charAt(j);
                if (c == 'R') {
                    start[1]++;
                    if (start[1] < n) {
                        ans++;
                    } else {
                        break;
                    }
                } else if (c == 'L') {
                    start[1]--;
                    if (start[1] >= 0) {
                        ans++;
                    } else {
                        break;
                    }
                } else if (c == 'D') {
                    start[0]++;
                    if (start[0] < n) {
                        ans++;
                    } else {
                        break;
                    }
                } else {
                    start[0]--;
                    if (start[0] >= 0) {
                        ans++;
                    } else {
                        break;
                    }
                }
            }
            arr[i] = ans;
        }
        return arr;
    }
}
