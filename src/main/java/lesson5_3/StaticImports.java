package lesson5_3;

import static java.util.Arrays.asList;
//import static java.util.Arrays.*; //можно импортировать все static методы класса, но лучше делать это для каждого метода

import java.util.Arrays;
import java.util.List;
//import java.util.*; //можно импортировать весь пакет, но лучше делать это для каждого класса

/* Для импорта всего класса используем обычные импорты.
 * Для импорта конкретно каких то статических методов из класса, используем статические импорты с указанием этих методов
 * или указываем через '*'. */
public class StaticImports {
    public static void main(String[] args) {
        //здесь используются обычные импорты классов
        List<String> list1 = Arrays.asList("1", "2");

        //здесь используется статический импорт метода из класса
        List<String> list2 = asList("1", "2");

    }
}
