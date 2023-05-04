package dsa.collections;

import java.util.EmptyStackException;

public final class LinkedStack<T> implements StackInterface<T> {
    private Node topNode;

    public LinkedStack() {
        topNode = null;
    }

   public void push(T newEntry) {
    Node newNode = new Node(newEntry, topNode);
    topNode = newNode;
   }
   
   public T pop() {
    T top = peek();
    topNode = topNode.getNextNode();
    return top;
   }

   public T peek() {
    if (isEmpty()) {
        throw new EmptyStackException();
    } else {
        return topNode.getData();
    }
   }

   public boolean isEmpty() {
    return topNode == null;
   }

   public void clear() {
    topNode = null;
   }

   private class Node {
    private T data;
    private Node nextNode;
    // Constructor
    public Node(T data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public T getData() {
        return this.data;
    }

    public Node getNextNode() {
        return this.nextNode;
    }
   }


}
