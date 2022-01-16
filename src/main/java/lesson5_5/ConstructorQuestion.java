package lesson5_5;

/*this. - обозначает, что используем поле нашего класса, так удобно различать,
 когда одинаковые имена аргументов в конструкторе и имена полей класса.
 Это для нас более наглядно, ну и для компилятора мы явно указываем.
* Если имена разные, то можно this не ставить.*/
public class ConstructorQuestion {

    private String color;
    private int height;
    private int length;

    public ConstructorQuestion(int length, int theHeight) {
        this.length = length;
        height = theHeight;
        this.color = "белый";
    }

    public static void main(String[] args) {
        ConstructorQuestion cQuestion = new ConstructorQuestion(1, 2);
        System.out.println(cQuestion.length
                + " " + cQuestion.height + " " + cQuestion.color);
    }
}
