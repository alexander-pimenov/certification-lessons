package lesson5_2.zoo1;

public class ZooKeeper {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.favoriteToy = "мячики";
        System.out.println(bear.favoriteToy);

        bear.feedBear("Carrot");
        String status = bear.sleep(5);
        System.out.println(status);
    }
}
