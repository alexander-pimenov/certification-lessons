import lesson2_2.Chicken;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        Chicken chicken = new Chicken("Max");

        System.out.println(chicken.getName());
        System.out.println(chicken);

        chicken = new Chicken("Bob");

        System.out.println(chicken.getName());
        System.out.println(chicken);


        LocalDate holiday = LocalDate.now();
        System.out.println(holiday);
//        holiday = LocalDate.now().plus(5, ChronoUnit.HOURS); //Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported unit: Hours
//        System.out.println(holiday);


        LocalDateTime holiday2 = LocalDateTime.now();
        System.out.println(holiday2);
        holiday2 = LocalDateTime.now().plus(5, ChronoUnit.HOURS);
        System.out.println(holiday2);

        Thread object = new Thread(new MultiThread());
        object.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread id: " + Thread.currentThread().getId());
        }

        MultiThreading thread = new MultiThreading();
        thread.start();
    }
}

class MultiThreading extends Thread {
    @Override
    public void run() {
        System.out.println("My thread " + Thread.currentThread().getId() + " is in running state.");
    }
}

class MultiThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
    }
}
