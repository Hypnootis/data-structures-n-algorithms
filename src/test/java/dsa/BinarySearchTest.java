package dsa;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import dsa.sortingSearching.BinarySearch;


public class BinarySearchTest {
    int[] sortedArray = {2, 4, 9, 331, 1221, 12313};
    Random rng = new Random();
    int[] bigArray = new int[10000];

    @Test
    void testIterativeBinarySearch() {
        assertEquals(false, BinarySearch.iterativeBinarySearch(sortedArray, 3));
        assertEquals(true, BinarySearch.iterativeBinarySearch(sortedArray, 4));
        assertEquals(true, BinarySearch.iterativeBinarySearch(sortedArray, 1221));
        assertEquals(false, BinarySearch.iterativeBinarySearch(sortedArray, 23132131));
        assertEquals(false, BinarySearch.iterativeBinarySearch(sortedArray, 5));
        
    }

    @Test
    void testRecursiveBinarySearch() {
        assertEquals(false, BinarySearch.recursiveBinarySearch(sortedArray, 3));
        assertEquals(true, BinarySearch.recursiveBinarySearch(sortedArray, 4));
        assertEquals(false, BinarySearch.recursiveBinarySearch(sortedArray, 2131323133));
        assertEquals(true, BinarySearch.recursiveBinarySearch(sortedArray, 1221));
        assertEquals(false, BinarySearch.recursiveBinarySearch(sortedArray, 5));
    }

    @Test
    public void testIterativeBinarySearchBig() {
        assertEquals(true, BinarySearch.iterativeBinarySearch(bigArray, bigArray[9999]));
        assertEquals(true, BinarySearch.iterativeBinarySearch(bigArray, bigArray[0]));
    }

    @Test
    public void testRecursiveBinarySearchBig() {
        assertEquals(true, BinarySearch.recursiveBinarySearch(bigArray, bigArray[9999]));
        assertEquals(true, BinarySearch.recursiveBinarySearch(bigArray, bigArray[0]));
    }
}