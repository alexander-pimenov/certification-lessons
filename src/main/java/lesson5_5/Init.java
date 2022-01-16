package lesson5_5;

/*Порядок инициализации сущности.
 * 36 5 Порядок инициализации с учетом статики в Java
 * https://www.youtube.com/watch?v=itjDWoczemo&list=PLbarVm4RfajIKaF6P5J_GC54N-glT6VXM&index=110
 */
public class Init extends AncestorInit{

    //1. Если есть предок - первым инициализируется предок.

    //2. Далее инициализируются статические переменные и
    // статические инициалиаторы (блоки static { }),
    // именно в том порядке, в каком они указаны в файле.

    //3. Переменные и инициализаторы (блок { }) сущности.

    //4. Конструктор.

    private String name = "Aziz";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Init() {
        System.out.println("c o n s t r u c t o r");
    }
}

class AncestorInit{
    private static int num = 20;
    static {
        System.out.println(num);
    }
    public AncestorInit() {
        System.out.println("ancestor constructor");
    }
}

class TestInit{
    public static void main(String[] args) {
        Init init = new Init();

    }
}
//20
//0
//10
//ancestor constructor
//Aziz
//c o n s t r u c t o r
