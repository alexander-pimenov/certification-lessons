package lesson3_2;

import java.util.ArrayList;
import java.util.List;

//Пример такого кода встречается на экзамене, но в обычной жизни это плохо
//спроектированный код, так писать нельзя
//Пример как давать лейблы циклам.
//К внешнему циклу можно обращаться через OUTER_LOOP, а к внутреннему через имя INNER_LOOP
//Это используется чтобы как то разгребать плохо спроектированный код!!!
//Labels опциональны, можно писать без них.
public class OptionalLabels {
    public static void main(String[] args) {

        //массив где ищем число
        int[][] myComplexArray = {
                {5, 6, 1, 3},
                {3, 5, 2, 9},
                {7, 2, 12, 7},
                {7, 5, 2, 2}
        };

        int searchValue = 2; //число которое ищем

        //изначальная инициализация координат
        int positionX = -1;
        int positionY = -1;

        //сюда сложим найденные позиции числа
        List<Holder> results = new ArrayList<>();


        OUTER_LOOP:
        for (int i = 0; i < myComplexArray.length; i++) {
            INNER_LOOP:
            for (int j = 0; j < myComplexArray[i].length; j++) {
                if (myComplexArray[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    results.add(new Holder(i, j));
                    //без break; мы пройдем все уровни до конца, т.е. переберем все элементы матрицы!!!

//                    break; //выход только из внутреннего цикла!!! Ищем дальше!!! Но выходим при первом найденном!!!

//                    break OUTER_LOOP; //выход аж из внешнего цикла!!! Остановили поиск!!!
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("Value " + searchValue + " not found.");
        } else {
            System.out.println("Value " + searchValue + " found " + results.size() + " number(s) at: ");
            for (Holder res : results) {
                System.out.println(res.getCoordinateX() + ":" + res.getCoordinateY());
            }
        }
    }

    static class Holder {
        int coordinateX;
        int coordinateY;

        public Holder(int coordinateX, int coordinateY) {
            this.coordinateX = coordinateX;
            this.coordinateY = coordinateY;
        }

        public int getCoordinateX() {
            return coordinateX;
        }

        public int getCoordinateY() {
            return coordinateY;
        }
    }
}
