package lesson5_3;

public class StaticAndInstance {

    //не статик поле - будет создано только тогда, когда создасться объект этого класса (через new)
    private String name = "Static class";

    //статические методы - доступны из класса, без создания объекта класса
    public static void first() { }
    public static void second() { }

    //не статик метод - будет создан только тогда, когда создасться объект этого класса (через new)
    public void third() {
        System.out.println(name);
        main(new String[0]); //статик метод доступен в нестатик методах, т.к. к ним есть доступ и без создания объекта
    }

    public static void main(String[] args) {
        first();
        second();

        //из статик метода main мы не сможем обратиться к нестатик методам или
        //полям, т.к. их еще нет в памяти объекта. И они будут созданы только тогда, когда будет создан
        //объект этого класса.
//        third();

        StaticAndInstance staticAndInstance  = new StaticAndInstance();
        staticAndInstance.third();
    }



}
