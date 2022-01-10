package lesson3_2;

public class SwitchSt {
    public static void main(String[] args) {

        int dayOfWeek = 6;

        //в аргумент switch могут передаваться только:
        //int and Integer, byte and Byte, short and Short, char and Character,
        //long and Long, String, enum Value
        //другие типы нельзя использовать
        switch (dayOfWeek) {
            //default - может стоять абсолютно в любом месте
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
