package lesson4_4;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {

        //В ArrayList нельзя хранить примитивы.
        //Т.е. если мы кладем в ArrayList примитив, например, 123, то он
        //автоматически преобразовывается в объект Integer.
        //ArrayList автоматически преобразовывает примитивы в их классы обертки.

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(50.5);
        doubleList.add(new Double(60.0));
        doubleList.add(new Double(40));

        System.out.println(doubleList);

        doubleList.remove(50.5);
        double aDouble = doubleList.get(0); //достали из коллекции объект но автоматически преобразовали в примитив

        System.out.println(aDouble);


        //////////////////////////////////////////////////
        List<Integer> integers = new ArrayList<>();
        integers.add(null);
        Integer integerObject = integers.get(0); //получим null и главное, что этот null в int упаковать нельзя!!!
        //  int integerPrimitive = integers.get(0);  //У null (пустоты) пытаемся вызвать преобразования - автобоксинг.

        // Pointer указывает на пустоту Null!!!
        // !!! Но у пустоты пробразования вызвать нельзя и поэтому получаем - Exception in thread "main" java.lang.NullPointerException
        System.out.println(integerObject);

        //Задачка на внимательность:
        //1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        System.out.println(numbers);
        Integer removed = numbers.remove(1);//здесь remove удаляет по индексу!!! т.к. не различает индекс int от содержимого Integer
        System.out.println(removed);
        System.out.println(numbers);

        //2
        List<String> birds = new ArrayList<>();
        birds.add("Курица");
        birds.add("Гусь");
        System.out.println(birds);
        boolean removedBird = birds.remove("Курица");//а здесь remove может удалить по содержимому!!!
        System.out.println(removedBird);
        System.out.println(birds);

    }
}
