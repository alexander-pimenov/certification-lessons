package lesson3_2;

public class ForLoop {
    public static void main(String[] args) {
        int x = 0;
        for (long y = 0, z = 4; y < 10 && x < 5; x++, y++) {
            System.out.println("y = " + y);
        }
        System.out.println("x = " + x);

        //Бесконечный цикл
//        for (;;) {
//        }


        //Объявлять переменные внутри с разными типами нельзя int i = 0, long v = 4;
//        for (int i = 0, long v = 4; i < 10 && v < 8; i++, v++) {
//
//        }

        //Объявлять переменные снаружи с разными типами можно int i = 0, long v = 0;,
        //а внутри их переопределить
        int i = 0;
        long v = 0L;
        for (i = 2, v = 3; i < 10 && v < 8; i++, v++) {

        }

    }
}
