/**
 A linked implemention of the ADT list.
 @author Frank M. Carrano
 @author Timothy M. Henry
 @version 5.0
 */
public class LList<T> implements ListInterface<T>
{
   private Node firstNode;            // Reference to first node of chain
   private int  numberOfEntries;
   
   public LList()
   {
      initializeDataFields();
   } // end default constructor
   
   public void clear()
   {
      initializeDataFields();
   } // end clear
   
   public void add(T newEntry)          // OutOfMemoryError possible
   {
      // Fill in code here!
   } // end add

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
         } // end if
         numberOfEntries++;
      }
      else
         throw new IndexOutOfBoundsException("Illegal position given to add operation.");
   } // end add

   public T remove(int givenPosition)
   {
      T result = null;                           // Return value
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
   } // end remove

   public T replace(int givenPosition, T newEntry)
   {
      if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
      {
         // Fill in code here!
      }
      else
         throw new IndexOutOfBoundsException("Illegal position given to replace operation.");
   } // end replace

   public T getEntry(int givenPosition)
   {
      if ((givenPosition >= 1) && (givenPosition <= numberOfEntries))
      {
         // Assertion: !isEmpty()
         return getNodeAt(givenPosition).getData();
      }
      else
         throw new IndexOutOfBoundsException("Illegal position given to getEntry operation.");
   } // end getEntry
   
   public T[] toArray()
   {
      // The cast is safe because the new array contains null entries
      @SuppressWarnings("unchecked")
      T[] result = (T[])new Object[numberOfEntries];
      
      int index = 0;
      Node currentNode = firstNode;
      while ((index < numberOfEntries) && (currentNode != null))
      {
         result[index] = currentNode.getData();
         currentNode = currentNode.getNextNode();
         index++;
      } // end while
      
      return result;
   } // end toArray
                                             
   public boolean contains(T anEntry)
   {
     // Fill in code here!
   } // end contains

   public int getLength()
   {
      return numberOfEntries;
   } // end getLength

   public boolean isEmpty()
   {
      // Fill in code here!
      
      return result;
   } // end isEmpty
	
   // Initializes the class's data fields to indicate an empty list.
   private void initializeDataFields()
   {
      firstNode = null;
      numberOfEntries = 0;
   } // end initializeDataFields
   
   // Returns a reference to the node at a given position.
   // Precondition: The chain is not empty;
   //               1 <= givenPosition <= numberOfEntries.
   private Node getNodeAt(int givenPosition)
   {
     // Fill in code here!
   } // end getNodeAt
   
   private class Node
   {
      private T    data; // Entry in list
      private Node next; // Link to next node
      
      private Node(T dataPortion)
      {
         data = dataPortion;
         next = null;
      } // end constructor
      
      private Node(T dataPortion, Node nextNode)
      {
		// Fill in code here!

      } // end constructor
      
      private T getData()
      {
         return data;
      } // end getData
      
      private void setData(T newData)
      {
         data = newData;
      } // end setData
      
      private Node getNextNode()
      {
         return next;
      } // end getNextNode
      
      private void setNextNode(Node nextNode)
      {
         next = nextNode;
      } // end setNextNode
   } // end Node
} // end LList



