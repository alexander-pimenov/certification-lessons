package lesson5_3;

/*Блок инциализации - отрабатывают до отработки конструктора !!!
 * А Статические блоки инициализации - работают похоже, но они принадлежат классу !!!
 * Внутри статического блока находятся только статические переменые и статические методы.
 * Т.е. содержимое этого блока становится доступным, как только мы написали Класс.
 * Т.е. без создания объекта этого класса.
 * Всё содержимое static блока становится статическим !!!
 * Напомню, что финальной константе мы можем что то присвоить только один раз !!!
 * Это можно делать и в static блоке и снаружи.
 * */
public class StaticInits {

    private static final int NUM_SECOND_PER_HOUR;
    private static final int NUM;
    private static final int three = 3;


    static {
        int numSecondPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECOND_PER_HOUR = numMinutesPerHour * numSecondPerMinute;
        NUM = getNum();
    }

    private static int getNum() {
        return 55;
    }


    public static void main(String[] args) {
        System.out.println(StaticInits.NUM_SECOND_PER_HOUR);
        System.out.println(StaticInits.NUM);
        System.out.println(StaticInits.three);


    }
}
