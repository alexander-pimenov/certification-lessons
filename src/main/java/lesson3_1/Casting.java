package lesson3_1;

public class Casting {
    public static void main(String[] args) {
        int x = (int) (1.0 + 3.0);
        short s = (short)195159;
        int f = (int)9f;
        long t = 1951951951951951159L;
        int maxInt = 2147483647; // = 0x7fffffff
        System.out.println(maxInt); //2147483647
        System.out.println(maxInt+1); //-2147483648 перелилось через край и ушло в min отрицательное
        System.out.println(maxInt+9); //-2147483640

        int minInt = -2147483647;
        System.out.println(minInt - 5); //2147483644 переполнение в обратную сторону

    }
}
