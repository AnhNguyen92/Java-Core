package javacore.algorithm.leetcode.under3300;

import java.util.*;

/**
 * 3295. Report Spam Message
 */
public class ReportSpamMessage {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        Set<String> set = new HashSet<>(Arrays.asList(bannedWords));
        List<String> set2 = new ArrayList<>();
        Collections.addAll(set2, message);
        set2.retainAll(set);
        return set2.size() >= 2;
    }
}
