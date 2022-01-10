package lesson4_4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(11);
        arrayList.add(-23);
        arrayList.add(25);
        arrayList.add(95);
        arrayList.add(5);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
