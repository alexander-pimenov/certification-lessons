package lesson5_2.zoo3;

import lesson5_2.zoo2.Bird;

public class Swan extends Bird {

    /*Swan как бы по умолчанию уже имеет поле text и метод floatInWater(),
     * поэтому может их легко использовать.*/

    /*Для потомка protected поля и методы, это как свои собственные
     * и у него к ним есть полный доступ. Т.е. Swan легко обратится к
     * protected полям и методам Bird, т.к. Swan потомок Bird.*/
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    /*Для потомка protected поля и методы, это как свои собственные
     * и у него к ним есть полный доступ. Т.е. Swan легко обратится к
     * protected полям и методам Bird, т.к. Swan потомок Bird.*/
    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }


    /*Проблемы использования protected методов и полей показаны в этом методе.*/
    public void helpOtherBirdSwim() {

        /*Здесь мы создаем объект другого класса. Нам не известно, что
         * он предок. И дальше пытаемся запросить у этого объекта поля и методы,
         * которые protected. Но мы уже даже в другом пакеты.*/

        Bird other = new Bird();
//        other.floatInWater();
//        System.out.println(other.text);

    }

        /* Чтобы избежать такой ситуации (когда мы пытаемся мы у потомка создаем экземпляр
        предка и пытаемся получить доступ к protected полям/методам) наилучшим вариантом
        будет перенести такой метод (helpOtherBirdSwim) в родительский класс и сделать его
        protected/public в зависимости от того, где планируем его вызывать.
        Эта проблема относится к проблемам проектирования структуры/взаимодействия
        классов (т.е. архитектуры приложения в целом) .*/

}
