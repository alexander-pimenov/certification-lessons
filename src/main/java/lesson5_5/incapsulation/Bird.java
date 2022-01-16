package lesson5_5.incapsulation;

/*Инкапсуляция - сокрытие данных в рамках одной сущности.*/
public class Bird {
    private int numberEggs;

    private boolean canFly;

    /*даем определенный доступ к полю numberEggs через сеттер*/
    public void setNumberEggs(int numberEggs) {
        //можем задать условие
        if (numberEggs < 0) {
            System.out.println("не может быть отрицательное число у количества яиц");
        } else {
            this.numberEggs = numberEggs;
        }
    }

    //в геттер также можно добавлять какую угодно логику
    public int getNumberEggs() {
        return numberEggs;
    }

    //для геттера с типом boolean подставляется в название
    //вопрос is: is-canFly, а не как в других типах get
    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
