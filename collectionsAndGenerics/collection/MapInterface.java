package collectionsAndGenerics.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

// Map interface is a part of collections library but not a child of Collection interfacs.***********
public class MapInterface {
    public static void main(String[] args) {
        Map<String, Double> mpp = new HashMap<>();
        mpp.put("Addu", 8.0);
        mpp.put("Ankita", 8.0);
        mpp.put("Prachi", 7.6);
        System.out.println(mpp.containsKey("Ankita"));
        System.out.println(mpp.get("Aditi"));
        System.out.println(mpp.size());
        mpp.keySet(); // returns the set of keys

    }

}
