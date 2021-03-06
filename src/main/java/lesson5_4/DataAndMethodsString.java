package lesson5_4;

/*Здесь речь ведется о том, как передаются в Java параметры на вход:
 * - по ссылке или по значению !!!
 * Хотя там могут приходить и ссылочные типы,
 * Правильные ответ - ПО ЗНАЧЕНИЮ !!!
 * В метод мы передаем не саму ссылку, а её копию, которая также
 * ссылается на этот объект в памяти !!!
 *
 * 34 1 Передача данных между методами в Java
 * https://www.youtube.com/watch?v=YuhItH5wwvE&list=PLbarVm4RfajIKaF6P5J_GC54N-glT6VXM&index=102
 */
public class DataAndMethodsString {
    public static void main(String[] args) {
        //Стринги у нас имутабельны, об этом помним всегда!!!
        String name = "Matvey";

        //на вход передается копия ссылки name !!!
        //при этом эта копия содержит адрес на "Matvey" !!!
        speak(name); //здесь метод работает в холостую как и с примитивами
        System.out.println(name);

        //Если мы хотим, что бы наша ссылка внутри основного метода тоже изменилась, то
        //как и в примитивах нужно ей присвоить возвращаемое значение:
        name = speak(name);
        System.out.println(name);
    }

    private static String speak(String name) {
        System.out.println(name);
        // здесь мы нашей копии ссылки name присвоим другой объект name = "Marat 444" !!!
        // А сучетом работы со Стрингом, мы вообще получаем другой объект Стринг, а не меняем предыдущий !!!
        // При этом внешняя ссылка, которая осталась вне метода,
        // в основном методе, ни как не измениться , т.е. будет продолжатьссылаться на "Matvey",
        // если мы конечно не прсвоим ей возвращаемое значение из жтого метода !!!
        name = "Marat" + " 444";
        return name;
    }
}
