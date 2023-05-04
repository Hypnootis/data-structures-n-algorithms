package dsa.collections;

import java.util.LinkedList;
import java.util.Random;
import java.util.Collections;

public class Lists<T> {
    public static LinkedList<Integer> randomizedList(int length, boolean log) {
        LinkedList<Integer> randomInts = new LinkedList<Integer>();
        Random rndInt = new Random();
        for (int i = 0; i <= length; i++) {
            int newRnd = rndInt.nextInt();
            // Check for duplicate
            if (randomInts.contains(newRnd)) {
                randomInts.push(newRnd);
            } else {
            randomInts.push(rndInt.nextInt());
            }
        }
        // Sort the elements
        Collections.sort(randomInts);
        if (log) {
            System.out.println("Generated list: " + randomInts);
        }
        return randomInts;
    }
    
    public static int averageOfLinkedList(LinkedList<Integer> list, boolean log) {
        // Example of how to use these methods for exercise 0a:
        // Lists.averageOfLinkedList(Lists.randomizedList(25, true), true);
        int average;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        average = sum / list.size();
        if (log) {
            System.out.println("Sum of lists elements: " + sum);
            System.out.println("Average of lists elements: " + average);
        }

        return average;
    }
    // Exercise 3
    public static LinkedList<String> concatenateList(LinkedList<String> listOne, LinkedList<String> listTwo) {
        LinkedList<String> newList = listOne;
        for (String s : listTwo) {
            listOne.addLast(s);
        }
        
        return newList;
    }
    // Exercise 4
    public static LinkedList<String> mixList(LinkedList<String> listOne, LinkedList<String> listTwo) {
        LinkedList<String> newList = new LinkedList<String>();
        // Assumes evenly sized lists, maybe fix this
        for (int i = 0; i < listOne.size(); i++) {
            newList.addLast(listOne.get(i));
            newList.addLast((listTwo.get(i)));
        }
        
        return newList;
    }
}
