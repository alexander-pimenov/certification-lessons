package lesson5_4;

public class OverloadAndVarargs {

    public static void main(String[] args) {
        fly(new int[]{1, 2, 3}); //Метод с varargs
        fly(1, 2, 3); //Метод с varargs
    }

    public static void fly() {
    }

    // два одикаовых метода, различающихся по аргументу, но
    // один принимает varargs, а другой массив, не может быть !!!
    // это не однозначность.
    /*метод с varargs может на вход принимать несколько объектов чере запятую
     * и один массив !!!*/
    public static void fly(int... length) {
        System.out.println("Метод с varargs");
    }

    /*метод принимающий на вход массив может принять только один массив,
     * и он ничего о объектах через запятую не знает !!!*/
//    public static void fly(int[] length){
//            System.out.println("Метод с массивом");
//    }

}
