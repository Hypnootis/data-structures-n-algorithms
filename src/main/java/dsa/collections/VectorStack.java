package dsa.collections;
import java.util.EmptyStackException;
import java.util.Vector;

public class VectorStack<T> implements StackInterface<T> {
   private Vector<T> stack;
   private boolean integrityOk;
   private static final int DEFAULT_CAPACITY = 50;
   private static final int MAX_CAPACITY = 10000;
   
   public VectorStack() {
    this(DEFAULT_CAPACITY);
   }
   public VectorStack(int initialCapacity) {
    integrityOk = false;
    stack = new Vector<T>(initialCapacity);
    integrityOk = true; 
   }

   public void push(T newEntry) {
    stack.add(newEntry);
   }

   public T peek() {
    if (isEmpty()) {
        throw new EmptyStackException();
    } else {
        return stack.lastElement();
    }
   }

   public T pop() {
    if (isEmpty()) {
        throw new EmptyStackException();
    } else {
        return stack.remove(stack.size() - 1);
    }
   }

   public boolean isEmpty() {
    return stack.isEmpty();
   }

   public void clear() {
    stack.clear();
   }
}
