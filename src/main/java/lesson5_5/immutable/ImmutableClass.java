package lesson5_5.immutable;
/*Пример неизменяемого (immutable) класса.
* Создаем объек с определенным параметром.
* Количество numberEggs мы можем только узнавать, но изменять его не
* можем (есть геттеры, но нет сеттеров)
* Так можно делать с примитивами и иммутабельными объектами.*/
public class ImmutableClass {
    private int numberEggs;

    public ImmutableClass(int numberEggs) {
        this.numberEggs = numberEggs;
    }

    public int getNumberEggs() {
        return numberEggs;
    }
}
