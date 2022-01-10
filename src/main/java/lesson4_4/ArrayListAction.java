package lesson4_4;

import java.util.ArrayList;

public class ArrayListAction {
    public static void main(String[] args) {
        ArrayList<String> birds = new ArrayList<>();

        //--add()--
        //boolean add(E element)
        //void add(int index, E element)

        //--remove()--
        //boolean remove(Object object)
        //E remove(int index)

        birds.add("Ворона");
        birds.add("Попугай");
        birds.add("Синица");
        birds.add("Канарейка");
        birds.add("Сорока");

        String removedBird = birds.remove(0);
        System.out.println(removedBird);
        birds.remove("Сорока");
        System.out.println(birds);

        //--set()--
        //E set(int index, E newElement) - установить на определенный индекс новое значение, т.е. перезапишет существующее значение

        System.out.println(birds.set(2,"Галка"));
        System.out.println(birds);

        //--isEmpty()--
        //--size()--
        //boolean isEmpty() and int size()

        //--clear()--
        //void clear()


        //--contains()--
        //boolean contains()

        System.out.println(birds.contains("Синица")); //true

        //--equals()-- - сравнение листов (переопределен)
        //boolean equals(Object object)

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Nick");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("Jack");

        System.out.println(arrayList1.equals(arrayList2));
    }
}
