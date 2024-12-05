package javacore.algorithm.leetcode.under0900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 869. Reordered Power of 2
 */
public class ReorderedPowerOf2 {
    public boolean reorderedPowerOf2(int n) {
        List<Integer> permutations = getPermutations(n);

        for (Integer num : permutations) {
            if (isPowerOfTwo(num))
                return true;
        }
        return false;
    }

    public boolean isPowerOfTwo(int n) {
        long m = n;
        if (n == 0) {
            return false;
        }
        return ((m & m - 1) == 0);
    }

    public List<Integer> getPermutations(int n) {
        String numberStr = String.valueOf(n);
        char[] arr = numberStr.toCharArray();
        Arrays.sort(arr);
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[arr.length];
        StringBuilder current = new StringBuilder();

        generatePermutations(arr, visited, current, result);

        return result;
    }

    private void generatePermutations(char[] arr, boolean[] visited, StringBuilder current, List<Integer> result) {
        if (current.length() == arr.length) {
            if (current.charAt(0) != '0') {
                result.add(Integer.parseInt(current.toString()));
            }
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            if (i > 0 && arr[i] == arr[i - 1] && !visited[i - 1]) continue;

            visited[i] = true;
            current.append(arr[i]);
            generatePermutations(arr, visited, current, result);
            visited[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }
}
