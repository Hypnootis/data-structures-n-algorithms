package dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dsa.collections.VectorStack;

public class VectorStackTest {
    VectorStack<Integer> newStack = new VectorStack<Integer>();
    @Test
    void testPush() {
        newStack.push(3);
        assertEquals(false, newStack.isEmpty());
    }
    
    @Test
    void testClear() {
        newStack.clear();
        assertEquals(true, newStack.isEmpty());
    }

    @Test
    void testPop() {
        newStack.push(23);
        newStack.pop();
        assertEquals(true, newStack.isEmpty());
    }
    
}
