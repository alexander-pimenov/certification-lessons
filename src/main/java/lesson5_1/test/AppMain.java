package lesson5_1.test;

import lesson5_1.AccessModifiers;

import java.lang.reflect.Method;

public class AppMain {
    public static void main(String[] args) {

        //создаем объект класса AccessModifiers
        AccessModifiers accessModifiers = new AccessModifiers();

        //Проверим с помощью рефлексии, какие у класса AccessModifiers есть вообще методы в классе
        getNameMethods(AccessModifiers.class);

        //видим, что мы можем добраться только до public метода walk1 !!!
        accessModifiers.walk1();

        //
        AccessModifiersExt accessModifiersExt = new AccessModifiersExt();
        getNameMethods(AccessModifiersExt.class);
        accessModifiersExt.walk1();
        accessModifiersExt.walk3();
    }

    /*Напечатаем все существующике в классе методы.*/
    private static <T> void getNameMethods(Class<T> implClass) {
        Method[] declaredMethods = implClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
    }
}
