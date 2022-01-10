package lesson3_2;

public class ForEachLoop {
    public static void main(String[] args) {

        final String[] myArray = new String[3];
        myArray[0] = "Lisa";
        myArray[1] = "Kelvin";
        myArray[2] = "Roger";

        for (String name:myArray){
            System.out.print(name + ", ");
        }
        System.out.println();

        //старая запись, до foreach
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + ", ");
        }
    }
}
