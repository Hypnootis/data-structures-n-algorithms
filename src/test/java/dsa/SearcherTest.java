package dsa;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import sortingSearching.Searcher;


public class SearcherTest {
    Searcher s = new Searcher();
    int[] unsortedArray = {2, 4, 1221, 9, 331, -2};

    @Test
    void testIterativeSeqSearch() {
        assertEquals(false, s.iterativeSeqSearch(unsortedArray, 3));
        assertEquals(true, s.iterativeSeqSearch(unsortedArray, -2));
    }

    @Test
    void testRecursiveSeqSearch() {
        assertEquals(false, s.recursiveSeqSearch(unsortedArray, 3));
        assertEquals(true, s.recursiveSeqSearch(unsortedArray, -2));
        assertEquals(false, s.recursiveSeqSearch(unsortedArray, 2131323133));
        assertEquals(false, s.recursiveSeqSearch(unsortedArray, 22));
        assertEquals(true, s.recursiveSeqSearch(unsortedArray, 9));
    }

}
