package lesson4_1;

public class ConcatString {
    public static void main(String[] args) {

        String str1 = "Hi"; //в пуле стрингов
        String str2 = new String("Hi"); //в хипе
        //конкатенация
        int x = 5;
        int y = 4;
        System.out.println("1" + "2" + x + y); //1245
        System.out.println("1" + "2" + (x + y)); //129
        System.out.println(x + y + "1" + "2"); //912
        System.out.println(x + y + "1" + "2" + x + y); //91245


    }
}
