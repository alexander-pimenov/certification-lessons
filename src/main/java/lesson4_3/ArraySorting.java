package lesson4_3;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        //сортировка чисел
        int[] numbers = {6,9,1};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        //сортировка строк
        String[] strings = {"10","9","100"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));
    }
}
