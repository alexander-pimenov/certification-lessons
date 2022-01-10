package lesson4_2;

public class SBMethods {
    public static void main(String[] args) {

        //StringBuilder append(String str)
        StringBuilder sb = new StringBuilder("animals");

        sb.append("A")
                .append("--")
                .append(11) //11 - будет конкатенироваться, т.е. превратится в строковое значение
                .append("--")
                .append(true); //true - будет конкатенироваться, т.е. превратится в строковое значение

        System.out.println(sb);

        //insert() - вставить по какому то индексу что-то, т.е. добавляет символы в нужное место
        StringBuilder sb2 = new StringBuilder("animals");
        System.out.println(sb2.length());
        sb2.insert(0,"-----");
        sb2.insert(3,"ZZ");

        System.out.println(sb2); //---ZZ--animals
        System.out.println(sb2.length());

        //StringBuilder delete(int start, int end)
        //StringBuilder deleteCharAt(int index)
        StringBuilder sb3 = new StringBuilder("animals");
        sb3.delete(1,4);
        System.out.println(sb3);

        sb3.deleteCharAt(2);
        System.out.println(sb3);

        //StringBuilder reverse()
        StringBuilder sb4 = new StringBuilder("animals");
        sb4.reverse();
        System.out.println(sb4);

        //StringBuilder toString() - что бы можно было StringBuilder поместить в String
        //toString() создаст в памяти объект String
        StringBuilder sb5 = new StringBuilder("animals");
        String str = sb5.toString();
        System.out.println(sb5.getClass());
        System.out.println(str.getClass());



    }
}
