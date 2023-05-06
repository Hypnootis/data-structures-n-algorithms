package dsa;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import dsa.collections.LinkedLists;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListsTest {
    LinkedList<String> testListOne = new LinkedList<String>(Arrays.asList("Hello", "World", "!"));
    LinkedList<String> testListTwo = new LinkedList<String>(Arrays.asList("This", "Is", "Text"));
    @Test
    void testConcatenateList() {
        LinkedList<String> solution = new LinkedList<String>(Arrays.asList("Hello", "World", "!", "This", "Is", "Text"));
        Assert.assertEquals(solution, LinkedLists.concatenateList(testListOne, testListTwo));
    }    

    @Test
    void testMixList() {
       LinkedList<String> solution = new LinkedList<String>(Arrays.asList("Hello", "This", "World", "Is", "!", "Text")); 
       Assert.assertEquals(solution, LinkedLists.mixList(testListOne, testListTwo));
    }
}
