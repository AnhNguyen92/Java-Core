package javacore.algorithm.leetcode.under2400;

import java.util.ArrayList;
import java.util.List;

/**
 * 2337. Move Pieces to Obtain a String
 */
public class MovePiecesToObtainAString {
    public boolean canChange(String start, String target) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        List<Integer> tl = new ArrayList<>();
        List<Integer> tr = new ArrayList<>();
        List<Integer> sl = new ArrayList<>();
        List<Integer> sr = new ArrayList<>();
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                sl.add(i);
                sb1.append(start.charAt(i));
            } else if (start.charAt(i) == 'R') {
                sr.add(i);
                sb1.append(start.charAt(i));
            }
            if (target.charAt(i) == 'L') {
                tl.add(i);
                sb2.append(target.charAt(i));
            } else if (target.charAt(i) == 'R') {
                tr.add(i);
                sb2.append(target.charAt(i));
            }
        }
        if (!sb1.toString().contentEquals(sb2))
            return false;

        if (sl.size() != tl.size())
            return false;

        for (int i = 0; i < sl.size(); i++)
            if (sl.get(i) < tl.get(i))
                return false;

        for (int i = 0; i < sr.size(); i++)
            if (sr.get(i) > tr.get(i))
                return false;

        return true;
    }
}
