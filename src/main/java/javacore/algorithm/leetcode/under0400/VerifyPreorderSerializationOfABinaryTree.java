package javacore.algorithm.leetcode.under0400;

import java.util.LinkedList;
import java.util.Queue;

/*
* LeetCode 331. Verify Preorder Serialization of a Binary Tree
*/
public class VerifyPreorderSerializationOfABinaryTree {
    public boolean isValidSerialization(String preorder) {
        if (preorder.equals("#")) {
            return true;
        }
        String[] arr = preorder.split(",");
        if (arr[0].equals("#") || arr.length < 3)
            return false;
        Queue<String> queue = new LinkedList<>();
        queue.add(arr[0]);
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            String s = queue.poll();
            if (i + 1 >= arr.length) {
                return false;
            }
            if (!arr[i].equals("#")) {
                queue.add(arr[i]);
            }
            i++;
            if (!arr[i].equals("#")) {
                queue.add(arr[i]);
            }
            i++;
        }
        return i == arr.length;
    }
}
