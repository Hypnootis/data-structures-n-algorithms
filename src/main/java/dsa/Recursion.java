package dsa;

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
}

