package lesson5_3;

import java.util.ArrayList;

/*Еще расмотрим примеры применения статических счетчиков*/
public class StaticVars {

}

class Initializer1 {
    private static int counter = 0;
}

class Initializer2 {
    //NUM_BUCKETS - это интовая КОНСТАНТА и она всегда будет одинаковая!!! Не изменяема!!!
    //НИГДЕ дальше в коде мы не можем её поменять , т.е. дать ей другое значение !!!

    //   private static final int NUM_BUCKETS = 45;
    private static final Integer NUM_BUCKETS = 45;

    public static void main(String[] args) {
        //NUM_BUCKETS = 5; // так нельзя делать, т.к. это константа !!!
    }
}

class Initializer3 {
    //здесь final обозначает следующее -
    //мы к нашей ссылке values НЕ МОЖЕМ ПРИСВОИТЬ НИЧЕГО ДРУГОГО !!!
    //т.е. ссылка values, из-за final, ни на какой другой объект смотреть уже не может!!!
    //т.е. другой ArrayList к values присвоить не можем.
    //Но ArrayList не становиться от этого неизменеемым !!!
    //Сам ArrayList внутри себя содержит ссылки на другие объекты !!!
    //И как раз внутри ArrayList мы можем и добавлять и удалять объекты !!!
    //Тут final нам не запрещает ничего делать !!!
    //В данном случае это ни как не противоречит !!!

    //final работает не с объектом в памяти, а со ссылкой на объект!!!
    //И означает, что к этой ссылке мы ничего другого присвоить не можем!!!

    private static final ArrayList<String> values = new ArrayList<String>();

    public static void main(String[] args) {
        values.add("Hey!");
        //values = new ArrayList<>(); //- ОШИБКА !!!
    }
}

class Initializer4 {
    //final работает не с объектом в памяти, а со ссылкой на объект!!!
    //И означает, что к этой ссылке мы ничего другого присвоить не можем!!!

    //как с константами числами так и с константами строками - нельзя им присваивать новые значения !!!

    private static final String VALUE = "CONSTANTA";

    public static void main(String[] args) {
        //VALUE = "NEW_CONSTANTA"; //ОШИБКА
    }
}

class Initializer5 {
    //final работает не с объектом в памяти, а со ссылкой на объект!!!
    //И означает, что к этой ссылке мы ничего другого присвоить не можем!!!

    //Но по аналогии с ArrayList ИЗМЕНЯТЬ StringBuilder можем !!!

    private static final StringBuilder VALUE = new StringBuilder("CONSTANTA");

    public static void main(String[] args) {
        System.out.println(VALUE.toString());
        VALUE.append("_Adding something_");
        System.out.println(VALUE.toString());
    }
}

