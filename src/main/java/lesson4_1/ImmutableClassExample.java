package lesson4_1;

/*
Это пример класса из которого получаются неизменяемые объекты,
 т.е. объекты этого класса после их создания не могут быть изменены!!!
 */
public class ImmutableClassExample {
    private String name;

    public String getName() {
        return name;
    }
}
