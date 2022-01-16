package lesson5_4;

/*
 * Создаются различные похожие методы.
 * Имеют одинаковое имя, а тип и количество входных аргументов другие !!!.
 * И это назывется перегрузкой метода !!!
 * Если отличается возвращаемый тип, то это не называется перегрузкой метода.
 * Так же не работает, если методы отличаются только по static.
 * */
public class Overloading {

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        //автоматом вызовется метод с int
        overloading.fly(3);

        //нужно кастовать, чтобы вызвать метод с short и с byte,
        //т.к. любое число (byte, short, int) воспринимается как int, ну разве если
        //только оно не больше int
        overloading.fly((short) 8);
        overloading.fly((byte) 8);
    }

    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(short numFeet) {
        System.out.println("short");
    }

    public void fly(byte numMiles) {
        System.out.println("byte");
    }

    public boolean fly() {
        return false;
    }

    public void fly(int numMiles, short numFeet) {
    }

    public void fly(short numFeet, int numMiles) throws Exception {
    }

    public static void fly(short numFeet, String name) {
    }


}
