package lesson4_3;

import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {

        //3 сценария
        // 1 - элемент найден - возвращаем индекс

        // 2 - элемент не найден - возвращаем отрицательный
        //индекс в котором мог бы храниться элемент

        // 3 - если массив не отсортирован - результат не предсказуем

        int[] numbers = {2,4,6,7,8};
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 7)); // 3
        System.out.println(Arrays.binarySearch(numbers, 9)); // -6

        //По неотсортированному массиву не имеет смысла делать поиск!!!
        //Java умеет искать по отсортированным массивам
        int[] numbers2 = {4,3,2};
        System.out.println(Arrays.binarySearch(numbers2,1)); // -1
        System.out.println(Arrays.binarySearch(numbers2,2)); // -1
        System.out.println(Arrays.binarySearch(numbers2,3)); // 1
        System.out.println(Arrays.binarySearch(numbers2,4)); // -4


    }
}
