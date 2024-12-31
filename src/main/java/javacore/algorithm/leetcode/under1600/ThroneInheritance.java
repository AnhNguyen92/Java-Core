package javacore.algorithm.leetcode.under1600;

import java.util.*;

/**
 * 1600. Throne Inheritance
 */
public class ThroneInheritance {
    Set<String> dead;
    Map<String, List<String>> kingOrder;
    String king;

    public ThroneInheritance(String kingName) {
        dead = new HashSet<>();
        king = kingName;
        kingOrder = new HashMap<>();
        kingOrder.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        kingOrder.computeIfAbsent(parentName, k -> new ArrayList<>()).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> lst = new ArrayList<>();
        addKing(king, lst);
        return lst;
    }

    public void addKing(String king, List<String> lst) {
        if (!dead.contains(king)) {
            lst.add(king);
        }
        List<String> children = kingOrder.get(king);
        if (children != null) {
            for (String child : children) {
                addKing(child, lst);
            }
        }
    }

}
