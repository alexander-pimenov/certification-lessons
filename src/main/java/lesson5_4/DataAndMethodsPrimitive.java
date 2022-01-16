package lesson5_4;

/*Здесь речь ведется о том, как передаются в Java параметры на вход:
 * - по ссылке или по значению !!!
 * Хотя там могут приходить и ссылочные типы,
 * Правильные ответ - ПО ЗНАЧЕНИЮ !!!
 * В метод мы передаем не саму ссылку, а её копию, которая также
 * ссылается на этот объект в памяти !!!
 *
 * 34 1 Передача данных между методами в Java
 * https://www.youtube.com/watch?v=YuhItH5wwvE&list=PLbarVm4RfajIKaF6P5J_GC54N-glT6VXM&index=102*/
public class DataAndMethodsPrimitive {

    public static void main(String[] args) {
        int num = 4;
        newNumber(num); //в таком виде этот метод работает в холостую, он на значение num ни как не влияет.

        //Что бы он влиял на num, нужно к num присвоить возвращаемое значение !!!
        num = newNumber(num);

        System.out.println(num);
    }

    private static int newNumber(int num) {
        return num = 8 * num;
    }
}
