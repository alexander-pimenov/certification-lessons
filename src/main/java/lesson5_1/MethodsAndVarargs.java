package lesson5_1;

public class MethodsAndVarargs {

    //В varargs может лежать неограниченное количество переменных, т.е. такой бесконечный массив,
    //поэтому varargs савится в конце аргументов !!!
    //Т.е. в аргумент передаем массив данных одного типа.
    //Varargs тоже типизированный.
    //Null в varargs нельзя передавать, т.к. получим NPE !!!
    //Один vararg на один метод !!! Хотя массивов в аргументе можем указать много !!!
    public static void walk1(int... nums) {
        System.out.println(nums.length);
    }

    public static void walk2(int start, int... nums) {
        System.out.println(nums.length);
    }

    //один vararg на один метод !!!
    //Vararg parameter must be the last in the list - does not compile
//    public void walk3(int... start, int... nums) {
//    }

    //один vararg на один метод !!!
    //Vararg parameter must be the last in the list - does not compile
//    public void walk4(int... nums, int... start) {
//    }

    public static void run(int... nums){
        //что то делаем со 2-м элементом из массива varargs
        //конечно нужно следить чтоб не получить java.lang.ArrayIndexOutOfBoundsException
        System.out.println(nums[1]);
    }

    //наш самый главный метод main тоже можно переписать через varargs
    //public static void main(String... args){}

    public static void main(String[] args) {
        walk2(1);
        walk2(1, 2);
        walk2(1, 2, 3);
        walk2(1, new int[]{4, 5, 6});

        //walk2(9, null); //NPE !!!

        run(11,22,33);

    }


}
