package dsa;

import dsa.Recursion;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class RecursionTest {
    int[] fibonaccies = {0, 1, 1, 2, 3, 5, 8, 13, 21};
    int[] moreFibonaccies = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

   @Test
   void  testLoopBonacci() {
    assertArrayEquals(fibonaccies, Recursion.loopBonacci(9, false));
    assertArrayEquals(moreFibonaccies, Recursion.loopBonacci(12, false));
   }

   @Test
   void testRecursBonacci() {
    assertArrayEquals(fibonaccies, Recursion.recursBonacci(9, false));
    assertArrayEquals(moreFibonaccies, Recursion.recursBonacci(12, false));
   }
}
