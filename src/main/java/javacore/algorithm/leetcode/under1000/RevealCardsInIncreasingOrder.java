package javacore.algorithm.leetcode.under1000;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 950. Reveal Cards In Increasing Order
 */
public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> queue = new ArrayDeque<>();
        int n = deck.length;
        queue.push(deck[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            queue.offerFirst(queue.removeLast());
            queue.addFirst(deck[i]);
        }
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = queue.pollFirst();
        }
        return ans;
    }
}
