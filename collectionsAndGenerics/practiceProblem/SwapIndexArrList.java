package collectionsAndGenerics.practiceProblem;

import java.util.ArrayList;

import collectionsAndGenerics.collection.Print;

public class SwapIndexArrList {
    public static <E> void swapIndex(int i, int j, E valAtI, E valAtJ, ArrayList<E> arrayList) {
        arrayList.set(i, valAtJ);
        arrayList.set(j, valAtI);
        return;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        Print.print(arrayList);
        swapIndex(1, 2, 2, 3, arrayList);
        System.out.println("After swap");
        Print.print(arrayList);
    }
}
