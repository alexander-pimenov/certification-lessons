package lesson5_1;

public class AccessModifiers {

    //public
    //package-private
    //protected
    //private

    //этот метод виден по всей системе
    public void walk1() {
        System.out.println(walk4() + "public");
    }

    //этот метод виден только в пакете, где лежит класс
    void walk2() {
        System.out.println(walk4() + "package-private");
    }

    //этот метод виден только в пакете, где лежит класс и у его наследников по всей системе
    protected void walk3() {
        System.out.println(walk4() + "protected");
    }

    //этот метод виден только в самом классе (нужен для реализации бизнес-логики)
    private String walk4() {
        return "Метод с доступом ";
    }
}
