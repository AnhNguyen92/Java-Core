package javacore.algorithm.leetcode.under1300;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * LeetCode 1233. Remove Sub-Folders from the Filesystem
 */
public class RemoveSubFoldersFromTheFilesystem {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String s = folder[0];
        List<String> lst = new ArrayList<>();
        lst.add(s);
        for (String str : folder) {
            if (!str.equals(s) && !str.startsWith(s + "/")) {
                lst.add(str);
                s = str;
            }
        }
        return lst;
    }
}
