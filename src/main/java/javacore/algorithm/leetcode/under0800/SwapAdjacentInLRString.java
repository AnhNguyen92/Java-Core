package javacore.algorithm.leetcode.under0800;

import java.util.ArrayList;
import java.util.List;

/**
 * 777. Swap Adjacent in LR String
 */
public class SwapAdjacentInLRString {
    public boolean canTransform(String start, String result) {
        if (!rawStr(start).equals(rawStr(result)))
            return false;
        List<Integer> tl = new ArrayList<>();
        List<Integer> tr = new ArrayList<>();
        List<Integer> sl = new ArrayList<>();
        List<Integer> sr = new ArrayList<>();
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                sl.add(i);
            } else if (start.charAt(i) == 'R') {
                sr.add(i);
            }
            if (result.charAt(i) == 'L') {
                tl.add(i);
            } else if (result.charAt(i) == 'R') {
                tr.add(i);
            }
        }
        if (sl.size() != tl.size()) {
            return false;
        }
        for (int i = 0; i < sl.size(); i++) {
            if (sl.get(i) < tl.get(i)) {
                return false;
            }
        }
        for (int i = 0; i < sr.size(); i++) {
            if (sr.get(i) > tr.get(i)) {
                return false;
            }
        }
        return true;
    }

    private String rawStr(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != 'X') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
