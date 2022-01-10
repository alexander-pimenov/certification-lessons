package lesson5_2.zoo2;

import lesson5_2.zoo1.Bear;

public class LittleBear extends Bear {

    public static void main(String[] args) {
        LittleBear littleBear = new LittleBear();
        littleBear.doBearStuff(); //protected метод
    }

}
