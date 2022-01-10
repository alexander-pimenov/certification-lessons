package lesson2_2;

public class Swan {
    int numberEggs;

    public static void main(String[] args) {
        Swan swan = new Swan();
        swan.numberEggs = 7;
        System.out.println("кол-во яиц = " + swan.numberEggs);

        Swan newSwan = new Swan();
        System.out.println("кол-во яиц = " + newSwan.numberEggs);
    }
}
