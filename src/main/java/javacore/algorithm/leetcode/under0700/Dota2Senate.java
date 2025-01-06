package javacore.algorithm.leetcode.under0700;

/**
 * 649. Dota2 Senate
 */
public class Dota2Senate {
    public String predictPartyVictory(String senate) {
        StringBuilder sb = new StringBuilder();
        int d = 0;
        int r = 0;
        for (int i = 0; i < senate.length(); i++) {
            char c = senate.charAt(i);
            if (c == 'D') {
                if (r == 0) {
                    sb.append(c);
                    d++;
                } else
                    r--;
            } else {
                if (d == 0) {
                    sb.append(c);
                    r++;
                } else
                    d--;
            }
        }
        if (d == senate.length())    return "Dire";
        else if (r == senate.length()) return "Radiant";
        else if (r > 0) {
            while (r > 0 && sb.indexOf("D") >= 0) {
                int i = sb.indexOf("D");
                sb.deleteCharAt(i);
                r--;
            }
            if (r > 0)
                return "Radiant";
        } else if (d > 0) {
            while (d > 0 && sb.indexOf("R") >= 0) {
                int i = sb.indexOf("R");
                sb.deleteCharAt(i);
                d--;
            }
            if (d > 0)
                return "Dire";
        }
        return predictPartyVictory(sb.toString());
    }
}
