package dsa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import dsa.collections.Lists;
import java.util.Arrays;
import java.util.LinkedList;

public class ListTest {
    LinkedList<String> testListOne = new LinkedList<String>(Arrays.asList("Hello", "World", "!"));
    LinkedList<String> testListTwo = new LinkedList<String>(Arrays.asList("This", "Is", "Text"));
    @Test
    void testConcatenateList() {
        LinkedList<String> solution = new LinkedList<String>(Arrays.asList("Hello", "World", "!", "This", "Is", "Text"));
        Assert.assertEquals(solution, Lists.concatenateList(testListOne, testListTwo));
    }    

    @Test
    void testMixList() {
       LinkedList<String> solution = new LinkedList<String>(Arrays.asList("Hello", "This", "World", "Is", "!", "Text")); 
       Assert.assertEquals(solution, Lists.mixList(testListOne, testListTwo));
    }
}
