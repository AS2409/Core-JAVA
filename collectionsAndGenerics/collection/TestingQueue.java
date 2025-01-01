package collectionsAndGenerics.collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    // <E> is called generics.
    // The below function takes an object of Collection with its generics <E> / <T>
    // (ultimately type).
    public static <E> void genericsFunction(Collection<E> collection) {
        Queue<String> q = new LinkedList<>();
        // add and offer both are used to insert the element...
        q.add("I am adding through add method"); // ...but it throws exception if element can't be added
        q.offer("I am adding though offer method"); // ...but it returns false if elemet can't be added.

        // Both retieve and remove the peak element of the queue but...
        q.remove(); // ...throws an exception if queue is empty.
        q.poll(); // ...return null if queue is empty.

        // Reterieve but does not remove the head of the queue but...
        q.element(); // ...throws an exception if queue is empty
        q.peek(); // ...return null if queue is empty
    }

    public static void main(String[] args) {

    }
}
