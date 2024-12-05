package javacore.algorithm.leetcode.under1200;

import java.util.ArrayList;
import java.util.List;

/**
 * 1104. Path In Zigzag Labelled Binary Tree
 */
public class PathInZigzagLabelledBinaryTree {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> lst = new ArrayList<>();
        int level = (int) (Math.log(label) / Math.log(2));
        int min = 1;
        int max = 2;
        for (int i = 0; i <= level; i++) {
            if (i % 2 == 0) {
                for (int j = min; j < max; j++)
                    lst.add(j);
            } else {
                for (int j = max - 1; j >= min; j--)
                    lst.add(j);
            }
            min = max;
            max *= 2;
        }
        List<Integer> ans = new ArrayList<>();
        ans.add(0, label);
        while (label != 1) {
            int index = lst.indexOf(label);
            int parentIndex = (index - 1) / 2;
            label =  lst.get(parentIndex);
            ans.add(0, label);
        }
        return ans;
    }
}
