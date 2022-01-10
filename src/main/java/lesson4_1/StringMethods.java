package lesson4_1;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        //Стринг (String) - это массив чаров (char)
        // a n i m a l s - символы char
        // 0 1 2 3 4 5 6 - индексы в массиве
        String animal = "aNimaLs";

        //length()
        System.out.println(animal.length());

        //charAt()
        System.out.println(animal.charAt(0)); //a
        System.out.println(animal.charAt(6)); //s

        //indexOf()
        System.out.println(animal.indexOf('n')); //2-я буква
        System.out.println(animal.indexOf("im"));
        System.out.println(animal.indexOf('a', 2)); //4 индекс
        System.out.println(animal.indexOf("al", 5)); //-1 - не найдено
        System.out.println(animal.indexOf('f')); //-1 - не найдено

        //substring()
        System.out.println(animal.substring(2)); //imaLs
        System.out.println(animal.substring(2, 4)); //im
        System.out.println(animal.substring(2, animal.indexOf('s'))); //imaL
        System.out.println(animal.substring(2, 3)); //i - со 2-й по 3-ю и 3-ю не включаем
        System.out.println(animal.substring(2, 6)); //imaL

        //toLowerCase()
        //toUpperCase()
        System.out.println(animal.toUpperCase(Locale.ROOT)); //ANIMALS
        System.out.println(animal.toLowerCase(Locale.ROOT)); //animals
        System.out.println(animal); //сам aNimaLs - не изменился!!!

        //equals()
        //equalsIgnoreCase()
        String animal2 = "animals";
        System.out.println(animal.equals(animal2)); //false
        System.out.println(animal.equalsIgnoreCase(animal2)); //true

        //startsWith()
        //endsWith()
        System.out.println(animal.startsWith("a")); //true
        System.out.println(animal.endsWith("Ls")); //true

        //contains()
        System.out.println(animal.contains("mal")); //false
        System.out.println(animal.contains("maL")); //true

        //replace()
        System.out.println(animal.replace('a','A')); //ANimALs
        System.out.println(animal
                .toLowerCase(Locale.ROOT)
                .replace("an","ZZZ")); //ZZZimals

        //trim()
        String s = "   sdf  ";
        System.out.println(s.trim()); //sdf
    }
}
