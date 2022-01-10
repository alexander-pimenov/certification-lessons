package lesson3_1;

public class IncrAndDecr {
    public static void main(String[] args) {
        //Инкремент и Декремент
        int v = 3;
        //Инкремент и Декремент это самые приоритетные действия, т.е. они выполняются до умножения
        int n = ++v * 5 / v-- + --v;
        //        4       4       2
        System.out.println("v is " + v); //2
        System.out.println("n is " + n); //7
    }
}
