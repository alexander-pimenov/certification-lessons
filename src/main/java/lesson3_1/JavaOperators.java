package lesson3_1;

public class JavaOperators {
    public static void main(String[] args) {
        int y = 4;
        //приоритеты: сначала выполниться декремент --y,
        //потом умножение 2*
        //потом 3+
        double x = 3 + 2 * --y;
        int i = y++;
        boolean b = y < x;
        boolean b2 = y != x;

        if (y == 7 || i != 22) {

        }
        //при деление целого числа на целое идет округление до целого цисла!!!
        //и мы теряем значение после запятой!!! Это может приводить к
        //ошибкам, поэтому на это стоит обращать внимание!!!
        int z = 9 / 4;
        System.out.println(z); //2
        System.out.println(z + 2); //4

        System.out.println(9.0 / 4); //2.25

        //деление по модулю, т.е. проверяем наличие остатка
        System.out.println(9 % 4); //возвращает остаток

    }
}
