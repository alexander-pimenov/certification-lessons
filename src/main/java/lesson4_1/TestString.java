package lesson4_1;

public class TestString {
    public static void main(String[] args) {

        String name = new String("Пушистик"); //создается объект в хипе
        String name1 = "Пушистик"; //такой объект создается и помещается в пул стрингов
        String name2 = "Пушистик"; //это объект взят из пула стрингов, т.е name2 и name1 ссылаются на один и тот же объект (адресс один и тот же). Так экономится память
        String name3 = new String("Пушистик"); //опять создается объект в хипе
        //это видно из сравнения ссылок:
        System.out.println(name1 == name2); //true
        System.out.println(name == name3); //false

        //По хеш-кодам видим, что объекты (по наполнению) одинаковы!!
        System.out.println(Integer.toHexString(name.hashCode())); //15d88cd7
        System.out.println(Integer.toHexString(name1.hashCode())); //15d88cd7
        System.out.println(Integer.toHexString(name2.hashCode())); //15d88cd7
        System.out.println(Integer.toHexString(name3.hashCode())); //15d88cd7

        //Стринг имутабельный и после создания он не может заменять содержимое!!!
        //Т.е. какой его создали изначально, то такой он и будет!!!
        //s2, s3 - создаются новые объекты
        String s1 = "1";
        String s2 = s1.concat("2");
        String s3 = s2.concat("3");
        System.out.println(s2); //s2=12
        System.out.println(s3); //s3=123
        s2 = s2.concat("3");
        System.out.println(s2); //s2=123 - переприсвоили ссылку на объект

        System.out.println(Integer.toHexString(s2.hashCode())); //be32
        System.out.println(Integer.toHexString(s3.hashCode())); //be32



    }
}
