package lesson3_2;

public class TernaryOp {
    public static void main(String[] args) {
        int y = 10;
        final int x;
//        System.out.println(x); //так нельзя - variable x might not have been initialized (переменная x могла быть не инициализирована)
        if (y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        System.out.println(x);


        /////////////////////////////////////////
        // booleanExpression ? expression1 : expression2

        /*int y = 10;
        int x = (y > 5) ? (2 * y) : (3 * y);
        System.out.println(x);*/

        //Бывают такие записи немного путающие:
//        int z = y == 10 ? x > 5 ? 23 : 55 : 33;
        //перепишим красиво, добавив скобки для читабельности
        //и даже можем разнести по строкам:
       /* int z = (y == 10)
                ? (x > 5 ? 23 : 55)
                : 33;
        System.out.println(z);*/

    }
}
