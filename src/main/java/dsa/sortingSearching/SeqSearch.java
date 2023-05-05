package dsa.sortingSearching;

import java.util.Random;

public class SeqSearch {

    // These are my own implementations!

   public static boolean iterativeSeqSearch(int[] array, int number) {
        boolean found = false;
        int index = 0;

        while (!found && index < array.length) {
            if (array[index] == number) {
                found = true;
            }
            index++;
        }

       return found;
   } 

   public static boolean recursiveSeqSearch(int[] array, int number) {
    return recursiveSeqSearch(array, number, 0, array.length - 1);
   }

   private static boolean recursiveSeqSearch(int[] array, int number, int first, int last) {
       
        boolean found = false;

        if (first > last) {
            found = false;
        } else {
            if (array[first] == number) {
                found = true;
            } else {
                found = recursiveSeqSearch(array, number, first + 1, last);
            }
        }

        return found;
   }

   public static void compareSeqSearch(int iterations) {
    long startTime, endTime, duration;
    Random rnd = new Random();
    int[] testArray = new int[10000]; 
    for (int i = 0; i < iterations; i++) {
        testArray[i] = rnd.nextInt();
    }
            // Example of how to use this function:
        // Searcher.compareSeqSearch(10000);
        // This then logs the execution times into console
        // Execution time is measured in nanoseconds, so divisions
        // are done to get milliseconds and seconds
        // the results are casted to float for decimals
    startTime = System.nanoTime();
    iterativeSeqSearch(testArray, 2);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("Iterative solution execution time: " + duration +
         " nanoseconds / " + (float)duration / 10000 +
          " milliseconds /" + (float)duration / 1000000000 + " seconds");
    startTime = System.nanoTime();
    recursiveSeqSearch(testArray, 2);
    endTime = System.nanoTime();
    duration = endTime - startTime;
    System.out.println("Recursive solution execution time: " + duration +
         " nanoseconds / " + (float)duration / 10000 +
          " milliseconds / " + (float)duration / 1000000000 + " seconds");
    }
    // Recursive is still slower than the iterative method,
    // Though the recursive solution is more elegant in code
   
}
