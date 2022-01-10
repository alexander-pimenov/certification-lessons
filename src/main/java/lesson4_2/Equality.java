package lesson4_2;

public class Equality {
    public static void main(String[] args) {
        //равенство StringBuilder
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("a");
        //сравним объекты по ссылке
        System.out.println(one==two); //false
        System.out.println(one==three); //true

        //равенство String
        String x = "Hello"; //"Hello" создали и поместили в пул стрингов
        String y = "Hello"; //используем "Hello" из пула стрингов, поэтому y ссылается на тот же объект, что и x
        System.out.println(x==y); //true

        String x2 = new  String("Hello"); //"Hello" создали где то в памяти
        String y2 = "Hello"; //используем "Hello" из пула стрингов
        System.out.println(x==y); //false

        //сравним по содержимому Стринги
        //В String equals() уже переопределен
        String x3 = "Hey";
        String y3 = "  Hey  ".trim(); //создали и поместили в пул, потом сделали trim() и создался новый объект String где то уже в памяти
        System.out.println(x3.equals(y3)); //true

        //сравним по содержимому StringBuilder
        //В StringBuilder equals() НЕ переопределен
        //т.е. он по умолчанию сравнивает ссылки!!! (так приходит от Object)
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb1.equals(sb2)); //false

        //т.е. для StringBuilder одинаково происходит сравнение, что через == или метод equals()

        //equals в StringBuilder приходит от Object:
        //public boolean equals(Object obj) {
        //    return (this == obj); //сравнение ссылок
        //}

        //Чтобы сравнить StringBuilder по содержимому нужно перевести их в объекты String
        //и сравнить через equals()
        System.out.println(sb1.toString().equals(sb2.toString())); //true



    }
}
