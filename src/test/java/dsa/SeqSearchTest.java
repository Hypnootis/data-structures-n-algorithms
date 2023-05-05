package dsa;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;

import dsa.sortingSearching.SeqSearch;


public class SeqSearchTest {
    int[] unsortedArray = {2, 4, 1221, 9, 331, -2};
    Random rng = new Random();
    int[] bigArray = rng.ints(100000).toArray();

    @Test
    void testIterativeSeqSearch() {
        assertEquals(false, SeqSearch.iterativeSeqSearch(unsortedArray, 3));
        assertEquals(true, SeqSearch.iterativeSeqSearch(unsortedArray, 4));
        assertEquals(true, SeqSearch.iterativeSeqSearch(unsortedArray, -2));
        assertEquals(false, SeqSearch.iterativeSeqSearch(unsortedArray, 23132131));
        assertEquals(false, SeqSearch.iterativeSeqSearch(unsortedArray, -3));
        
    }

    @Test
    void testRecursiveSeqSearch() {
        assertEquals(false, SeqSearch.recursiveSeqSearch(unsortedArray, 3));
        assertEquals(true, SeqSearch.recursiveSeqSearch(unsortedArray, -2));
        assertEquals(false, SeqSearch.recursiveSeqSearch(unsortedArray, 2131323133));
        assertEquals(false, SeqSearch.recursiveSeqSearch(unsortedArray, 22));
        assertEquals(true, SeqSearch.recursiveSeqSearch(unsortedArray, 9));
    }

    @Test
    public void testIterativeSeqSearchBig() {
        assertEquals(true, SeqSearch.iterativeSeqSearch(bigArray, bigArray[9999]));
        assertEquals(true, SeqSearch.iterativeSeqSearch(bigArray, bigArray[0]));
    }

    @Test
    public void testRecursiveSeqSearchBig() {
        assertEquals(true, SeqSearch.recursiveSeqSearch(bigArray, bigArray[9999]));
        assertEquals(true, SeqSearch.recursiveSeqSearch(bigArray, bigArray[0]));
    }
}
