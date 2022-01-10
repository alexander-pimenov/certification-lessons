package lesson4_2;

import java.util.function.Predicate;

public class SBMutabilityAndChaining {
    public static void main(String[] args) {
        //Создать StringBuilder можно по разному
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("word");
        //StringBuilder можно создать и с размеров капасити ,т.е. ячейки под слово
        StringBuilder sb3 = new StringBuilder(10);

        //
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");
        StringBuilder same = sb.append("+end");
        System.out.println(sb);
        System.out.println(same);
        System.out.println(sb == same); //true - две ссылки указывают на один объект в памяти

        //с этим нужно быть осторожными, т.к. один объект, а две ссылки на него, т.е.
        //объект может быть быть изменен из двух мест!!!

        same.append("+something");
        System.out.println(sb);

        //Цепочка
        StringBuilder sb4 = new StringBuilder("start");
        sb4
                .append("+middle")
                .append("+end")
                .append("+something");
        System.out.println(sb4);


    }
}
