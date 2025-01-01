package collectionsAndGenerics.collection;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        // Declaring List without the type of it.
        List intList = new ArrayList();
        intList.add(6);
        intList.add(10);
        intList.add(1, 100); // this syntax is used to add at specific index. add(index,val);
        System.out.println(intList.contains(100)); // checks whether the value exists in the list or not. return boolean
        System.out.println(intList.get(1));
        System.out.println(intList.indexOf(10)); // will get the index of given value (here 10).
        intList.set(0, 5); // use to replace the val at given index
        intList.clear(); // remove all element
        intList.size(); // use for getting size

        // Declaring List with type.Primitives are not allowed only wrapper class
        List<Integer> list = new ArrayList<>(); // wrapperClasses = Integer
        // <Integer> , <> , these are generics and they are compile time. this is used
        // so that we don't mistake and on runtime java removes it all

    }
}
