package dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import dsa.sortingSearching.Searcher;


public class SearcherTest {
    Searcher s = new Searcher();
    int[] unsortedArray = {2, 4, 1221, 9, 331, -2};
    Random rng = new Random();
    int[] bigArray = rng.ints(100000).toArray();

    @Test
    void testIterativeSeqSearch() {
        assertEquals(false, s.iterativeSeqSearch(unsortedArray, 3));
        assertEquals(true, s.iterativeSeqSearch(unsortedArray, 4));
        assertEquals(true, s.iterativeSeqSearch(unsortedArray, -2));
        assertEquals(false, s.iterativeSeqSearch(unsortedArray, 23132131));
        assertEquals(false, s.iterativeSeqSearch(unsortedArray, -3));
        
    }

    @Test
    void testRecursiveSeqSearch() {
        assertEquals(false, s.recursiveSeqSearch(unsortedArray, 3));
        assertEquals(true, s.recursiveSeqSearch(unsortedArray, -2));
        assertEquals(false, s.recursiveSeqSearch(unsortedArray, 2131323133));
        assertEquals(false, s.recursiveSeqSearch(unsortedArray, 22));
        assertEquals(true, s.recursiveSeqSearch(unsortedArray, 9));
    }

    @Test
    public void testIterativeSeqSearchBig() {
        assertEquals(true, s.iterativeSeqSearch(bigArray, bigArray[9999]));
        assertEquals(true, s.iterativeSeqSearch(bigArray, bigArray[0]));
    }

    @Test
    public void testRecursiveSeqSearchBig() {
        assertEquals(true, s.recursiveSeqSearch(bigArray, bigArray[9999]));
        assertEquals(true, s.recursiveSeqSearch(bigArray, bigArray[0]));
    }
}
