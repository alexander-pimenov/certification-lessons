package lesson5_1;

import java.lang.reflect.Method;

public class AppMain {
    public static void main(String[] args) {
        AccessModifiers accessModifiers = new AccessModifiers();

        //Проверим с помощью рефлексии, какие у класса AccessModifiers есть вообще методы в классе
        getNameMethods(AccessModifiers.class);

        //видим, что мы можем добраться до public walk1, package-private walk2, protected walk3 !!!
        //но не до private walk4!!!
        accessModifiers.walk1();
        accessModifiers.walk2();
        accessModifiers.walk3();
    }

    /*Напечатаем все существующике в классе методы.*/
    private static <T> void getNameMethods(Class<T> implClass) {
        Method[] declaredMethods = implClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName());
        }
    }
}
