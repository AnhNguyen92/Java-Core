package javacore.algorithm.leetcode.under0100;

import java.util.ArrayList;
import java.util.List;

/**
 * 68. Text Justification
 */
public class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lst = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int x, y;
        int itemCount = 0;
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            x = str.length();
            y = sb.length();
            if (y == 0 && y + x == maxWidth) {
                lst.add(str);
                itemCount = 0;
            }
            // sb + " " + str < maxWidth
            else if (x + y < maxWidth - 1) {
                if (y > 0) sb.append(" ");
                sb.append(str);
                itemCount++;
            }
            // sb + " " + str < maxWidth
            else if (x + y == maxWidth - 1) {
                if (y > 0)
                    lst.add(sb.append(" ").append(str).toString());
                else {
                    lst.add(sb.append(str).append(" ").toString());
                }
                itemCount = 0;
                sb = new StringBuilder();
            }
            // sb + " " + str > maxWidth
            else {
                if (itemCount > 1) {
                    int count = maxWidth - y;
                    int remind = count % (itemCount - 1);
                    int time = count / (itemCount - 1);
                    boolean insert = false;
                    for (int j = 0; j < sb.length() && count > 0; j++) {
                        if (sb.charAt(j) != ' ') {
                            insert = true;
                        } else {
                            if (insert) {
                                sb.insert(j, " ".repeat(time));
                                count -= time;
                                j += time;
                                if (remind-- > 0) {
                                    sb.insert(j, " ");
                                    count--;
                                }
                                insert = false;
                            }
                        }
                    }
                } else {
                    sb.append(" ".repeat(maxWidth - y));
                }
                lst.add(sb.toString());
                itemCount = 1;
                sb = new StringBuilder(str);
            }
            if (i == words.length - 1 && !sb.isEmpty()) {
                sb.append(" ".repeat(maxWidth - sb.length()));
                lst.add(sb.toString());
            }
        }
        return lst;
    }
}
