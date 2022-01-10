package lesson5_2;

import lesson5_2.zoo1.Bear;
import lesson5_2.zoo2.LittleBear;

public class ZooOwner {
    public static void main(String[] args) {
        Bear bear = new Bear();
        String name = bear.name;

        bear.feedBear("Salmon");

        LittleBear littleBear = new LittleBear();
        littleBear.feedBear("Cookie");
    }
}
