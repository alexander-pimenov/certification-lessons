package lesson5_5;

/*Финальные поля - это такие поля к которым после инициализации ничего
 * другого присвоить нельзя !!!
 * Т.е. что присвоили у этой ссылке ивсё, больше ничего потом не присваиваем !!!*/
public class FinalFieldsAndConstr {

    private final int volume;
    private final String name = "The Mouse House";

    public FinalFieldsAndConstr(int length, int width, int height) {
        this.volume = length * width * height;
    }

    public static void main(String[] args) {

    }
}
