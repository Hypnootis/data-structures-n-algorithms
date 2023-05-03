package dsa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.recursion.Recursion;


public class RecursionTest {
    int[] fibonaccies = {0, 1, 1, 2, 3, 5, 8, 13, 21};
    int[] moreFibonaccies = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89};

   @Test
   void testLoopBonacci() {
    assertArrayEquals(fibonaccies, Recursion.loopBonacci(9, false));
    assertArrayEquals(moreFibonaccies, Recursion.loopBonacci(12, false));
   }

   @Test
   void testRecursBonacci() {
    assertArrayEquals(fibonaccies, Recursion.recursBonacci(9));
    assertArrayEquals(moreFibonaccies, Recursion.recursBonacci(12));
   }

   @Test
   void testIterativeFactorial() {
    assertEquals(2, Recursion.iterativeFactorial(2));
    assertEquals(6, Recursion.iterativeFactorial(3));
    assertEquals(362880, Recursion.iterativeFactorial(9));
   }

   @Test void testRecursiveFactorial() {
    assertEquals(2, Recursion.recursiveFactorial(2));
    assertEquals(6, Recursion.recursiveFactorial(3));
    assertEquals(362880, Recursion.recursiveFactorial(9));
   }
}
