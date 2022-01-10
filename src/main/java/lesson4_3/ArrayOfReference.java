package lesson4_3;

import java.util.Arrays;

public class ArrayOfReference {
    public static void main(String[] args) {

        String[] birds = {"канарейка", "попугай", "воробей"};
        //имеем такой массив:
        //  0                           1                         2                         - индексы
        // адрес-ссылка на "канарейка" адрес-ссылка на "попугай" адрес-ссылка на "воробей"  - элементы

        String[] alias = birds;


        //ссылки birds и alias между собой равны
        //массив наследуется от Object и имеет те же методы, что Object
        //метод equals() в массиве не переопределен, т.е. происходит сравнение по ссылкам
        System.out.println(birds.equals(alias)); //true
        System.out.println(birds.toString()); //[Ljava.lang.String;@1cd072a9
        // [L - одинарный массив
        // java.lang.String; - массив стрингов
        // @1cd072a9 - хэш сумма массива

        //Для удобства работы с массивами нужно использовать класс Arrays
        System.out.println(Arrays.toString(alias));

        String[] str1 = new String[5]; //все ячейки заполнены null
        System.out.println(Arrays.toString(str1)); //[null, null, null, null, null]

        String[] s = {"Hey"};
        Object[] objects = s;
        String[] s2 = (String[]) objects; //приведение типов
//        s2[0] = new StringBuilder(); - в массив Стрингов нельзя класть что то другое
        //objects[0] = new StringBuilder(); // - получим ошибку при запуске, т.к. по итогу пытаемся,
        //прикрывшись Object в массив Стрингов положить StringBuilder

    }
}
