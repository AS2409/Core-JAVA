package collectionsAndGenerics.practiceProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import collectionsAndGenerics.collection.Print;

public class FrequencyMethodOfCollections {
    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 3, 4, 5, 10, 10, 10, 10);
        System.out.println(Collections.frequency(arrayList, 10));
        Collections.reverse(arrayList);
        Print.print(arrayList);
    }
}
