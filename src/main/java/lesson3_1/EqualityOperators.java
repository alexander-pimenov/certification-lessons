package lesson3_1;

import java.io.File;

public class EqualityOperators {

    // ==
    // примитивы
    // булево
    // объекты, null (пустые ссылки) и Стринги
    // !!! Через == сравниваем ССЫЛКИ на объекты, а не сами ОБЪЕКТЫ!!!
    //Так что через == сравниваем только примитивы!!!
    //А через == можно сравнить ссылки на объекты!!!

    public static void main(String[] args) {

        int o = 12;
        int p = 12;
        System.out.println(o == p);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 == b2);
        System.out.println(b1 != b2);

        ///////////////////////////////////////
        //Сравниваем через == ссылки на объекты!!! Ссылка - это есть адрес на объект.
        File file1 = new File("myFile.txt");
        File file2 = new File("myFile.txt");
        File file3 = file1;
        System.out.println(file1 == file2); //false
        System.out.println(file1 == file3); //true

        System.out.println(file1.equals(file2)); //true

        ////////////////////////////////////////
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str1==str2); //true - т.к. указывает на один объект в пуле Стрингов!!!
        System.out.println(str1==str3); //false - т.к. через new String будет создан объект в хипе
        // и str1 и str3 указывают на разные объекты!!!
        //это тоже нужно понимать!!!
        //Стринги на равенство нужно также сравнивать через equals()
        System.out.println(str1.equals(str2));

    }
}
