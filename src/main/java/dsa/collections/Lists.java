package dsa.collections;

public class Lists<T> implements ListInterface<T> {

    private Node firstNode;            // Reference to first node of chain
    private int  numberOfEntries;
    
    public Lists()
    {
       initializeDataFields();
    }
    
    public void clear()
    {
       initializeDataFields();
    }
    
    public void add(T newEntry)          // OutOfMemoryError possible
    {
       // Fill in code here!
    }
 
    public void add(int givenPosition, T newEntry) // OutOfMemoryError possible
    {
       if ((givenPosition >= 1) && (givenPosition <= numberOfEntries + 1))
       {
          Node newNode = new Node(newEntry);
          if (givenPosition == 1)                // Case 1
          {
             newNode.setNextNode(firstNode);
             firstNode = newNode;
          }
          else                                    // Case 2: list is not empty
          {                                       // and givenPosition > 1
             Node nodeBefore = getNodeAt(givenPosition - 1);
             Node nodeAfter = nodeBefore.getNextNode();
             newNode.setNextNode(nodeAfter);
             nodeBefore.setNextNode(newNode);
          }
          numberOfEntries++;
       }
       else
          throw new IndexOutOfBoundsException("Illegal position given to add operation.");
    }
 
    public T remove(int givenPosition)
    {
       T result = null;
       if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
       {
          // Assertion: !isEmpty()
          if (givenPosition == 1)                 // Case 1: Remove first entry
          {
             result = firstNode.getData();        // Save entry to be removed
             firstNode = firstNode.getNextNode(); // Remove entry
          }
          else                                    // Case 2: Not first entry
          {
             Node nodeBefore = getNodeAt(givenPosition - 1);
             Node nodeToRemove = nodeBefore.getNextNode();
             result = nodeToRemove.getData();     // Save entry to be removed
             Node nodeAfter = nodeToRemove.getNextNode();
             nodeBefore.setNextNode(nodeAfter);   // Remove entry
         } // end if
          numberOfEntries--;                      // Update count
          return result;                          // Return removed entry
       }
       else
          throw new IndexOutOfBoundsException("Illegal position given to remove operation.");
    }
 
    public T replace(int givenPosition, T newEntry)
    {
       if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
       {
          remove(givenPosition);
          add(givenPosition, newEntry);
          return getEntry(givenPosition);
       }
       else
          throw new IndexOutOfBoundsException("Illegal position given to replace operation.");
    }
 
    public T getEntry(int givenPosition)
    {
       if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
       {
          // Assertion: !isEmpty()
          return getNodeAt(givenPosition).getData();
       }
       else
          throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
    }
    
    public T[] toArray()
    {
       @SuppressWarnings("unchecked")
       T[] result = (T[])new Object[numberOfEntries];
       
       int index = 0;
       Node currentNode = firstNode;
       while ((index < numberOfEntries) && (currentNode != null))
       {
          result[index] = currentNode.getData();
          currentNode = currentNode.getNextNode();
          index++;
       }
       
       return result;
    }
                                              
    public boolean contains(T anEntry)
    {
      // Fill in code here!
    }
 
    public int getLength()
    {
       return numberOfEntries;
    }
 
    public boolean isEmpty()
    {
       if (numberOfEntries == 0) {
        return true;
       }
       
       return false;
    }
     
    // Initializes the class's data fields to indicate an empty list.
    private void initializeDataFields()
    {
       firstNode = null;
       numberOfEntries = 0;
    }
    
    // Returns a reference to the node at a given position.
    // Precondition: The chain is not empty;
    //               1 <= givenPosition <= numberOfEntries.
    private Node getNodeAt(int givenPosition)
    {
      // Fill in code here!
    }
    
    private class Node
    {
       private T    data; // Entry in list
       private Node next; // Link to next node
       
       private Node(T dataPortion)
       {
          data = dataPortion;
          next = null;
       }
       
       private Node(T dataPortion, Node nextNode)
       {
         // Fill in code here!
 
       }
       
       private T getData()
       {
          return data;
       }
       
       private void setData(T newData)
       {
          data = newData;
       }
       
       private Node getNextNode()
       {
          return next;
       }
       
       private void setNextNode(Node nextNode)
       {
          next = nextNode;
       }
    }
}
