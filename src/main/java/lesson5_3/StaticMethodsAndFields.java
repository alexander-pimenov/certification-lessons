package lesson5_3;

public class StaticMethodsAndFields {
    /*Статический элементы в классе нужны для доступа к ним без создания объекта
     * этого класса. Это используется, например, при создании счетчика
     * созданных кобъектв класса или утилитного класса с
     * какими то нужными методами которые будут использовать многие
     * объекты других классов. */

    //static поле неразрывно связано с классом
    public static int count = 26;

    //static метод неразрывно связан с классом
    public static void main(String[] args) {
        System.out.println(count);
    }
}
