package lesson5_5.immutable;

/*Пример изменяемого (not immutable) класса.
 *  втаком примере мы не получим неизменяемый объект, хотя у нас и нет сеттера !!!*/
public class NotImmutableSb {
    private StringBuilder builder;

    public NotImmutableSb(StringBuilder builder) {
        this.builder = builder;
    }

    public StringBuilder getBuilder() {
        return builder;
    }
}
