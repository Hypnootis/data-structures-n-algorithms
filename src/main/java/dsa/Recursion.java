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
  
    public static int[] recursBonacci(int digits) {
        int[] fibonaccies = new int[digits];
        if (digits >= 0) {
            fibonaccies[0] = 0;
        } else if (digits >= 1) {
            fibonaccies[1] = 1;
        if (digits >= 2) {
            return fibonaccies;
        }
    }
}

