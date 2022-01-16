package lesson5_5.incapsulation;

/*Класс который управляет нашей Bird*/
public class BirdService {
    public static void main(String[] args) {

        Bird bird = new Bird();

        bird.setNumberEggs(-5);
        System.out.println(bird.getNumberEggs());

        bird.setNumberEggs(5);
        System.out.println(bird.getNumberEggs());
    }
}
