package lesson4_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Здесь рассмотрен интересный момент, что когда мы преобразуем массив в коллекцию, то они остаются
 * связанными и все изменения в коллекции будут происходить в массиве, и наоборот. И размер этой коллекции мы не сможем
 * изменить, как и рахмер массива он не меняемый!!! Об этом нужно помнить!!!*/
public class ConvertingToArray {
    public static void main(String[] args) {

        //-=Преобразование из коллекции в массив=-

        List<String> birds = new ArrayList<>();
        birds.add("Орел");
        birds.add("Ястреб");
        birds.add("Коршун");

        //тут проблема в том, что в таком массиве мы сможем хранить всё что угодно и не только String
        //это нам не удобно, т.к. мы хотим в нем хранить тольок стринги!
        Object[] objectArray = birds.toArray();
        System.out.println(objectArray); //[Ljava.lang.Object;@1cd072a9
        System.out.println(objectArray.length);

        //Для того чтобы мы преобразовали эрейлист стрингов в массив стрингов, то
        //нужно писать так:
        String[] stringArray = birds.toArray(new String[0]);
        System.out.println(stringArray); //[Ljava.lang.String;@7c75222b
        System.out.println(stringArray.length);


        //-=Преобразование из массива в коллекцию=-

        String[] array = {"Орел", "Ястреб", "Коршун"};
        List<String> list = Arrays.asList(array);
        System.out.println(list);
        System.out.println(list.size());

        //ВНИМАНИЕ!!!
        //Если мы создаем из массива коллекцию то они становятся связанными!!!
        //И все ИЗМЕНЕНИЯ, которые мы будем делать в коллекции, они будут происходить и в массиве!!!
        //И наоборот!!!
        //Но коллекция полученная на основе массиве НЕ МОЖЕТ изменять свой размер, как и массив!!!
        //Если захотим удалить что то из этой коллекции, то получим Exception java.lang.UnsupportedOperationException !!!
        list.set(1, "Проверка");
        System.out.println(list);
        System.out.println(array[1]);

        array[0] = "Новый";
        System.out.println(list);
        System.out.println(Arrays.toString(array));

        //list.remove(1); //Exception in thread "main" java.lang.UnsupportedOperationException
    }
}
