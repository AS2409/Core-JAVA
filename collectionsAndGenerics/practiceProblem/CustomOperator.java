package collectionsAndGenerics.practiceProblem;

import java.util.ArrayList;
import java.util.Collections;

public class CustomOperator {
    public static void compareOperatorOfCollections(ArrayList<String> arrayList) {
        Collections.sort(arrayList, new java.util.Comparator<String>() { // See the syntax carefully.

            // custom compare function that we have created according to us.
            @Override
            public int compare(String o1, String o2) {
                // TODO Auto-generated method stub
                if (o1.equals(o2))
                    return 0;
                else if (o1.charAt(0) < o2.charAt(0))
                    return -1;
                return 1;
            }

        });
        ;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Addu");
        arrayList.add("Suman");
        arrayList.add("daddu");
        System.out.println(arrayList);
        compareOperatorOfCollections(arrayList);
        System.out.println(arrayList);
    }
}
