package lesson3_2;

public class WhileOp {

    int roomInBelly = 5; //объем живота)))

    public static void main(String[] args) {
        WhileOp whileOp = new WhileOp();
        whileOp.eatCheese(8);
    }
    //при использовании цикла while всегда нужно быть уверенными, что мы сможем выйти из этого цикла,а не зависнем в
    //бесконечном цикле

    private void eatCheese(int bitesOfCheese) { //bitesOfCheese - передаем какое то кол-во сыра
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }

        System.out.println(bitesOfCheese + " pieces of cheese left");
        System.out.println(roomInBelly + " places left in the stomach");

        if (bitesOfCheese == 0 && roomInBelly != 0) {
            System.out.println("The mouse is still hungry!!!");
        } else {
            System.out.println("The mouse is full!!!");
        }
    }
}
