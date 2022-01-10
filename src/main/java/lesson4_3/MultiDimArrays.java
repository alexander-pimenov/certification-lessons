package lesson4_3;

import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {

        //многомерные массивы
        // 3 - колонки, 2 - строки
        // [] [] []
        // [] [] []
        String[][] rectangle = new String[3][2];
        rectangle[0][1] = "set";

        // []      [] []
        // ["set"] [] []
        System.out.println(Arrays.deepToString(rectangle)); //[[null, set], [null, null], [null, null]]

        //Ассинхронные массивы
        int[][] differentSize = {{1, 4}, {3}, {9, 8, 7}};
        // [1] [3] [9]
        // [4]     [8]
        //         [7]
        System.out.println(Arrays.deepToString(differentSize)); //[[1, 4], [3], [9, 8, 7]]

        //и так можно создавать двумерные массивы
        int[][] someArray = new int[4][];
        someArray[0] = new int[5];
        someArray[1] = new int[3];
        System.out.println(Arrays.deepToString(someArray)); //[[0, 0, 0, 0, 0], [0, 0, 0], null, null]

        //так тоже можно проходиться по массиву
        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(twoD)); //[[0, 0], [0, 0], [0, 0]]

        //или с помощью forEach
        for (int[] inner :twoD){
            for (int num : inner){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
