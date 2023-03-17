package javacore.algorithm.interview;

import java.util.ArrayList;
import java.util.List;

public class BoxArray {
    /*
     * Object tive
     *  Stack the boxes on the platform "A", in order of size (the biggest at the bottom)
     *  
     *  Rule
     *  You work in an automated factory that controls a robotic arm to move boxes. The boxes are positioned in 3 stacks: "A", "B", "C".
     *  The arm can move above each stack to pick or release a box. Your goal is to rearrange the boxes to stack all of them onto the platform "A", in order of size.
     *  Your method is given 3 lists. Each list contains the size of every box in the corresponding stack (from bottom to top).
     *  
     *  It is not necessary to minimize the number of commands but the number should not exceed 200.
     *  Implementation
     *  Implement the method solve(boxesA, boxesB, boxesC) which takes 3 arrays of integers: boxesA, boxesB and boxesC. The method must return an array
     *  of strings: the name of the destination stack, separated by a space.
     *  For example, your method may return the folowing list of actions "A C", "B C" and "A B". in order to move a box from A to C,
     *  then a box from B to C and then a box from A to B.
     *  VITORY CONDITIONS
     *  All boxes are piled on stack A, in order of size.
     * */
    
    public static void main(String[] args) {
        List<Integer> boxA = new ArrayList<>();
        boxA.add(1);
        boxA.add(3);
        boxA.add(4);
        boxA.add(7);
        
        List<Integer> boxB = new ArrayList<>();
        boxB.add(2);
        boxB.add(5);
        boxB.add(8);
        boxB.add(9);
        
        List<Integer> boxC = new ArrayList<>();
//        boxC.add(4);
//        boxC.add(6);
//        boxC.add(7);
//        boxC.add(8);
        
        int maxA = boxA.isEmpty() ? Integer.MAX_VALUE : boxA.get(0);
        int maxB = boxB.isEmpty() ? Integer.MAX_VALUE : boxB.get(0);
        int maxC = boxC.isEmpty() ? Integer.MAX_VALUE : boxC.get(0);
        
        int loop = 0;
        
        while ( (!boxA.isEmpty() && !boxB.isEmpty()) || (!boxB.isEmpty() && !boxC.isEmpty()) || (!boxA.isEmpty() && !boxC.isEmpty()) ) {
            maxA = boxA.isEmpty() ? Integer.MAX_VALUE : maxA;
            maxB = boxB.isEmpty() ? Integer.MAX_VALUE : maxB;
            maxC = boxC.isEmpty() ? Integer.MAX_VALUE : maxC;

            System.out.println("the loop occur: " + loop);
            System.out.print("Box A: ");
            boxA.forEach(item -> System.out.print(item + ", "));
            System.out.print("\nBox B: ");
            boxB.forEach(item -> System.out.print(item + ", "));
            System.out.print("\nBox C: ");
            boxC.forEach(item -> System.out.print(item + ", "));
            System.out.println();
            // max size in box A
            int i;
            if (maxA >= maxB && maxA >= maxC) {
                if (maxB >= maxC) {
                    // find all item has size smaller than maxB
                    i = findSmallerSizeItems(boxC, maxB);
                    // move i item from C to B
                    moveBox(0, i - 1, boxC, boxB, boxA, "C", "B", "A");
                    maxC = boxC.isEmpty() ? Integer.MAX_VALUE : boxC.get(0);
                } else { // move B to C
                    i = findSmallerSizeItems(boxB, maxC);
                    moveBox(0, i - 1, boxB, boxC, boxA, "A", "B", "C");
                    maxB = boxB.isEmpty() ? Integer.MAX_VALUE : boxB.get(0);
                }
            } else if (maxB >= maxA && maxB >= maxC) {
                if (maxA >= maxC) {
                    // move C to A
                    i = findSmallerSizeItems(boxC, maxA);
                    moveBox(0, i - 1, boxC, boxA, boxB, "C","A", "B");
                    maxC = boxC.isEmpty() ? Integer.MAX_VALUE : boxC.get(0);
                } else { // move A to C
                    i = findSmallerSizeItems(boxA, maxC);
                    moveBox(0, i - 1, boxA, boxC, boxB, "A", "C", "B");
                    maxA = boxA.isEmpty() ? Integer.MAX_VALUE : boxA.get(0);
                }
            } else if (maxC >= maxA && maxC >= maxB) {
                if (maxA >= maxB) {
                    // move B to A
                    i = findSmallerSizeItems(boxB, maxA);
                    moveBox(0, i - 1, boxB, boxA, boxC, "B", "A", "C");
                    maxB = boxB.isEmpty() ? Integer.MAX_VALUE : boxB.get(0);
                } else { // move A to B
                    i = findSmallerSizeItems(boxA, maxB);
                    moveBox(0, i - 1, boxA, boxB, boxC, "A", "B", "C");
                    maxA = boxA.isEmpty() ? Integer.MAX_VALUE : boxA.get(0);
                }
            }
            loop++;
        }
//        System.out.println("After loop: ");
//        System.out.print("Box A: ");
//        boxA.forEach(item -> System.out.print(item + ", "));
//        System.out.print("\nBox B: ");
//        boxB.forEach(item -> System.out.print(item + ", "));
//        System.out.print("\nBox C: ");
//        boxC.forEach(item -> System.out.print(item + ", "));
//        System.out.println();
        if (boxA.isEmpty() && !boxB.isEmpty()) {
            moveBox(0, boxB.size() - 1, boxB, boxA, boxC, "B", "A", "C");
        } else if (boxA.isEmpty() && !boxC.isEmpty()) {
            moveBox(0, boxC.size() - 1, boxC, boxA, boxB, "C", "A", "B");
        }
        System.out.print("Final result in Box A: ");
        boxA.forEach(item -> System.out.print(item + ", "));
    }

    private static int findSmallerSizeItems(List<Integer> box, int max) {
        int i = 0;
        while (i < box.size() && box.get(i) <= max) {
            i++;
        }
        return i;
    }

    private static void moveBox(int from, int to, List<Integer> source, List<Integer> target, List<Integer> intermediary, String sourceId, String targetId, String intermediaryId) {
        if (from == to) {
            target.add(0, source.get(0));
            source.remove(0);
            // NEED PRINT PROCESS HERE
            System.out.println(sourceId + " " + targetId + ",");
        } else {
            moveBox(from, to - 1, source, intermediary, target, sourceId, intermediaryId, targetId);
            if (target.isEmpty()) {
                target.add(source.get(0));
            } else {                
                target.add(0, source.get(0));
            }
            source.remove(0);
            moveBox(from, to - 1, intermediary, target, source, intermediaryId, targetId, sourceId);
        }
    }
}

