package lesson4_1;

/*
Это пример класса из которого получаются изменяемые объекты,
т.е. объекты этого класса после их создания могут быть изменены!!!
 */
public class MutableClassExample {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newString) {
        this.name = newString;
    }
}
