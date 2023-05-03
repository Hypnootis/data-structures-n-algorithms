package dsa.recursion;

public class Recursion {
    public static int[] loopBonacci(int digits, boolean log) {
        // Set log to true if you want to print the results
        int[] fibonaccies = new int[digits];
        for (int i = 0; i < digits; i++) {
            if (i == 0) {
               fibonaccies[i] = 0;
            } else if (i == 1) {
                fibonaccies[i] = 1;
            } else {
                fibonaccies[i] = fibonaccies[i - 1] + fibonaccies[i - 2];
           }
           if (log) {
            System.out.print(fibonaccies[i] + " ");
           }
        }
        return fibonaccies;
    }
    // This function just calls the recursive solution
    // To return an integer array
    // This obviously affects execution time, but
    // It is done similarly in the iterational solution
    // ¯\_(ツ)_/¯
    public static int[] recursBonacci(int digits) {
        int[] fibonaccies = new int[digits];
        for (int i = 0; i < digits; i++) {
            fibonaccies[i] = calculateFibonacci(i);
        }
        return fibonaccies;
    }
    private static int calculateFibonacci(int nthDigit) {
        if (nthDigit == 0) {
            return 0;
        } else if (nthDigit == 1) {
            return 1;
        } else {
            return calculateFibonacci(nthDigit - 1) + calculateFibonacci(nthDigit - 2);
        }
    }

    public static void raceBonacci(int iterations) {
        // Example of how to use this function:
        // Recursion.raceBonacci(40);
        // This then logs the execution times into console
        // Execution time is measured in nanoseconds, so divisions
        // are done to get milliseconds and seconds
        // the results are casted to float for decimals
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        loopBonacci(iterations, false);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Iterative solution execution time: " + duration +
         " nanoseconds / " + (float)duration / 10000 +
          " milliseconds /" + (float)duration / 1000000000 + " seconds");
        startTime = System.nanoTime();
        recursBonacci(iterations);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Recursive solution execution time: " + duration +
         " nanoseconds / " + (float)duration / 10000 +
          " milliseconds / " + (float)duration / 1000000000 + " seconds");
    }
    // As research tells us, time complexity increases with
    // Recursion as opposed to iteration

    public static int iterativeFactorial(int start) {
        int result = 1;
        for (int i = start; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static int recursiveFactorial(int start) {
        if (start == 0) {
            return 1;
        } else {
            return start * recursiveFactorial(start - 1);
        }
    }

    public static void raceFactorial(int iterations) {
        // Look to the last race function for instructions
        long startTime, endTime, duration;
        startTime = System.nanoTime();
        iterativeFactorial(iterations);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Iterative solution execution time: " + duration +
         " nanoseconds / " + (float)duration / 10000 +
            " milliseconds /" + (float)duration / 1000000000 + " seconds");
        startTime = System.nanoTime();
        recursiveFactorial(iterations);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Recursive solution execution time: " + duration +
         " nanoseconds / " + (float)duration / 10000 +
          " milliseconds / " + (float)duration / 1000000000 + " seconds");
    }

    // For factorials, the time complexity seems more negligible at small
    // Amounts of iteration, but recursive still loses to iterative solution
}

