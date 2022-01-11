package lesson5_3;

/*Пример наиболее часто используемого применения
 * статических переменных: счетчик созданных объектов класса. */
public class Counter {
    private static int count;

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        System.out.println(counter1.count);

        Counter counter2 = new Counter();
        System.out.println(counter2.count);

        Counter counter3 = new Counter();
        System.out.println(counter3.count);

        Counter counter4 = new Counter();
        System.out.println(counter4.count);

        //эта переменная для всех 4-х объектов общая - она едина для всех объектов!!!

        System.out.println(count);
        System.out.println(counter1.count);
        System.out.println(counter2.count);
        System.out.println(counter3.count);
        System.out.println(counter4.count);
    }
}
