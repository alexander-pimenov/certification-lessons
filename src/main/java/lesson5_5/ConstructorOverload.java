package lesson5_5;

import jdk.swing.interop.SwingInterOpUtils;

/*Здесь мы рассмотрим перегрузки конструкторов.
 * И цепочки конструкторов - 'constructor chain'.
 * Чтобы внутри одного конструтора вызвать другой конструктор этого же класса
 * просто нужно использовать ключевое слово this() !!!
 * !!! ВАЖНО - this() - МОЖЕТ ИДТИ ТОЛЬКО ПЕРВОЙ СТРОКОЙ !!!
 * И в него уже передать параметры.
 * Тут показан пример, в котором при создании любого медведя (только с именем, или
 * с именем и возрастом) будет отрабатывать цепочка из 3-х имеющихся конструкторов*/
public class ConstructorOverload {

    public static void main(String[] args) {

        //здесь вызовутся все 3 консруктора
        Bear bear1 = new Bear("Потапыч");
        System.out.println(bear1);

        //здесь вызовутся 2 консруктора
        Bear bear2 = new Bear("Боря", 2);
        System.out.println(bear2);

        //здесь вызовется только 1 консруктор (с 3-мя аргуметами)
        Bear bear3 = new Bear("Даша", 3, 30);
        System.out.println(bear3);


        //c o n s t r u c t o r - 3 args
        //c o n s t r u c t o r - 2 args
        //c o n s t r u c t o r - 1 args
        //Bear{name='Потапыч', age=0, weight=20}
        //c o n s t r u c t o r - 3 args
        //c o n s t r u c t o r - 2 args
        //Bear{name='Боря', age=2, weight=20}
        //c o n s t r u c t o r - 3 args
        //Bear{name='Даша', age=3, weight=30}
    }
}

/*Класс Bear - нужно создавать Медведя но обязательно со всеми полями.
 * Даже если мы не укажем некоторых полей, то установим им значения по умолчанию.*/
class Bear {
    private String name;
    private int age;
    private int weight;

    //так можно позволить создавать медведя только с именем
    //но так идет дублирование кода, т.к. уже есть конструктор
    //создающий медведя с именем и возрастом
    //смортри пример ниже с this()
    /*public Bear(String name) {
        this.name = name;
        //а возраст задаем 0
        this.age = 0;
    }*/

    //так можно использовать цепочку конструкторов
    public Bear(String name) {
        this(name, 0); //т.е. вызываем конструктор это же класса но с другими аргументами
        System.out.println("c o n s t r u c t o r - 1 args");
    }

    //так можно создавать медведя с именем и возрастом, а вес будет ставится по умолчанию 20
    public Bear(String name, int age) {
        this(name, age, 20);
        System.out.println("c o n s t r u c t o r - 2 args");
    }

    public Bear(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("c o n s t r u c t o r - 3 args");
    }

    @Override
    public String toString() {
        return "Bear{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
