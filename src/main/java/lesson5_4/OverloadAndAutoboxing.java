package lesson5_4;

/* Если будет четкое совпадение типов, то Java не захочет
 * делать никакой автобоксинг.
 * А если не будет такой возможноти, то сделает по наибольшей совместимости.
 * (из int в Integer и наоборот)*/
public class OverloadAndAutoboxing {

    public static void main(String[] args) {
        OverloadAndAutoboxing autoboxing = new OverloadAndAutoboxing();

        autoboxing.fly(10); //int
        autoboxing.fly(Integer.valueOf(10)); //Integer
//        autoboxing.fly(new Integer(10)); //или так
    }

    public void fly(int numMiles) {
        System.out.println("int");
    }

    public void fly(Integer numMiles) {
        System.out.println("Integer");
    }
}
