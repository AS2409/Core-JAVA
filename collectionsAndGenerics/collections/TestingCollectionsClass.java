package collectionsAndGenerics.collections;
//Collections is a class which provides various helpful methods like sort() etc.

//Collection is an interface

import java.util.ArrayList;
import java.util.List;

import collectionsAndGenerics.collection.Print;

import java.util.*;

public class TestingCollectionsClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(66);
        list.add(1234);
        Collections.sort(list); // Collections is a class and sort is a function resides in it.
        Print.print(list);
        // Using unmodifiableList we can create a list that is unmodifiable.
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        unmodifiableList.add(55); // Will throw an error at runtime
    }

}
