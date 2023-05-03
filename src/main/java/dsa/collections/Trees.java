package dsa.collections;

import java.util.TreeSet;
import java.util.Random;

public class Trees {
   public static TreeSet<Integer> randomizedTreeSet(int length, boolean log) {
    TreeSet<Integer> rndTree = new TreeSet<Integer>();
    Random rndInt = new Random();

    for (int i = 0; i < length; i++) {
       int newRnd = rndInt.nextInt();
       if (rndTree.contains(newRnd)) {
        rndTree.add(rndInt.nextInt());
       } else {
        rndTree.add(newRnd);
       }
    }
    // TreeSets are sorted by nature, as opposed to LinkedLists which aren't

    if (log) {
        System.out.println(rndTree);
    }

    return rndTree;
   } 

   public static int averageOfTreeSet(TreeSet<Integer> tree, boolean log) {
    // Example of how to use these methods for 0b):
    // Trees.averageOfTreeSet(Trees.randomizedTreeSet(25, true), true); 
    int average = 0;
    int sum = 0;
    for (Integer i : tree) {
        sum += i;
    }
    average = sum / tree.size();
    if (log) {
        System.out.println("Sum of tree elements: " + sum);
        System.out.println("Average of tree elements: " + average);
    }
    
    return average;
   }
}
