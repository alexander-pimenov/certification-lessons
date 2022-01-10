package lesson5_1.test;

import lesson5_1.AccessModifiers;

public class AccessModifiersExt extends AccessModifiers {
    @Override
    public void walk1() {
        System.out.println("Переопределенный в AccessModifiersExt метод public walk1()");
    }

    @Override
    protected void walk3() {
        System.out.println("Переопределенный в AccessModifiersExt метод protected walk3()");
    }
}
