package lesson3_1;

public class LogicalOperators {
    Boolean aBoolean;

    //Одиночные - вычисляются оба аргумента
    // & - AND
    // | - INCLUSIVE OR
    // ^ - EXCLUSIVE OR - true только тогда, когда значения наших элементов не совпадает

    //Двойные - вычисляется только первая часть если она true. Чтобы н тратить ресурсы.
    // && - AND
    // || - INCLUSIVE OR

    public static void main(String[] args) {
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        LogicalOperators logicalOperators1 = new LogicalOperators();
        LogicalOperators logicalOperators2 = new LogicalOperators();

        logicalOperators1.aBoolean = false;

        //проверяем оба оператора
//        if(logicalOperators1.aBoolean & logicalOperators2.aBoolean){ //NPE - logicalOperators2.aBoolean не создан!!!
//            System.out.println("Hello!!!");
//        }

        if(logicalOperators1.aBoolean && logicalOperators2.aBoolean){ //тут NPE не будет, т.к. проверится только первая часть!!!
            System.out.println("Hello!!!");
        }

    }

}
