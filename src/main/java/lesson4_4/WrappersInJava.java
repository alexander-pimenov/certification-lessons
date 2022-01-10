package lesson4_4;

public class WrappersInJava {
    public static void main(String[] args) {

        boolean b = true;
        Boolean aBoolean = Boolean.TRUE; // - делай так
        //Boolean aBoolean = new Boolean(true); - это устаревшая запись

        byte b1 = 1;
        Byte aByte = (byte) 1; // - делай так
//        Byte aByte = new Byte((byte) 1); // - это устаревшая запись

        short s = 1;
        Short aShort = (short) 1;
//        Short aShort = new Short((short) 1);

        int i = 1;
        Integer integer = 1;
//        Integer integer = new Integer(1);
        int maxValue = Integer.MAX_VALUE;
        System.out.println(maxValue); //2147483647

        long l = 1L;
        Long aLong = 1L;
//        Long aLong = new Long(1);

        float f = 1.0f;
        Float aFloat = 1.0F;
//        Float aFloat = new Float(1.0);

        double d = 1.0;
        Double aDouble = 1.0;
//        Double aDouble = new Double(1.0);

        char c = 'a';
        Character character = 'a';
//        Character character = new Character('a');

        // parseInt - преобразует из стринга в примитив
        // valueOf - преобразует из стринга в класс обертку

        int primitive = Integer.parseInt("123");
        //не всегда, когда делаем valueOf мы создаем новый объект Integer,
        //какие то значения мы берем из кеша интов (от -128 до 127)
        Integer wrapper = Integer.valueOf("123");
        Integer wrapper2 = 123;
        System.out.println(wrapper==wrapper2); //true !!! т.к. эти ссылки указывают на один объект в кеше интов!!!

        Integer wrapper3 = Integer.valueOf("129");
        Integer wrapper4 = 129;
        System.out.println(wrapper3==wrapper4); //false !!! т.к. эти ссылки указывают уже на разные объекты в памяти!!!






    }
}
