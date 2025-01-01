package collectionsAndGenerics.collection;

import java.util.Collection;

public class Print {
    public static <E> void print(Collection<E> coll) {
        for (E it : coll) {
            System.out.println(it);
        }
    }
}
