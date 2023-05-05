package dsa.sortingSearching;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static boolean iterativeBinarySearch(int[] array, int number) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == number) {
                return true;
            } else if (array[mid] < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static boolean recursiveBinarySearch(int[] array, int number) {
        return recursiveBinarySearch(array, number, 0, array.length - 1);
    }

    public static boolean recursiveBinarySearch(int[] array, int number, int low, int high) {
        if (low > high) {
            return false;
        }
        int mid = (low + high) / 2;
        if (array[mid] == number) {
            return true;
        } else if (array[mid] > number) {
            return recursiveBinarySearch(array, number, low, mid - 1);
        } else {
            return recursiveBinarySearch(array, number, mid + 1, high);
        }
    }


    public static void compareBinarySearch(int iterations) {
        long startTime, endTime, duration;
        int[] testArray = new int[iterations]; 
        Random rnd = new Random();
        int testNumber = rnd.nextInt(iterations - 1);
        for (int i = 0; i < iterations; i++) {
            testArray[i] = i;
        }
                // Example of how to use this function:
            // Searcher.compareBinarySearch(10000);
            // This then logs the execution times into console
            // Execution time is measured in nanoseconds, so divisions
            // are done to get milliseconds and seconds
            // the results are casted to float for decimals
        startTime = System.nanoTime();
        iterativeBinarySearch(testArray, testNumber);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Iterative solution execution time: " + duration +
             " nanoseconds / " + (float)duration / 10000 +
              " milliseconds /" + (float)duration / 1000000000 + " seconds");
        startTime = System.nanoTime();
        recursiveBinarySearch(testArray, testNumber);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Recursive solution execution time: " + duration +
             " nanoseconds / " + (float)duration / 10000 +
              " milliseconds / " + (float)duration / 1000000000 + " seconds");

        startTime = System.nanoTime();
        Arrays.binarySearch(testArray, testNumber);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Arrays.BinarySearch solution execution time: " + duration +
        " nanoseconds / " + (float)duration / 10000 +
        " milliseconds / " + (float)duration /  1000000000 + " seconds");
        }
        // Recursive is still slower than the iterative method,
        // Though the recursive solution is more elegant in code
        // Arrays.BinarySearch seems to be the slowest?
        
}
