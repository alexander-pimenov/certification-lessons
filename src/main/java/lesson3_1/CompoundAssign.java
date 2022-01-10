package lesson3_1;

public class CompoundAssign {
    //Сложные операторы присваивания
    //Но тут нужно быть внимательными с автоматическим кастингом
    public static void main(String[] args) {
        int zooKeeper = 3;
        int crocodile = 2;

        //Эквивалентные записи:
        zooKeeper *= crocodile; //zooKeeper = zooKeeper * crocodile; //6

        zooKeeper -= crocodile; //zooKeeper = zooKeeper - crocodile; //1

        zooKeeper += crocodile; //zooKeeper = zooKeeper + crocodile; //5

        zooKeeper /= crocodile; //zooKeeper = zooKeeper / crocodile; //1

        System.out.println(zooKeeper);

        int t = 17;
        long l = 22L;

//        t = t + l; //здесь будет ошибка компиляции, т.к. промоушен идет к long, а t это int
        //это превращается в такой вид:
        t = (int) (t + l);

        t += l; //а здесь будет автоматический кастинг к int

    }
}
