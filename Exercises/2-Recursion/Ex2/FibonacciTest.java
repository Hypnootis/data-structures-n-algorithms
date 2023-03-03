package Exercises;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import Exercise.Fibonacci;

public class FibonacciTest {

    private Fibonacci fib = new Fibonacci();

    @Test
    void testZero() {
        assertEquals("Should return zero on zero", fib.nth(0), 0);
    }    
}
