package javacore.algorithm.leetcode.under0500;

/**
 * 481. Magical String
 */
public class MagicalString {
    public int magicalString(int n) {
        StringBuilder sb = new StringBuilder("122");
        int idx = 2;
        boolean addOne = true;
        int count = 1;
        while (sb.length() < n) {
            int time = sb.charAt(idx) - '0';
            if (addOne) {
                sb.append("1".repeat(time));
                count += time;
            } else {
                sb.append("2".repeat(time));
            }
            addOne = !addOne;
            idx++;
        }

        for (int i = sb.length() - 1; i >= n; i--) {
            if (sb.charAt(i) == '1')
                count--;
        }
        return count;
    }
}
