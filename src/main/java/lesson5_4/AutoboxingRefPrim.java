package lesson5_4;

public class AutoboxingRefPrim {
    public static void main(String[] args) {
           AutoboxingRefPrim ref = new AutoboxingRefPrim();
           ref.fly("test");
           ref.fly(123);
           ref.fly2(56);
           ref.fly2(56L);

    }

    //если раскомменитровать, то "test" будет подставлен в более
    //подходящий аргумент, как Стринг.
    /*public void fly(String s){
        System.out.println("Стринг ");
    }*/

    public void fly(Object o){
        System.out.println("Объект ");
    }

    public void fly2(int i){
        System.out.println("int ");
    }

    public void fly2(long l){
        System.out.println("long ");
    }

}
