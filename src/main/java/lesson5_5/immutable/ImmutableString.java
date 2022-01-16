package lesson5_5.immutable;

/*Пример, как получить неизменяемый класс.
 * Использовать в полях неизменяемый String.
 */
public class ImmutableString {
    private String builder;

    public ImmutableString(String builder) {
        this.builder = builder;
    }

    public String getBuilder() {
        return builder;
    }
}
