package lesson5_3;

public class StaticInAction {
    public static void main(String[] args) {

        //обратимся к статическим элементам класса не создавая объекта этого класса:
        System.out.println(StaticMethodsAndFields.count);
        StaticMethodsAndFields.main(new String[0]);

        //обратимся к статическим элементам класса предварительно создав объект этого класса:
        StaticMethodsAndFields ourClass = new StaticMethodsAndFields();
        System.out.println(ourClass.count);
        //присвоим нашей ссылке на объект null, т.е. она уже не будет ссылаться на объект
        ourClass = null;
        //но она по прежнему остается типа StaticMethodsAndFields, т.е. имеет доступ к классу
        //т.к. статические поля и методы, это сущности принадлежащие классу, и к
        //ним можно дойти не имея объекта !!!
        System.out.println(ourClass.count); //

        //Попробуем изменить значение статического поля класса
        StaticMethodsAndFields.count = 4; //изменили значение с 26 написанного в классе на 4
        //И теперь для нижних объектов ourClass1, ourClass2 поле count=4
        StaticMethodsAndFields ourClass1 = new StaticMethodsAndFields();
        StaticMethodsAndFields ourClass2 = new StaticMethodsAndFields();
        ourClass1.count = 6;
        ourClass2.count = 17;
        //а теперь по последнему изменению мы получим значение поля count=17
        //Не важно через какой объект или просто через класс будет изменено это поле,
        //оно изменится во всех объектах этого класса !!!
        System.out.println(StaticMethodsAndFields.count); //17
        System.out.println(ourClass1.count); //17
        System.out.println(ourClass2.count); //17



    }
}
