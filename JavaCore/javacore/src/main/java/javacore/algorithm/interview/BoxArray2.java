package javacore.algorithm.interview;

import java.util.ArrayList;
import java.util.List;

public class BoxArray2 {
    public static void main(String[] args) {
        List<Integer> boxA = initListBoxA();
        List<Integer> boxB = initListBoxB();
        List<Integer> boxC = initListBoxC();

        mergeListBox(boxA, boxB, boxC);
        if (boxA.isEmpty() && !boxB.isEmpty()) {
            moveBox(0, boxB.size() - 1, boxB, boxA, boxC);
        } else if (boxA.isEmpty() && !boxC.isEmpty()) {
            moveBox(0, boxC.size() - 1, boxB, boxA, boxC);
        }
        System.out.print("Box A: ");
        boxA.forEach(item -> System.out.print(item + ", "));
        System.out.print("\nBox B: ");
        boxB.forEach(item -> System.out.print(item + ", "));
        System.out.print("\nBox C: ");
        boxC.forEach(item -> System.out.print(item + ", "));
        System.out.println();

        // Check and reorder
        
        int i = findMaxPositioninBoxList(boxA);
        while (i < boxA.size()) {
            moveBox(0, i - 1, boxA, boxB, boxC);
            mergeListBox(boxA, boxB, boxC);
            if (!boxB.isEmpty()) {
                moveBox(0, boxB.size() - 1, boxB, boxA, boxC);
            }
            i = findMaxPositioninBoxList(boxA);
        }
        System.out.print("Box A: ");
        boxA.forEach(item -> System.out.print(item + ", "));
        System.out.print("\nBox B: ");
        boxB.forEach(item -> System.out.print(item + ", "));
        System.out.print("\nBox C: ");
        boxC.forEach(item -> System.out.print(item + ", "));
        System.out.println();
    }

    private static int findMaxPositioninBoxList(List<Integer> boxA) {
        int min = boxA.get(0);
        int i = 0;
        while (i < boxA.size() && boxA.get(i) >= min) {
            min = boxA.get(i);
            i++;
        }
        return i;
    }

    private static void mergeListBox(List<Integer> boxA, List<Integer> boxB, List<Integer> boxC) {
        int maxA;
        int maxB;
        int maxC;
        while ((!boxA.isEmpty() && !boxB.isEmpty()) || (!boxB.isEmpty() && !boxC.isEmpty()) || (!boxA.isEmpty() && !boxC.isEmpty())) {
            maxA = boxA.isEmpty() ? Integer.MAX_VALUE : boxA.get(0);
            maxB = boxB.isEmpty() ? Integer.MAX_VALUE : boxB.get(0);
            maxC = boxC.isEmpty() ? Integer.MAX_VALUE : boxC.get(0);
            System.out.println("=========================");
            System.out.print("Box A: ");
            boxA.forEach(item -> System.out.print(item + ", "));
            System.out.print("\nBox B: ");
            boxB.forEach(item -> System.out.print(item + ", "));
            System.out.print("\nBox C: ");
            boxC.forEach(item -> System.out.print(item + ", "));
            System.out.println("\n=========================");
            if (maxA >= maxB && maxA >= maxC) {
                if (maxB >= maxC) {
                    moveItem(boxC, boxB, boxA);
                } else {
                    moveItem(boxB, boxC, boxA);
                }
            } else if (maxB >= maxA && maxB >= maxC) {
                if (maxC >= maxA) {
                    moveItem(boxA, boxC, boxB);
                } else {
                    moveItem(boxC, boxB, boxA);
                }
            } else if (maxC >= maxA && maxC >= maxB) {
                if (maxA >= maxB) {
                    moveItem(boxB, boxA, boxC);
                } else {
                    moveItem(boxA, boxB, boxC);
                }
            }
        }
    }

    private static void moveItem(List<Integer> source, List<Integer> target, List<Integer> intermediary) {
        int i = totalItemToMove(source, target.get(0));
        moveBox(0, i - 1, source, target, intermediary);
    }

    private static void moveBox(int from, int to, List<Integer> source, List<Integer> target, List<Integer> intermediary) {
        if (from == to) {
            target.add(0, source.get(0));
            source.remove(0);
        } else {
            moveBox(from, to - 1, source, intermediary, target);
            if (target.isEmpty()) {
                target.add(source.get(0));
            } else {
                target.add(0, source.get(0));
            }
            source.remove(0);
            moveBox(from, to - 1, intermediary, target, source);
        }
    }

    private static int totalItemToMove(List<Integer> source, int max) {
        int i = 0;
        int min = source.get(0);
        while (i < source.size() && (min <= source.get(i)) && source.get(i) <= max) {
            min = source.get(i);
            i++;
        }
        return i;
    }

    private static List<Integer> initListBoxA() {
        List<Integer> boxA = new ArrayList<>();
        boxA.add(3);
        boxA.add(1);
        boxA.add(7);
        boxA.add(4);

        return boxA;
    }

    private static List<Integer> initListBoxB() {
        List<Integer> boxB = new ArrayList<>();
        boxB.add(9);
        boxB.add(5);
        boxB.add(2);
        boxB.add(8);

        return boxB;
    }

    private static List<Integer> initListBoxC() {
        List<Integer> boxC = new ArrayList<>();
        boxC.add(4);
        boxC.add(7);
        boxC.add(6);
        boxC.add(8);

        return boxC;
    }

}
